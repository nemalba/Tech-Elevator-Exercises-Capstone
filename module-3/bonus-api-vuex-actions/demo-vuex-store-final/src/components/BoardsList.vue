<template>
  <div id="sideNav">
    <h1>My Kanban Boards</h1>
    <div class="boards">
      <div class="status-message error" v-show="errorMsg !== ''">{{errorMsg}}</div>

      <loading-image v-if="isLoading"></loading-image>
      <router-link :to="{ name: 'Board', params: { id: board.id } }"
        class="board"
        v-for="board in this.$store.state.boards"
        v-bind:key="board.id"
        v-bind:style="{ 'background-color': board.backgroundColor }"
        v-else
        tag="div"
      >
        {{ board.title }}
      </router-link>

      <button class="btn addBoard" v-if="!isLoading && !showAddBoard" v-on:click="showAddBoard = !showAddBoard">Add Board</button>
      
      <form v-if="showAddBoard">
        Board Title:
        <input type="text" class="form-control" v-model="newBoard.title" />
        Background Color:
        <input type="text" class="form-control" v-model="newBoard.backgroundColor" />
        <button class="btn btn-submit" v-on:click.prevent="saveNewBoard">Save</button>
        <button class="btn btn-cancel" v-on:click="showAddBoard = !showAddBoard">Cancel</button>
      </form>
    </div>
  </div>
</template>

<script>
import LoadingImage from "./LoadingImage";

export default {
  components: {
    LoadingImage
  },
  data() {
    return {
      isLoading: true,
      showAddBoard: false,
      newBoard: {
        title: '',
        backgroundColor: this.randomBackgroundColor()
      },
      errorMsg: ''
    };
  },
  created() {
    this.$store.dispatch('LOAD_BOARDS')
  },
  computed: {
    boardCount(){
      return this.$store.state.boards.length
    }
  },
  methods: {
    saveNewBoard() {

      const newBoard = {
        ... this.newBoard
      } 

      this.$store.dispatch('CREATE_NEW_BOARD', newBoard)

    },
    randomBackgroundColor() {
      return "#" + this.generateHexCode();
    },
    generateHexCode() {
      var bg = Math.floor(Math.random()*16777215).toString(16);
      if (bg.length !== 6) bg = this.generateHexCode();
      return bg;
    }
  },
  watch: {
    boardCount(){
      this.isLoading = false
      this.showAddBoard = false

      this.newBoard = {
        title: '',
        backgroundColor: this.randomBackgroundColor()
      }

      if (this.$route.name == "Home" && this.boardCount > 0) 
      {
        const firstBoard = this.$store.getters.firstBoard

        this.$router.push(`/board/${firstBoard.id}`);
      }
    }
  }
};
</script>

<style scoped>
div#sideNav {
  height: 100%;
  width: 20%;
  position: fixed;
  z-index: 1;
  left: 0;
  top: 0;
  padding-top: 20px;
  padding-bottom: 20px;
  overflow-x: hidden;
  border-right: solid lightgrey 1px;
}

h1 {
  text-align: center;
}

.boards {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  align-items: center;
}
.board {
  color: #f7fafc;
  border-radius: 10px;
  padding: 30px;
  font-size: 18px;
  flex: 1;
  margin: 10px;
  text-align: center;
  cursor: pointer;
  width: 60%;
}
.addBoard {
  color: #f7fafc;
  border-radius: 10px;
  background-color: #28a745;
  font-size: 16px;
  width: 60%;
  margin: 10px;
  padding: 20px;
  cursor: pointer;
}
.form-control {
  margin-bottom: 10px;
}
.btn {margin-bottom: 35px;}
.loading {
  flex: 3;
}
.board:hover:not(.router-link-active), .addBoard:hover {
  font-weight: bold;
}
.router-link-active {
  font-weight: bold;
  border: solid blue 5px;
}
</style>

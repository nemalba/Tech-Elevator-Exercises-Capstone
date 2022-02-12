<template>
  <div>
    <loading-image v-if="isLoading"></loading-image>
    <div v-else>
      <h1>{{ card.title }}</h1>
      <p>{{ card.description }}</p>
      <router-link
        tag="button"
        :to="{ name: 'EditCard', params: {cardID: $route.params.cardID} }"
        class="btn editCard"
      >Edit Card</router-link>
      <button class="btn deleteCard" v-on:click="deleteCard">Delete Card</button>
      <div class="status-message error" v-show="errorMsg !== ''">{{errorMsg}}</div>
      <comments-list :card-id="card.id" />
    </div>

    <div class="board-actions" v-if="!isLoading">
      <router-link :to="{ name: 'Board', params: { id: $route.params.boardID } }">Back to Board</router-link>
    </div>
  </div>
</template>

<script>
import CommentsList from "@/components/CommentsList";
import LoadingImage from "./LoadingImage";
import cardService from "../services/CardService";

export default {
  name: "card-detail",
  components: {
    CommentsList,
    LoadingImage
  },
  data() {
    return {
      isLoading: true,
      errorMsg: "",
    };
  },
  methods: {
    retrieveCard() {
      cardService
        .getCard(this.$route.params.cardID)
        .then(response => {
          this.$store.commit("SET_CARD", response.data);
          this.isLoading = false;
        })
        .catch(error => {
          if (error.response && error.response.status === 404) {
            alert(
              "Card not available. This card may have been deleted or you have entered an invalid card ID."
            );
            this.$router.push("/");
          }
        });
    },
    deleteCard() {

      const shouldDelete = confirm("Are you sure you want to delete this card? This action cannot be undone.")
      
      if (shouldDelete) {
        cardService
          .deleteCard(this.card.id)
          .then(response => {
            if (response.status === 200) {
              alert("Card successfully deleted")
              this.$router.push(`/board/${this.card.boardId}`);
            }
          })
          .catch(error => {
            if (error.response) {
              this.errorMsg =
                "Error deleting card. Response received was '" +
                error.response.statusText +
                "'.";
            } else if (error.request) {
              this.errorMsg =
                "Error deleting card. Server could not be reached.";
            } else {
              this.errorMsg =
                "Error deleting card. Request could not be created.";
            }
          });
      }
    },
  },
  created() {
    this.retrieveCard();
  },
  computed: {
    card() {
      return this.$store.state.card;
    }
  }
};
</script>

<style>
.btn.editCard {
  color: #fff;
  background-color: #508ca8;
  border-color: #508ca8;
  margin-bottom: 10px;
}
.btn.deleteCard {
  color: #fff;
  background-color: #ef031a;
  border-color: #ef031a;
  margin-bottom: 10px;
}
</style>

<template>
  <form v-on:submit.prevent="submitForm" class="cardForm">
    <div class="status-message error" v-show="errorMsg !== ''">
      {{ errorMsg }}
    </div>
    <div class="form-group">
      <label for="title">Title:</label>
      <input
          id="title"
          type="text"
          class="form-control"
          v-model="card.title"
          autocomplete="off"
      />
    </div>
    <div class="form-group">
      <label for="tag">Tag:</label>
      <select id="tag" class="form-control" v-model="card.tag">
        <option value="Feature Request">Feature Request</option>
        <option value="Design">Design</option>
        <option value="Q&A">Q&A</option>
      </select>
      <label for="status">Status:</label>
      <select id="tag" class="form-control" v-model="card.status">
        <option value="Planned">Planned</option>
        <option value="In Progress">In Progress</option>
        <option value="Completed">Completed</option>
      </select>
    </div>
    <div class="form-group">
      <label for="description">Description:</label>
      <textarea
          id="description"
          class="form-control"
          v-model="card.description"
      ></textarea>
    </div>
    <button class="btn btn-submit">Submit</button>
    <button
        class="btn btn-cancel"
        v-on:click.prevent="cancelForm"
        type="cancel"
    >
      Cancel
    </button>
  </form>
</template>

<script>
import imageService from "../services/ImageService";
import moment from "moment";
import cardService from "../services/CardService";

export default {
  name: "card-form",
  props: {
    cardID: {
      type: Number,
      default: 0,
    },
  },
  data() {
    return {
      card: {
        title: "",
        description: "",
        status: "Planned",
        tag: "",
        avatar: "",
        date: null,
      },
      errorMsg: "",
    };
  },
  methods: {
    submitForm() {

      if (this.cardID === 0) { // insert a new record


        const newCard = {
          ...this.card,
          boardId: Number(this.$route.params.boardID),
          avatar: imageService.nextImage(),
          date: moment().format("MMM Do YYYY"),
        };

        // add
        cardService
            .addCard(newCard)
            .then((response) => {
              if (response.status === 201) {
                this.$router.push(`/board/${newCard.boardId}`);
              }
            })
            .catch((error) => {
              this.handleErrorResponse(error, "adding");
            });
      } else {

        // update
        const newCard = {
          ...this.card
        };

        cardService
            .updateCard(newCard)
            .then((response) => {
              if (response.status === 200) {
                this.$router.push(`/board/${newCard.boardId}`);
              }
            })
            .catch((error) => {
              this.handleErrorResponse(error, "updating");
            });
      }
    },
    cancelForm() {
      this.$router.push(`/board/${this.$route.params.boardID}`);
    },
    handleErrorResponse(error, verb) {
      if (error.response) {
        this.errorMsg =
            "Error " +
            verb +
            " card. Response received was '" +
            error.response.statusText +
            "'.";
      } else if (error.request) {
        this.errorMsg =
            "Error " + verb + " card. Server could not be reached.";
      } else {
        this.errorMsg =
            "Error " + verb + " card. Request could not be created.";
      }
    },
  },
  created() {
    if (this.cardID != 0) {
      cardService
          .getCard(this.cardID)
          .then((response) => {
            this.card = response.data;
          })
          .catch((error) => {
            if (error.response && error.response.status === 404) {
              alert(
                  "Card not available. This card may have been deleted or you have entered an invalid card ID."
              );
              this.$router.push("/");
            }
          });
    }
  },
};
</script>


<style>
.cardForm {
  padding: 10px;
  margin-bottom: 10px;
}
.form-group {
  margin-bottom: 10px;
  margin-top: 10px;
}
label {
  display: inline-block;
  margin-bottom: 0.5rem;
}
.form-control {
  display: block;
  width: 80%;
  height: 30px;
  padding: 0.375rem 0.75rem;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #495057;
  border: 1px solid #ced4da;
  border-radius: 0.25rem;
}
textarea.form-control {
  height: 75px;
  font-family: Arial, Helvetica, sans-serif;
}
select.form-control {
  width: 20%;
  display: inline-block;
  margin: 10px 20px 10px 10px;
}
.btn-submit {
  color: #fff;
  background-color: #0062cc;
  border-color: #005cbf;
}
.btn-cancel {
  color: #fff;
  background-color: #dc3545;
  border-color: #dc3545;
}
.status-message {
  display: block;
  border-radius: 5px;
  font-weight: bold;
  font-size: 1rem;
  text-align: center;
  padding: 10px;
  margin-bottom: 10px;
}
.status-message.success {
  background-color: #90ee90;
}
.status-message.error {
  background-color: #f08080;
}
</style>

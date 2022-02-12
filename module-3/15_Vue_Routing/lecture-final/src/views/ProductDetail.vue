<template>
  <div id="app">
    <router-link v-bind:to="{ name: 'products' }">Back to Products</router-link>
    |
    <router-link v-bind:to="{ name: 'add-review', params: { id: product.id } }"
      >Add a New Review</router-link
    >
    <h1>{{ product.name }}</h1>
    <p>{{ product.description }}</p>
    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2" />
      <star-summary rating="3" />
      <star-summary rating="4" />
      <star-summary rating="5" />
    </div>
    <review-list />
  </div>
</template>

<script>
import AverageSummary from "../components/AverageSummary.vue";
import ReviewList from "../components/ReviewList.vue";
import StarSummary from "../components/StarSummary.vue";
export default {
  components: { AverageSummary, StarSummary, ReviewList },
  created() {
    const activeProductID = this.$route.params.id;
    this.$store.commit("SET_ACTIVE_PRODUCT", activeProductID);
  },
  computed: {
    product() {
      return this.$store.state.products.find((p) => {
        // returns the object whose ID is in activeProduct
        // the find function returns the product object that matches
        return p.id == this.$store.state.activeProduct;
      });
    },
  },
};
</script>

<style>
</style>
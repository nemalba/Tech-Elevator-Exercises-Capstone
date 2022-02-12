<template>
  <section id="answers" class="show-hide">
    <ul>
      <li
        v-for="answer in $store.state.problemSet[
          $store.state.currentProblem - 1
        ].answers"
        :key="answer.id"
        v-on:click="checkAnswer(answer)"
      >
        {{ answer }}
      </li>
    </ul>
  </section>
</template>

<script>
export default {
  methods: {
    checkAnswer(answer) {
      //if answer is correct, increase score by 1
      if (
        answer ===
        this.$store.state.problemSet[this.$store.state.currentProblem - 1]
          .problem.answer
      ) {
        this.$store.commit("INCREASE_SCORE");
      }
      this.$store.commit("INCREASE_CURRENT_PROBLEM");
      // increase currentProblem by 1
    },
  },
};
</script>

<style>
</style>
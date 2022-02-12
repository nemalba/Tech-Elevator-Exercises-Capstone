<template>
  <div id="app">
    <math-header></math-header>
    <math-problem></math-problem>
    <math-answers></math-answers>
  </div>
</template>

<script>
import MathHeader from "./components/MathHeader.vue";
import MathProblem from "./components/MathProblem.vue";
import MathAnswers from "./components/MathAnswers.vue";

export default {
  name: "App",
  components: {
    MathAnswers,
    MathHeader,
    MathProblem,
  },
  data() {
    return {};
  },
  methods: {
    createProblemSet() {
      let problemSet = [];
      //generate the set of problems and the answers!
      for (let i = 0; i < this.$store.state.problemsPerSet; ++i) {
        const problem = {
          left: this.getRandomNumber(10),
          right: this.getRandomNumber(10),
          answer: null,
        };
        const correctAnswer = problem.left * problem.right;
        problem.answer = correctAnswer;
        const answers = this.shuffleArray([
          correctAnswer,
          this.getRandomNumber(82),
          this.getRandomNumber(82),
          this.getRandomNumber(82),
        ]);
        problemSet.push({ problem, answers });
      }
      this.$store.commit("LOAD_PROBLEM_SET", problemSet);
    },
    getRandomNumber(max) {
      return Math.floor(Math.random() * Math.floor(max));
    },
    shuffleArray(arr) {
      for (let i = arr.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [arr[i], arr[j]] = [arr[j], arr[i]];
      }
      return arr;
    },
  },
  created() {
    // life cycle hook
    this.createProblemSet();
  },
};
</script>

<style>
/* <style scoped> would mean only apply styles to this component */
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
body {
  height: 100vh;
  font-family: Arial, Helvetica, sans-serif;
}
header,
main,
footer {
  width: 800px;
  margin: 0 auto;
  text-align: center;
}
h1 {
  font-family: "Bangers", cursive;
  font-size: 5rem;
}
#problem .expression {
  font-size: 48px;
  border: 1px solid #eeeeee;
  padding: 10px;
  margin: 0 40px;
}

#answers ul {
  margin: 0;
  padding: 0;
  margin: 40px auto;
  display: flex;
  list-style-type: none;
  justify-content: space-around;
}
#answers li {
  margin: 0 20px;
  padding: 20px 30px;
  cursor: pointer;
  background-color: #eeeeee;
}
footer {
  margin-top: 50px;
  font-size: 12px;
}
button {
  display: block;
  margin: 40px auto;
  padding: 8px 12px;
  background-color: #abd587;
  text-transform: uppercase;
  border: 0px;
  border-radius: 4px;
  font-size: 20px;
}
.hidden {
  display: none;
}
</style>

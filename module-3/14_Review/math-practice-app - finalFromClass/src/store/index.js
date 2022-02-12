import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    problemsPerSet: 10,
    problemSet: [],
    currentProblem: 1,
    score: 0,
  },
  mutations: {
    LOAD_PROBLEM_SET(state, problemSet) {
      state.problemSet = problemSet;
    },
    INCREASE_SCORE(state) {
      state.score++;
    },
    INCREASE_CURRENT_PROBLEM(state) {
      state.currentProblem++;
    }
  },
  actions: {
  },
  modules: {
  }
})

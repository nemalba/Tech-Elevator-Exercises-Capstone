<template>
  <section id="problem">
    <div class="expression">
      {{
        $store.state.problemSet[$store.state.currentProblem - 1].problem.left
      }}
      *
      {{
        $store.state.problemSet[$store.state.currentProblem - 1].problem.right
      }}
    </div>
    <p>
      Problem:
      <span class="currentProblem">{{ $store.state.currentProblem }}</span
      >/10 | Score:
      <span class="currentScore">{{ $store.state.score }}</span>
    </p>
  </section>
</template>

<script>
export default {};
</script>

<style>
</style>
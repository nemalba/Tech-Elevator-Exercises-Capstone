<template>
  <div id="app">
    <h1>{{ name }}</h1>
    <p>{{ description }}</p>
  </div>
</template>

<script>
export default {
  name: "math-header",
  data() {
    return {
      name: "Math Practice",
      description:
        "Please select an answer below the problem by clicking on the box",
    };
  },
};
</script>

<style>
</style>
<template>
  <div id="app">
    <div id="nav">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>&nbsp;|&nbsp;
      <router-link
        v-bind:to="{ name: 'logout' }"
        v-if="$store.state.token != ''"
        >Logout</router-link
      >&nbsp;|&nbsp;
      <router-link
        v-bind:to="{ name: 'display' }"
        v-if="$store.state.token != ''"
        >Display Puppies</router-link
      >&nbsp;|&nbsp;
      <router-link v-bind:to="{ name: 'add' }" v-if="$store.state.token != ''"
        >Add a Puppy</router-link
      >
    </div>
    <router-view />
  </div>
</template>

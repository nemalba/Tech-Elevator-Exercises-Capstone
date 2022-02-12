<template>
  <!-- <div class="card" v-bind:class = "{read:book.read}">

     <div class="book-title">{{ book.title }}</div> -->
     <div class="card" v-bind:class="{read:book.read}">
     <div class="book-title">{{book.title}}</div>
    <!-- Please leave <img> commented out until directed to remove open and close comment tags in the README. -->
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' 
 + book.isbn + '-M.jpg'" />
     <div class="book-author">{{book.author}}</div>
      <button class="mark-unread" v-if="book.read" 
      v-on:click.prevent="markReadUnread">Mark Unread</button>
     <button class="mark-read" v-if="!book.read" 
     v-on:click.prevent="markReadUnread">Mark Read</button>   
    
  </div>
</template>

<script>
// export default 
// {
//     name: 'book-card',
//     props: 
//     {
//         book: Object,
//    },

//     methods: 
//     {
//         markReadUnread()
//         {
//             this.$store.commit("FLIP_STATUS", this.book);
//         }
//     }
  
//   }
export default {
    name: 'book-card',
      props: {
         book: Object
     },
       methods: {
    markReadUnread() {
      this.$store.commit("FLIP_STATUS", this.book);
    },
       }
}

</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>
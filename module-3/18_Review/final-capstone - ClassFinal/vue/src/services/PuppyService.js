import axios from 'axios';

// const http = axios.create({
//   baseURL: "http://localhost:8080/api"
// });

export default {
  list() {
    return axios.get('/api/allPuppies');
  },

  get(id) {
    return axios.get(`/api/puppy/${id}`);
  },


  // add a puppy to endpoint /newPuppy
  create(puppy) {
    return axios.post("/api/newPuppy", puppy);
  },

  // update a puppy to endpoint /editPuppy
  update(puppy) {
    console.log(puppy);
  },

  // delete a puppy to endpoint /removePuppy/id
  delete(id) {
    console.log(id);
  }
}

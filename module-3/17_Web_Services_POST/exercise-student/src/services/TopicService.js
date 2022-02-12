import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000"
});

export default {

  list() {
    return http.get('/topics');
  },
  get(id) {
    return http.get(`/topics/${id}`);
  },
  //Step#1
  addTopic(topic){
    return http.post('/topics', topic);
  },
  //Step#2
  updateTopic(topic){
    return http.put(`topics/${topic.id}`, topic);
  },
  //Step#3
  deleteTopic(topicID){
    return http.delete(`/topics/${topicID}`);
  }
}
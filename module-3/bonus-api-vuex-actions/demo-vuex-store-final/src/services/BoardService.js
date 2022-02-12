import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:3000/boards"
});

class BoardService {

  addBoard(board)
  {
    return http.post(`/`, board)
  }

  deleteBoard(boardId)
  {
    return http.delete(`/${boardId}`)
  }

  getBoards() {
    return http.get('/');
  }

  getBoard(boardId) {
    return http.get(`/${boardId}`)
  }
}

export default new BoardService()

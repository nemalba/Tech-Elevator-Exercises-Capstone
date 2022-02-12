import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000/comments"
});

class CardService
{
    getComments(cardId)
    {
        return http.get(`?cardId=${cardId}`)
    }
}

export default new CardService()

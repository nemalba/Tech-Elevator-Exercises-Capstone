import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000/cards"
});

class CardService
{
    getCards(boardId)
    {
        return http.get(`?boardId=${boardId}`)
    }

    getCard(cardId)
    {
        return http.get(`/${cardId}`)
    }

    addCard(card)
    {
        return http.post('/', card);
    }

    updateCard(card)
    {
        return http.put(`/${card.id}`, card);
    }

    deleteCard(cardId)
    {
        return http.delete(`/${cardId}`);
    }

}

export default new CardService()

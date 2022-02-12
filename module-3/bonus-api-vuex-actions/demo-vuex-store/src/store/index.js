import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        boards: [],
        cards: [],
        comments: [],
        card: {
            title: '',
            description: '',
            status: '',
            comments: []
        }
    },
    mutations: {
        SET_BOARDS(state, boards)
        {
            state.boards = boards;
        },
        SET_CARDS(state, cards)
        {
            state.cards = cards;
        },
        SET_CARD(state, card)
        {
            state.card = card;
        },
        DELETE_BOARD(state, boardIdToDelete)
        {
            state.boards = state.boards.filter((board) =>
            {
                return board.id !== boardIdToDelete;
            });
        },
        SET_COMMENTS(state, comments)
        {
            state.comments = comments
        }
    },
    actions: {},
    modules: {}
})

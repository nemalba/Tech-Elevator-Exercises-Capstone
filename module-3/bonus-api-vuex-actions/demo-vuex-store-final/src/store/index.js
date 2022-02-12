import Vue from 'vue'
import Vuex from 'vuex'
import boardService from '../services/BoardService';

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
    getters: {
        firstBoard: (state) =>
        {
            if (state.boards.length > 0)
            {
                return state.boards[0]                
            }
            else
            {
                return {}
            }
        }
    },
    mutations: {
        ADD_BOARD(state, board)
        {
            state.boards.push(board)
        },
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
    actions: {
        LOAD_BOARDS(context)
        {
            boardService.getBoards()
                .then(response =>
                {
                    const boards = response.data
                    context.commit('SET_BOARDS', boards)

                })
        },
        CREATE_NEW_BOARD(context, board)
        {
            boardService.addBoard(board)
                .then(response =>
                {
                    const newBoard = response.data
                    context.commit('ADD_BOARD', newBoard)
                })
        }
    },
    modules: {}
})

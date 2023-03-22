const defaultState = [];
const ADD_USER = 'ADD_USER';
const REMOVE_USER = 'REMOVE_USER';

export const addUser = (payload) => ({ type: ADD_USER, payload })
export const removeUser = (payload) => ({ type: REMOVE_USER, payload })

export const userReducer = (state = defaultState, action) => {
    if (action.type === ADD_USER) {
        return [...state, {
            id: Date.now(),
            ...action.payload
        }]
    } else if (action.type === REMOVE_USER) {
        return state.filter(el => el.id !== action.payload)
    } else {
        return state
    }
}
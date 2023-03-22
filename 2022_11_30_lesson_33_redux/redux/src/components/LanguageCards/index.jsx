import React from 'react'
import { addCard, deleteCard, changeCard } from '../../store/reducer/languageCardReducer';
import {useDispatch, useSelector} from 'react-redux';
import LanguageCard from '../LanguageCard'

export default function LanguageCards() {

    const dispatch = useDispatch();
    const state = useSelector(state => state.languageCards)

    const submitCard = event => {
        event.preventDefault();
        const {eng, rus} = event.target;
        dispatch(addCard({
            eng: eng.value,
            rus: rus.value
        }));
        eng.value = '';
        rus.value = '';
    }

    const change = id =>  dispatch(changeCard(id));
    const removeCard = id => dispatch(deleteCard(id));
    console.log(change);
  return (
    <div>
        <form onSubmit={submitCard}>
            <input type="text" name='eng' placeholder='English'/>
            <input type="text" name='rus' placeholder='Russian'/>
            <button>Add card</button>
        </form>
        <div>{state.map(el => <LanguageCard key={el.id} {...el} removeCard={removeCard} change={change}/>)}</div>
    </div>
  )
}

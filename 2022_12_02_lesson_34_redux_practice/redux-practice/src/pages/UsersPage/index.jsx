import React from 'react'
import { addUser, removeUser } from '../../store/reducer/user';
import { useDispatch, useSelector } from 'react-redux';
import User from '../../components/User';


export default function UsersPage() {

  const dispatch = useDispatch();
  const state = useSelector(state => state.users)
  const deleteUser = id => dispatch(removeUser(id));



  const submit = event => {
    event.preventDefault();
    const { userName, userAge, userCountry } = event.target
    dispatch(addUser({
      userName: userName.value,
      userAge: userAge.value,
      userCountry: userCountry.value
    }));
    userName.value = '';
    userAge.value = '';
    userCountry.value = '';
  }

  return (
    <div>
      <form onSubmit={submit}>
        <input type="text" name='userName' placeholder='Name' />
        <input type="text" name='userAge' placeholder='Age' />
        <input type="text" name='userCountry' placeholder='Country' />
        <button>Submit</button>
      </form>
      <div>{state.map(el => <User key={el.id} {...el} deleteUser={deleteUser}/>)}</div>
    </div>
  )
}

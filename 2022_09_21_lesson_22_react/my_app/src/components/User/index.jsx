import React from 'react'
import ToDoList from '../ToDoList';
import s from './index.module.css'

function User({ id, firstname, lastname, active, avatar, todo}) {
  const status = active ? 'active' : 'not active';
  const backgroundColor = active ? 'lightgreen' : 'lightgray';
  const img_url = avatar ?? 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/No_image_available.svg/1024px-No_image_available.svg.png'
  const card_style = {
    backgroundColor: backgroundColor
  }
  const [ID, title, done] = todo
  const toDo = done ?? `Дел нет`;

  return (
    <div style={card_style} className={s.card}>
      <p>ID: {id}</p>
      <p>First name: {firstname}</p>
      <p>Last name: {lastname}</p>
      <p> Status: {status}</p>
      <ToDoList tasks={todo}/>
      <p>{done}</p>
      <img className={s.avatar} src = {img_url} alt="avatar"></img>
    </div>
  )
}

export default User
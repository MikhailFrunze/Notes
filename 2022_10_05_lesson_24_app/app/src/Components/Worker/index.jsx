import React from 'react'
import s from './index.module.css'
import ToDoList from '../ToDoList'

export default function Worker({ firstname, lastname, position, in_office, avatar, tasks }) {

    const card_style = {
        backgroundColor: in_office ? 'lightgreen' : 'lightgray'
    }

    const img_url = avatar ?? 'https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/No_image_available.svg/1024px-No_image_available.svg.png'

    return (
        <div className={s.card} style={card_style}>
            <p>First name: {firstname}</p>
            <p>Last name: {lastname}</p>
            <p>Position: {position}</p>
            <img src={img_url} alt="#" className={s.avatar} />
            <ToDoList tasks={tasks}/>
        </div>
    )
}

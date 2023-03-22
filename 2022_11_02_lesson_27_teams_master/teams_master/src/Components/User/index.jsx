import React from 'react'
import s from './index.module.css'

export default function User({name, team}) {
  return (
    <div className={s.user_item}>
        <p>name: {name}</p>
        <p>team: {team}</p>
    </div>
  )
}

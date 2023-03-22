import React from 'react'
import s from './index.module.css'

export default function Post({id, title, body}) {
  return (
    <div className={s.post_card}>
        <p>ID: {id}</p>
        <p>Title: {title}</p>
        <p>Body: {body}</p>
    </div>
  )
}

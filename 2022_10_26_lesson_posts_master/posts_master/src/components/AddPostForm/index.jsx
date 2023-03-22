import React from 'react'
import { posts_data } from '../../data/posts';
import s from './index.module.css'

export default function AddPostForm({ id, add_post }) {
  let dataCollection = [];

  const submit = (event) => {
    event.preventDefault();
    dataCollection = [];
    const { title, text } = event.target;
    dataCollection.push(title.value, text.value);
    title.value = '';
    text.value = '';
    console.log(dataCollection);
  }

  const submitPost = (event) => {
    event.preventDefault();
    const { title, text } = event.target;
    add_post(id, title.value, text.value);
    title.value = '';
    text.value = '';

  }





  return (
    <form className={s.post_form} onSubmit={submitPost}>
      <input type='text' name='title' placeholder='Title' />
      <input type='text' name='text' placeholder='Your text' />
      <button>Add post</button>
    </form>
  )
}
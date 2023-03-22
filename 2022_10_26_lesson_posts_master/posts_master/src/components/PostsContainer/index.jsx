import React from 'react'
import Post from '../Post'

export default function PostsContainer({ posts, change_like, add_comment, add_post, delete_post }) {
  return (
    <div>
      <div>{
        posts.map(el => <Post key={el.id} {...el} change_like={change_like} add_comment={add_comment} add_post={add_post} delete_post={delete_post} />)
      }</div>
    </div>
  )
}
import React, {useContext} from 'react'
import AddCommentForm from '../AddCommentForm'
import Comment from '../Comment'
import { Context } from '../../context';

export default function CommentsContainer({ comments, add_comment, id }) {

  return (
    <div>
      {
        comments.map(el => <Comment key={el.id} {...el} post_id={id}/>)
      }                                                 
      <AddCommentForm add_comment={add_comment} id={id} />
    </div>
  )
}
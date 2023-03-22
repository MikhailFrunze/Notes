import React from 'react'
import AddPostForm from '../../Components/AddPostForm'
import PostsContainer from '../../Components/PostsContainer'

export default function PostsPage() {
    return (
        <div>
            <AddPostForm />
            <PostsContainer />
        </div>
    )
}

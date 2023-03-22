import PostsPage from '../../pages/PostsPage'
import UsersPage from '../../pages/UsersPage'
import NavMenu from '../NavMenu'
import { Routes, Route } from 'react-router-dom'
import { getUsers } from '../../requests/users'
import { useState, useEffect } from 'react'
import { Context } from '../../context'
import { getPosts } from '../../requests/posts'
import ToDosPage from '../../pages/ToDosPage'
import {getToDos} from '../../requests/todos'

function App() {

  const [users, setUsers] = useState([]);
  const [posts, setPosts] = useState([]);
  const [todos, setTodos] = useState([]);

  useEffect(() => {
    getPosts(setPosts);
    getUsers(setUsers);
    getToDos(setTodos);
  }, []);

  const add_user = user => setUsers(prev => [...prev, user])
  const createNewPost = post => setPosts(prev => [...prev, post])
  const createNewTodos = todo => setTodos(prev => [...prev, todo])

  return (
    <div className="App">
      <Context.Provider value={{ users, add_user, posts, createNewPost, todos, createNewTodos }}>
        <NavMenu />
        <Routes>
          <Route path='/users_page' element={<UsersPage />} />
          <Route path='/posts_page' element={<PostsPage />} />
          <Route path='/todos_page' element={<ToDosPage />} />
        </Routes>
      </Context.Provider>
    </div>
  );
}

export default App;

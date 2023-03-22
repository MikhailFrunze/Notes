import {Route, Routes} from 'react-router-dom';
import MainPage from '../../pages/MainPage';
import PostsPage from '../../pages/PostsPage';
import UsersPage from '../../pages/UsersPage';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path='/' element={<MainPage />}></Route>
        <Route path='/users' element={<UsersPage />}></Route>
        <Route path='/posts' element={<PostsPage />}></Route>
      </Routes>
    </div>
  );
}

export default App;

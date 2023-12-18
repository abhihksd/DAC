import logo from './logo.svg';
import './App.css';
import { useSelector } from 'react-redux';
import {Link,Routes,Route} from 'react-router-dom'
import RegisterComp from './RegisterComp'
import LoginComp from './LoginComp';
import HomeComp from './HomeComp';
import LogoutComp from './LogoutComp';
function App() {
  const mystate=useSelector(state=>state.logged)
  return (
    <div className="App">
      <header >
      </header>
        <div style={{display:mystate.loggedIn?"none":"block"}}>
          <ul className='nav navbar' >
            <li className='nav-item' >
              <Link to="/register" className="nav-link">REGISTER</Link>
            </li>
            <li className='nav-item'>
              <Link to="/login" className="nav-link">LOGIN</Link>
            </li>
          </ul>
        </div>
        <Routes>
          <Route path='/register' element={<RegisterComp/>}></Route>
          <Route path='/login' element={<LoginComp/>}></Route>
          <Route path='/home' element={<HomeComp/>}>
            <Route path='logout' element={<LogoutComp/>} ></Route>
          </Route>
        </Routes>
      
    </div>
  );
}

export default App;

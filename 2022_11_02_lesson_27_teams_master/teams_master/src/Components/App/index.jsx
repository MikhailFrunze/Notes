import Nav from "../Nav";
import ConfigurationsPage from "../../pages/ConfigurationsPage";
import TeamsPage from "../../pages/TeamsPage";
import { Routes, Route } from 'react-router-dom';
import { useState, useEffect } from 'react';
import { Context } from '../../context';


function App() {



  const [teams, setTeams] = useState([]);

  const [users, setUsers] = useState([]);

  useEffect(() => {
    const teams = localStorage.getItem('teams', )
    const users = localStorage.getItem('users', ) 
    setTeams(JSON.parse(teams));
    setUsers(JSON.parse(users));
  }, []) 

  useEffect(() => {
    localStorage.setItem('teams', JSON.stringify(teams));
    localStorage.setItem('users', JSON.stringify(users));
  }, [teams, users]); 
  
  let add_team = (value) => {
    setTeams([...teams, { value: value, label: value }]);
  }

  let add_user = (name_value, team_value) => {
    setUsers([...users, {
      id: Date.now,
      name: name_value,
      team: team_value
    }])
  }


  return (
    <div className="App">

      <Context.Provider value={{ add_team, teams, users, add_user}}>
        <Nav />
        <Routes>
          <Route path='/configurations_page' element={<ConfigurationsPage />} />
          <Route path='/teams_page' element={<TeamsPage />} />
        </Routes>
      </Context.Provider>
    </div>
  );
}

export default App;

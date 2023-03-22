import React from 'react'
import { Context } from '../../context';
import { useContext } from 'react';
import User from '../../Components/User';

export default function TeamsPage() {

  const { users } = useContext(Context);

  return (
    <div>
      {
        users.length !== 0
          ? users.map(el => <User key={el.id} {...el} />)
          : 'No users'
      }
    </div>
  )
}

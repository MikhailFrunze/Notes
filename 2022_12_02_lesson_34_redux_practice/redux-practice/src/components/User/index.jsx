import React from 'react'

export default function User({ id, userName, userAge, userCountry, deleteUser }) {
    return (
        <div onClick={() => deleteUser(id)}> 
            <p>Name: {userName}</p>
            <p>Age: {userAge}</p>
            <p>Country: {userCountry}</p>
        </div>
    )
}

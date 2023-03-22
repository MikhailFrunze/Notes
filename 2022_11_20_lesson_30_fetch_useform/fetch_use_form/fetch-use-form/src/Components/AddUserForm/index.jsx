import React, { useContext } from 'react'
import { Context } from '../../context'
import { useForm } from "react-hook-form";
import s from './index.module.css';
import { createNewUser } from '../../requests/users'

export default function AddUserForm() {
  const { register, handleSubmit, formState: { errors } } = useForm({
    mode: 'onBlur'
  });
  const { add_user } = useContext(Context);

  // const submit = event => {
  //     event.preventDefault();
  //     const {firstname, lastname, age} = event.target;
  //     console.log(firstname.value, lastname.value, age.value);
  //     firstname.value = '';
  //     lastname.value = '';
  //     age.value = '';
  // };

  const firstnameRegister = register('firstName', {
    required: '* Field "firstname" required'
  });
  const lastnameRegister = register('lastName', {
    required: '* Field "lastname" required'
  });
  const ageRegister = register('age', {
    required: '* Field "age" required'
  });

  const submit = data => createNewUser(data, add_user);

  return (
    <div className={s.add_user_form}>
      <form onSubmit={handleSubmit(submit)}>
        <input type="text" name='firstName'  {...firstnameRegister} />
        <input type="text" name='lastName'  {...lastnameRegister} />
        <input type='text' name='age' {...ageRegister} />
        <button>Add user</button>
      </form>

      <div>
        <div>
          {errors.firstName && <p>{errors.firstName?.message}</p>}
        </div>

        <div>
          {errors.lastName && <p>{errors.lastName?.message}</p>}
        </div>

        <div>
          {errors.age && <p>{errors.age?.message}</p>}
        </div>
      </div>
    </div>
  )
}

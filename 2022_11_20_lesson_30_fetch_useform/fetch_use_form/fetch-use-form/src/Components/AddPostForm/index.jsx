import React, { useContext } from 'react'
import { useForm } from 'react-hook-form';
import s from './index.module.css'
import { Context } from '../../context';

export default function AddPostForm() {

    const { createNewPost } = useContext(Context);

    const { register, handleSubmit, formState: { errors } } = useForm({
        mode: 'onBlur'
    });

    const submit = data => console.log(data);

    const idRegister = register('id', {
        required: '*The field "id" is required'
    });
    const titleRegister = register('title', {
        required: '*The field "title" is required'
    });
    const bodyRegister = register('body', {
        required: '*The field "body" is required'
    });

    return (
        <div>
            <form onSubmit={handleSubmit(submit)} className={s.add_post_form}>
                <input type="text" name='id' placeholder='id' {...idRegister}/>
                <input type="text" name='title' placeholder='title' {...titleRegister} />
                <input type="text" name='body' placeholder='body' {...bodyRegister} />
                <button>Add post</button>
            </form>


            <div>
                {errors.title && <p>{errors.title?.message}</p>}
            </div>

            <div>
                {errors.body && <p>{errors.body?.message}</p>}
            </div>
        </div >
    )
}

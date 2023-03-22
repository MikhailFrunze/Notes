import React, { useContext } from 'react'
import s from './index.module.css'
import FormItem from '../FormItem'
import { Context } from '../../context'
import { CloseOutlined } from '@ant-design/icons'
import { Routes, Route } from 'react-router-dom'

export default function FormModal() {
    const { modalActive, setModalActive } = useContext(Context);

    return (
        <div className={[s.modal, modalActive ? s.active : ''].join(' ')}>
            <div className={s.modal_content}>

                <CloseOutlined className={s.cross} onClick={() => setModalActive(false)} />

                <Routes>
                    <Route path='/registration_form' element={<FormItem
                        title={'registration'}
                        button={{ submit: 'Registration', redirect: 'Login' }}
                        info_text='Регистрируясь на сайте, вы соглашаетесь с нашими Правилами и Политикой конфиденциальности и соглашаетесь на информационную рассылку.'
                        form_type={'registration'}
                        redirect_btn_link={'/login_form'}
                    />}
                    />

                    <Route path='/login_form' element={
                        <FormItem
                            title={'Login'}
                            button={{ submit: 'Login', redirect: 'Registration' }}
                            info_text='Reset password.'
                            form_type={'login'}
                            redirect_btn_link={'/registration_form'}
                        />
                    }
                    />

                    <Route path='/reset_password_form' element={
                        <FormItem
                            title={'Reset password'}
                            button={{ submit: 'Send' }}
                            info_text='The temporary password is available for 24hrs'
                            form_type={'reset_password'}
                            info_text_add={'To receive a temporary password, you must enter the email address you provided during registration.'}
                        />
                    } />

                </Routes>



            </div>
        </div>
    )
}

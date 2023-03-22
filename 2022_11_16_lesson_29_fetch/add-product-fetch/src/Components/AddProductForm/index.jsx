import React, {useContext} from 'react'
import { addProduct } from '../../requests/products';
import s from './index.module.css'
import { Context } from '../../context';

export default function AddProductForm() {

  const {createProduct} = useContext(Context);

  const submit = event => {
    event.preventDefault();
    const { title, description, price } = event.target;
    addProduct({
      id: Date.now,
      title: title.value,
      description: description.value,
      price: price.value
    }, createProduct)
    title.value = '';
    description.value = '';
    price.value = '';
  }

  return (
    <form className={s.add_product_form} onSubmit={submit}>
      <input type="text" name='title' placeholder='title' />
      <input type="text" name='description' placeholder='description' />
      <input type="text" name='price' placeholder='price' />
      <button>Add product</button>
    </form>
  )
}

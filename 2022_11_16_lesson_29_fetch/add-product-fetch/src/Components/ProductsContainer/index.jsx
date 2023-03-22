import React, { useContext } from 'react'
import Product from '../Product';
import { Context } from '../../context';
import s from './index.module.css'



export default function ProductsContainer() {

    const { products } = useContext(Context);

    console.log(products);
    return (
        <div className={s.products_container}>
            {
                products.map(el => <Product {...el} key={el.id} />)
            }
        </div>
    )
}

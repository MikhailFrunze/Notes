import { getProducts } from '../../requests/products'
import { useState } from 'react'
import { useEffect } from 'react';
import { Context } from '../../context'
import ProductsContainer from '../ProductsContainer';
import AddProductForm from '../AddProductForm';

function App() {

  // getProducts();
  const [products, setProducts] = useState([]);

  const createProduct = product => setProducts(prev => [...prev, product])

  useEffect(() => {
    getProducts(setProducts)
  }, [])

  console.log(products);




  return (
    <div className="App">
      <Context.Provider value={{ products, createProduct }}>
      <AddProductForm />
        <ProductsContainer />
      </Context.Provider>
    </div>
  );
}

export default App;

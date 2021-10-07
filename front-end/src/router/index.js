import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Produto from '../views/Produtos.vue'
import Categoria from '../views/Categoria.vue'

const routes = [


  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/produtos',
    name: 'Produtos',
    component: Produto
  },
  {
    path: '/categorias',
    name: 'Categoria',
    component: Categoria
  }
  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

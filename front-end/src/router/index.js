import { createRouter, createWebHashHistory } from 'vue-router'
import Menu from '../components/menu/Menu.vue'
const routes = [

  {
    path: '/menu',
    name: 'Menu',
    component: Menu
  },
  
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router

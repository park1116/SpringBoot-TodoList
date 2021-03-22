import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        name: 'home',
        component: Home
    },
    {
        path: '/calendar',
        name: 'calendar',
        component: () => import('../views/Calendar.vue')
    },
    {
        path: '/insert/:month',
        name: 'insert',
        component: () => import('../components/InsertMonth.vue')
    }
]

const router = new VueRouter({
    mode: 'history',
    routes
})

export default router
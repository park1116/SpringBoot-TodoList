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
        path: '/test',
        name: 'test',
        component: () => import('../views/Test.vue')
    },
    {
        path: '/calendar',
        name: 'calendar',
        component: () => import('../views/Calendar.vue')
    }
]

const router = new VueRouter({
    mode: 'history',
    // base: ProcessingInstruction.env.BASE_URL,
    routes
})

export default router
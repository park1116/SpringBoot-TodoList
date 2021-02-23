import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import First from '@/components/First'

Vue.use(Router)

export default new Router({
  routes: [
    {
      // 4. '/'로 접근 할 경우는 HelloWorld.vue를 실행
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },

    {
      path: '/first',
      name: 'First',
      component: First
    }
  ]
})
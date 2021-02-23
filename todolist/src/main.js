import Vue from 'vue'
import App from './App'
import router from './router'
// 제일 먼저 실행

Vue.config.productionTip = false


new Vue({
  el: '#app', // 여기에 있는 el 속성이 index.html의 id 값을 선택히여 Vue의 컴포넌트들을 마운팅 시켜준다.
  router, // router를 사용
  components: { App }, // App이라는 컴포넌트를 사용
  template: '<App/>' // 1. #app에 사용되는 컴포넌트는 App.vue
})

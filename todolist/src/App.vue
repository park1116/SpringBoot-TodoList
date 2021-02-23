<template>
  <div id="app">
    <Navigation></Navigation>
    <router-view/>
    <!-- 3. 이 부분에서 어떤 것이 마운트 되는지 알아보려면 router/index.js 를 가보면 된다. -->
  </div>
</template>

<script>
// 2. main.js 파일을 실행하면 제일 먼저 마운트 돠는 속성이다.
import Navigation from "./components/Navigation"
export default {
  name: "App",
  components: {
    Navigation: Navigation
  }
}
</script>


<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>
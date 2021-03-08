<template>
  <div>
    <a :href="link">{{ name }}</a>
    <h1>{{todolist}}</h1>
  </div>
</template>

<script>
// import axios from 'axios';
export default {
  name: "Month",
  props: {
    name: String,
    num: Number,
  },
  data() {
    return{
      link: "http://127.0.0.1:8090/"+this.num,
      todolist: ""
    }
  },
  // methods:{
  //   load: function(){
  //     axios.get("/"+this.num,{
  //       params:{
  //         num: this.num
  //       },
  //       timeout:1000
  //     })
  //     .then(res => {
  //       this.todolist = res.data;
  //     })
  //     .catch(
  //       error => {
  //         console.log(error);
  //       }
  //     );
  //   }
  // }
};
</script>
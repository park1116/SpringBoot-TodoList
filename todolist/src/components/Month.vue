<template>
  <div>
    <button @click="sendMonth()">{{ name }}</button>
    <p>{{ todolist }}</p>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: "Month",
  props: {
    name: String,
    num: Number,
  },
  data() {
    return{
      todolist:[]
    }
  },
  methods:{
    sendMonth(){
      axios.get('/data/'+this.num)
      .then(res => {
        console.log(res)
        this.todolist = res.data
      })
      .catch(error => {
          console.log(error)
        })
    }
  }
}
</script>
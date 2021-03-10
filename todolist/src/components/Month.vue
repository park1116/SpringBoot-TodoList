<template>
  <div>
    <button @click="sendMonth()">{{ name }}</button>
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
        this.$emit('monthTodoList', this.todolist)
      })
      .catch(error => {
          console.log(error)
        })
    }
  }
}
</script>
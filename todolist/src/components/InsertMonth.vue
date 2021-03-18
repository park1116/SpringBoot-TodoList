<template>
    <table class="text-center">
      <tr>
        <th>month</th>
        <th>content</th>
        <th colspan="2">modify</th>
      </tr>
      <tr>
        <td>{{ month }}</td>
        <td><input v-model="content" type="text"></td>
        <td>
          <button @click="insert()">insert</button>
        </td>
        <td>
          <button @click="cancel()">cancel</button>
        </td>
      </tr>
    </table>
</template>

<script>
import axios from 'axios';

export default {
  name: "InsertMonth",
  computed: {
    month(){
      return this.$route.params.month
    }
  },
  data() {
    return{
      content: ''
    }
  },
  methods:{
    cancel(){
      this.$router.push({path:'/calendar'})
    },
    insert(){
      axios.get('/insertMonth/'+this.month+'/'+this.content)
      .then(
        this.$router.push({path:'/calendar/'})
      )
      .catch(error => {
          console.log(error)
        })
    }
  }
}
</script>

<style>
tr,
td,
th {
  border: 1px solid #000000;
  padding: 10px;
}
</style>
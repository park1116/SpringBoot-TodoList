<template>
<div class="text-center">
    <table class="table table-striped">
      <thead>
        <th style="width: 10%">month</th>
        <th style="width: 60%">content</th>
        <th colspan="2" style="width: 20%">modify</th>
      </thead>
      <tbody>
        <tr>
          <td>{{ month }}</td>
          <td><input v-model="content" type="text" style="width: 100%"></td>
          <td>
            <button class="btn btn-success" @click="insert()">insert</button>
          </td>
          <td>
            <button class="btn btn-danger" @click="cancel()">cancel</button>
          </td>
        </tr>
      </tbody>
    </table>
</div>
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
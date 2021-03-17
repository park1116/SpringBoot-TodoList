<template>
    <table class="text-center" v-if="todolist.length >= 1">
      <tr>
        <th>num</th>
        <th>month</th>
        <th>content</th>
        <th>status</th>
        <th colspan="2">modify</th>
      </tr>
      <tr v-for="list in todolist" v-bind:key="list.num">
        <td>{{ month }}</td>
        <td><input id="content" type="text"></td>
        <td>
          <button @click="insert(list.month)">insert</button>
        </td>
        <td>
          <button @click="deleteNum(list.num, list.month)">cancel</button>
        </td>
      </tr>
    </table>
</template>

<script>
import axios from 'axios';

export default {
  name: "InsertMonth",
  props: {
    month: Number,
  },
  data() {
    // return{
    //   todolist:[]
    // }
  },
  methods:{
      
  }
}
</script>
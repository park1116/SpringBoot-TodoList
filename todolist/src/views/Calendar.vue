<template>
  <div class="text-center">
    <table>
      <tr>
        <td>
          <Month name="January" v-bind:month='1' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="Febrary" v-bind:month='2' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="March" v-bind:month='3' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="April" v-bind:month='4' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="May" v-bind:month='5' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="June" v-bind:month='6' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="July" v-bind:month='7' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="August" v-bind:month='8' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="September" v-bind:month='9' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="October" v-bind:month='10' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="November" v-bind:month='11' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
        <td>
          <Month name="December" v-bind:month='12' @monthTodoList="monthList" @nowMonth="nowMonth"></Month>
        </td>
      </tr>
    </table>
    <table class="text-center" v-if="todolist.length >= 1">
      <tr>
        <th>num</th>
        <th>month</th>
        <th>content</th>
        <th>status</th>
        <th colspan="2">modify</th>
      </tr>
      <tr v-for="list in todolist" v-bind:key="list.num">
        <td>{{ list.num }}</td>
        <td>{{ list.month }}</td>
        <td>{{ list.content }}</td>
        <td>{{ list.status }}</td>
        <td>
          <button @click="update(list.num, list.month, list.status)">update status</button>
        </td>
        <td>
          <button @click="deleteNum(list.num, list.month)">delete</button>
        </td>
      </tr>
    </table>
    <button @click="insert()" v-if="this.month >= 1">insert</button>
  </div>
</template>

<script>
import Month from "@/components/Month.vue";
import axios from 'axios';

export default {
  data: () => ({
    todolist: [],
    month: Number,
    num: Number
  }),
  components: {
    Month
  },
  methods: {
    nowMonth(nowmonth) {
      this.month = nowmonth
    },
    monthList(monthlist) {
      this.todolist = monthlist
    },
    insert(){
      this.$router.push({path:'/insert/'+this.month})
    },
    update(num, month, status){
      axios.get('/update/'+num+'/'+month+'/'+status)
      .then(res => {
        this.todolist = res.data
      })
      .catch(error => {
          console.log(error)
        })
    },
    deleteNum(num, month){
      axios.get('/delete/'+num+'/'+month)
      .then(res => {
        this.todolist = res.data
      })
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
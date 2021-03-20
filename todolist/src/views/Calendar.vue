<template>
  <div class="text-center">
    <table class="table table-bordered">
      <thead></thead>
      <tbody>
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
      </tbody>
    </table>
    <table class="table table-striped" v-if="todolist.length >= 1">
      <thead>
        <th>num</th>
        <th>month</th>
        <th>content</th>
        <th>status</th>
        <th colspan="2">modify</th>
      </thead>
      <tbody>
        <tr v-for="list in todolist" v-bind:key="list.num">
          <td style="width: 10%">{{ list.num }}</td>
          <td style="width: 10%">{{ list.month }}</td>
          <td style="width: 60%">{{ list.content }}</td>
          <td style="width: 20%">{{ list.status }}</td>
          <td>
            <button class="btn btn-success" @click="update(list.num, list.month, list.status)">update</button>
          </td>
          <td>
            <button class="btn btn-danger" @click="deleteNum(list.num, list.month)">delete</button>
          </td>
        </tr>
      </tbody>
    </table>
    <div class="d-grid gap-2">
      <button class="btn btn-primary" @click="insert()" v-if="this.month >= 1">insert</button>
    </div>
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
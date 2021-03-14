<template>
  <div class="text-center">
    <table>
      <tr>
        <td>
          <Month name="January" v-bind:num='1' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="Febrary" v-bind:num='2' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="March" v-bind:num='3' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="April" v-bind:num='4' @monthTodoList="monthList"></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="May" v-bind:num='5' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="June" v-bind:num='6' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="July" v-bind:num='7' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="August" v-bind:num='8' @monthTodoList="monthList"></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="September" v-bind:num='9' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="October" v-bind:num='10' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="November" v-bind:num='11' @monthTodoList="monthList"></Month>
        </td>
        <td>
          <Month name="December" v-bind:num='12' @monthTodoList="monthList"></Month>
        </td>
      </tr>
    </table>
    <table class="text-center" v-if="todolist.length >= 1">
      <tr>
        <th>num</th>
        <th>month</th>
        <th>content</th>
        <th>status</th>
      </tr>
      <tr v-for="list in todolist" v-bind:key="list.num">
        <td>{{ list.num }}</td>
        <td>{{ list.month }}</td>
        <td>{{ list.content }}</td>
        <td>{{ list.status }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import Month from "@/components/Month.vue";

export default {
  data: () => ({
    todolist: []
  }),
  components: {
    Month
  },
  methods: {
    monthList(monthlist) {
      this.todolist = monthlist
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
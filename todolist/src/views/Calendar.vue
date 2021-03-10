<template>
  <div class="text-center">
    <table>
      <tr>
        <td>
          <Month name="January" v-bind:num='1'></Month>
        </td>
        <td>
          <Month name="Febrary" v-bind:num='2'></Month>
        </td>
        <td>
          <Month name="March" v-bind:num='3'></Month>
        </td>
        <td>
          <Month name="April" v-bind:num='4'></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="May" v-bind:num='5'></Month>
        </td>
        <td>
          <Month name="June" v-bind:num='6'></Month>
        </td>
        <td>
          <Month name="July" v-bind:num='7'></Month>
        </td>
        <td>
          <Month name="August" v-bind:num='8'></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="September" v-bind:num='9'></Month>
        </td>
        <td>
          <Month name="October" v-bind:num='10'></Month>
        </td>
        <td>
          <Month name="November" v-bind:num='11'></Month>
        </td>
        <td>
          <Month name="December" v-bind:num='12'></Month>
        </td>
      </tr>
    </table>
  </div>
</template>

<script>
import Month from "@/components/Month.vue";

export default {
  components: {
    Month
  },
}
</script>

<style>
tr,
td {
  border: 1px solid #000000;
  padding: 10px;
}
</style>
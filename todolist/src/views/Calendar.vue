<template>
  <div class="text-center">
    <table>
      <tr>
        <td>
          <Month name="January" num=1></Month>
        </td>
        <td>
          <Month name="Febrary" num=2></Month>
        </td>
        <td>
          <Month name="March" num=3></Month>
        </td>
        <td>
          <Month name="April" num=4></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="May" num=5></Month>
        </td>
        <td>
          <Month name="June" num=6></Month>
        </td>
        <td>
          <Month name="July" num=7></Month>
        </td>
        <td>
          <Month name="August" num=8></Month>
        </td>
      </tr>
      <tr>
        <td>
          <Month name="September" num=9></Month>
        </td>
        <td>
          <Month name="October" num=10></Month>
        </td>
        <td>
          <Month name="November" num=11></Month>
        </td>
        <td>
          <Month name="December" num=12></Month>
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
<template>
  <div class="text-center">
    <table>
      <tr>
        <td>
          <January to="/jan">January</January>
        </td>
        <!-- <td>
          <Febrary to="/feb">Febrary</Febrary>
        </td>
        <td>
          <March to="/mar">March</March>
        </td>
        <td>
          <April to="/apr">April</April>
        </td>
      </tr>
      <tr>
        <td>
          <May to="/may">May</May>
        </td>
        <td>
          <June to="/jun">June</June>
        </td>
        <td>
          <July to="/jul">July</July>
        </td>
        <td>
          <August to="/aug">August</August>
        </td>
      </tr>
      <tr>
        <td>
          <September to="/sep">September</September>
        </td>
        <td>
          <October to="/oct">October</October>
        </td>
        <td>
          <November to="/nov">November</November>
        </td>
        <td>
          <December to="/dec">December</December>
        </td> -->
      </tr>
    </table>
  </div>
</template>

<script>
import January from "@/components/January.vue";
// import Febrary from "@/components/Febrary.vue";
// import March from "@/components/March.vue";
// import April from "@/components/April.vue";
// import May from "@/components/May.vue";
// import June from "@/components/June.vue";
// import July from "@/components/July.vue";
// import August from "@/components/August.vue";
// import September from "@/components/September.vue";
// import October from "@/components/October.vue";
// import November from "@/components/November.vue";
// import December from "@/components/December.vue";

export default {
  components: {
    January,
    // Febrary,
    // March,
    // April,
    // May,
    // June,
    // July,
    // August,
    // September,
    // October,
    // November,
    // December,
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
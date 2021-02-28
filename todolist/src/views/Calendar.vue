<template>
  <div class="text-center">
    <table>
      <tr>
        <td><router-link to="/jan">January</router-link></td>
        <td>
          <router-link to="/feb">Febrary</router-link>
        </td>
        <td>
          <router-link to="/mar">March</router-link>
        </td>
        <td>
          <router-link to="/apr">April</router-link>
        </td>
      </tr>
      <tr>
        <td>
          <router-link to="/may">May</router-link>
        </td>
        <td>
          <router-link to="/jun">June</router-link>
        </td>
        <td>
          <router-link to="/jul">July</router-link>
        </td>
        <td>
          <router-link to="/aug">August</router-link>
        </td>
      </tr>
      <tr>
        <td>
          <router-link to="/sep">September</router-link>
        </td>
        <td>
          <router-link to="/oct">October</router-link>
        </td>
        <td>
          <router-link to="/nov">November</router-link>
        </td>
        <td>
          <router-link to="/dec">December</router-link>
        </td>
      </tr>
    </table>
  </div>
</template>

<style>
tr,
td {
  border: 1px solid #000000;
  padding: 10px;
}
</style>
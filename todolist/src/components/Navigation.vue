<template>
  <div class="nav">
    <router-link
      class="item"
      v-for="routes in links"
      v-bind:key="routes.id"
      :to="`${routes.page}`"
      >{{ routes.text }}</router-link
    >
    <div>
      <p class="item">{{ dropDown }}</p>
    </div>
  </div>
</template>

<script>
export default {
  name: "Navigation",
  data() {
    return {
      links: [
        {
          id: 0,
          text: "메인으로",
          page: "/",
        },
        {
          id: 1,
          text: "First로 가기",
          page: "/first",
        },
      ],
      dropDown: "멋쟁이사자처럼",
    };
  },
};
</script>
<template>
  <div class="home">
    <HelloWorld msg="FIRST HOME PAGE" />
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld.vue";

export default {
  name: "home",
  components: {
    HelloWorld,
  },
};
</script>
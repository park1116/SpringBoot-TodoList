<template>
  <div>
    <a href="http://localhost:8090/?test=psh">{{ to }}</a>
  </div>
</template>

<script>
export default {
  name: "Month",
  props: {
    to: Number,
  },
};
</script>
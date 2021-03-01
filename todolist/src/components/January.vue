<template>
  <div>
    <a href="/">{{ to }}</a>
  </div>
</template>

<script>
export default {
  name: "January",
  props: {
    to: String,
  },
};
</script>
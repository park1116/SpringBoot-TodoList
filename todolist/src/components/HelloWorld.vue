<template>
  <div>
    <h1>{{ msg }}</h1>
    <p>Hello World~!</p>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String,
  },
};
</script>
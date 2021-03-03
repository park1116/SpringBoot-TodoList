<template>
  <div>
    <a :href="link">{{ name }}</a>
  </div>
</template>

<script>
export default {
  name: "Month",
  props: {
    name: String,
    num: Number,
  },
  data() {
    return{
      link: "http://127.0.0.1:8090/"+this.num
    };
  }
};
</script>
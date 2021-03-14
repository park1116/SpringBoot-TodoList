<template>
    <div>
        parameter : {{param}}
    </div>
</template>

<script>
export default {
    computed: {
        param: function () {
            return this.$route.params;
        }
    }
}
</script>
<template>
  <div class="container">
    <div class="header">
      <h1>Rei do Varejo!</h1>
      <br />
      <hr />
      <span
        >Aqui vc encontra variedade, bons preços e o melhor atendimento!</span
      >
      <h2>Sua melhor loja para compras!</h2>
    </div>
  </div>
</template>

<script>
export default {
  name: "Header",
};
</script>

<style scoped>
.header {
  width: 100%;
  height: 180px;
  background-color: blueviolet;
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
}
</style>
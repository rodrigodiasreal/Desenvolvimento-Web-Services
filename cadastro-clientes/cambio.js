const axios = require('axios');

const moedaBase = 'EURO';

const moedaAlvo = 'BRL';

const apiUrl = `https://api.exchangerate-api.com/v4/latest/${moedaBase}`;

axios.get(apiUrl)

.then(response =>{
    const data = response.data;

    const taxaCambio = data.rates[moedaAlvo];

    console.log(`1 ${moedaBase} equivale a ${taxaCambio} ${USD}`);

})

.catch(error =>{
    console.error('Erro ao obter a cotação:', error);
})
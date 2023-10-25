const axios = require('axios');

const cep = '05834000'; //Substitua pelo Cep que você deseja consultar

//URL da API do ViaCep com o Cep desejado
const apiUrl = `https://viacep.com.br/ws/${cep}/json/`;

//Fazendo a requisição à API do ViaCEP
axios.get(apiUrl)
.then(response =>{
    const data = response.data;
    console.log('CEP:', data.cep);
    console.log('Logradouro:', data.logradouro);
    console.log('Bairro:', data.bairro);
    console.log('Cidade:', data.localidade);
    console.log('Estado:', data.uf);
})
.catch(error =>{
    console.error('Erro ao consultar o CEP:', error);
});
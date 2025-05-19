// ARRAYS I - page: 43

/*

// 1. Cria um array de planetas: Mercúrio, Vénus, Terra, Mart, Jupiter, Saturno, Urano, Neptuno, Plutão.

let planetas = ["Mercúrio", "Vénus", "Terra", "Mart", "Jupiter", "Saturno", "Urano", "Neptuno", "Plutão"];
console.log(planetas)

// 2. Mart foi escrito mal. Substitui pelo nome correcto, Marte.
planetas[planetas.indexOf("Mart")] = "Marte";
console.log(planetas)

// 3. Ups, o planeta Plutão foi removido do Sistema Solar.. Utilizando os métodos dos arrays, remove o planeta da lista.
planetas.pop();
console.log(planetas)

// 4. Descobriste um novo planeta, yaaay. Inventa um nome e adiciona ao início do array.
planetas.unshift("Hollow");
console.log(planetas)

// 5. Faz console.log do array e verifica se está certo.
console.log("Versão final do array:", planetas)


// ARRAYS II

// No vosso ficheiro JS criem o seguinte array multidimensional com os lugares de um avião: 
// (podem encontrar o código na pasta exs do projecto do git).
// const airplaneSeats = [['Ruth', 'Anthony', 'Stevie'], l'Amelia', 'Pedro', 'Maya'], ['Xavier', 'Ananya', 'Luis'], ['Luke', null, 'Deniz'], ['Rin', 'Sakura', 'Francisco']];


const airplaneSeats = [
    ['Ruth', 'Anthony', 'Stevie'], 
    ['Amelia', 'Pedro', 'Maya'], 
    ['Xavier', 'Ananya', 'Luis'], 
    ['Luke', null, 'Deniz'], 
    ['Rin', 'Sakura', 'Francisco']
];

// No sítio onde existe um lugar vago, assignem o vosso nome. 
// Façam console.log() do novo array para confirmar se vos foi atribuído o lugar.

airplaneSeats[3][1] = "Laís";
console.log(airplaneSeats);



// OBJECT LITERALS

// 1. Cria um objecto chamado PRODUCT com as seguintes propriedades:
// NOME e assigna-lhe um nome à tua escolha.
// INSTOCK, como verdadeiro.
// PRICE com o valor 1.99
// COLORS, com um array de vermelho, azul e verde;



const product  = {
    nome: "Lápis", 
    instock: true, 
    price: 1.99, 
    colors: ["Vermelho", "Azul", "Verde"]
}

// 2. Imprime na consola os seguintes valores:
// PRICE
// COR VERDE

produtoPreco = product.price;
produtoCorVerde = product.colors[2];

console.log(`O preço do produto é ${produtoPreco} e a cor é ${produtoCorVerde}`)

// 3. Ups, a inflacção chegou à nossa loja. Muda o valor do produto para 2.55

novoPreco = product.price = 2.55;
console.log("Nova lista de produto: ", product);


// LOOPS - page: 55

// Lembra-se da música l'm blue dos Eiffel 65? 
// Vamos usar o ciclo for para escrever 6 vezes o 'Da ba dee da ba daa';

for (let i = 1; i < 7; i++)
{
    console.log(i, "Da ba dee da ba daa");
}

// 2. Faça um ciclo for que imprima estes números, por esta ordem: 25, 20, 15, 10, 5

for (let i = 25; i > 0; i--)
    {
        if (i % 5 == 0) {
            console.log(i);
        }
    }

// 1. Declare o seguinte array:
// const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];

const people = ["Scooby", "Velma", "Daphne", "Shaggy", "Fred"];

// 2. Imprima na página os nomes em letra maiúscula.


for (let i = 0; i < people.length; i++){
    console.log(people[i].toUpperCase());
}

// p: 62

// 1. Utilizando os loops e as condições que já aprendemos, construa uma lista de compras.
// Dicas:
// A lista é um array.
// Fazer prompt para o utilizador adicionar items na lista, e adicionar esses items ao array.
// Criar uma variável "código" e se o utilizador digitar isso, o ciclo acaba e a lista aparece. 
// Por exemplo, se digitar 'fim', deixam de aparecer prompts.

let codigo;
let addToGrocery;
let groceryList = [];

while (codigo != 0) {
    addToGrocery = prompt('Adicione um item a lista | 0 para sair: ');
    groceryList.push(addToGrocery);
    codigo = addToGrocery;
}

groceryList.pop();
console.log("Your shopping list")
for (let i = 0; i < groceryList.length; i++) {
    console.log(i + 1 + " - " + groceryList[i])
}

// Agora use a entrada "apagar" para apagar o último item adicionado a lista

let codigo;
let addToGrocery;
let deleted;
let groceryList = [];

while (codigo != 0) {
    addToGrocery = prompt('Adicione um item a lista | 0 para sair: ');
    groceryList.push()
    if (addToGrocery == "apagar") {
        deleted = delete addToGrocery[addToGrocery.indexOf("apagar")];
        groceryList.pop();
    }
    
    codigo = addToGrocery;
}

groceryList.pop();
console.log("Your shopping list")
for (let i = 0; i < groceryList.length; i++) {
    console.log(i + 1 + " - " + groceryList[i])
}


// Agora use possibilite o usuário apagar qualquer item da lista´ 
// */
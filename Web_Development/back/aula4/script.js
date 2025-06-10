// 1. Guarde o seguinte array no seu código:
// const fullNames = [{first: 'Albus', last: 'Dumbledore'}, {first: 'Harry', last: 'Potter'},
// {first: 'Hermione', last: 'Granger'}, {first: 'Ron', last: 'Weasley'}, {first: 'Rubeus', last:
// 'Hagrid'}, {first: 'Minerva', last: 'McGonagall'}, {first: 'Severus', last: 'Snape’}];

const fullNames = [{first: 'Albus', last: 'Dumbledore'}, {first: 'Harry', last: 'Potter'},
    {first: 'Hermione', last: 'Granger'}, {first: 'Ron', last: 'Weasley'}, 
    {first: 'Rubeus', last:'Hagrid'}, {first: 'Minerva', last: 'McGonagall'}, {first: 'Severus', last: 'Snape'}]

// 2. Crie um novo array chamado firstNames que nos retorne os primeiros Nomes do Array Original.

// array mapeado (cria um novo array)
const firstNames = fullNames.map(function(name) {
    return name.first
})

console.log(firstNames);

// array original transformado para dizer o primeiro e o último nome 
const fullName = fullNames.map(function(name) {
    return `${name.first} ${name.last}`
})

console.log(fullName);

// Usando as Arrow Functions, crie uma função chamada greet que receba um
// argumento que represente o nome de uma pessoa.

let myName = "Laís";

// tradicional

function greet(name){
    return `Hey, ${name}`
}

console.log(greet(myName))


const greeting = (name) => {
    return `Hello, ${name}`
}

const greetingAgain = name => "Olá " + name;

console.log(greeting(myName))
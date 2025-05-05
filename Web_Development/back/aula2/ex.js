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

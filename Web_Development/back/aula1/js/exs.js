let myLuckyNumber = 7;
let myName = "Laís";
const MESSAGE = " TASTE THE RAINBOW ";
const WHISPER = MESSAGE.toLowerCase().trim();
const WORD = "skateboard";
const FACIALHAIR = WORD.slice(5).replace("o", "e");
let firstName = null;
let secondName = null;

// alert(myName + " " + myLuckyNumber);
console.log(WHISPER);
console.log(FACIALHAIR);
console.log(WORD)


// firstName = prompt('Qual o seu nome?'); 
// secondName = prompt('Qual o seu segundo nome?');
// console.log(firstName, secondName);
// alert(`Olá, ${firstName} ${secondName}`);

/* Através do prompt, peça ao utilizador uma password com pelo menos 6 aracteres...
Caso a mesma não cumpra as condições, informe o mesmo, dizendo que a pass é inválida. */

/*
let userPassword = prompt("Digite uma senha com pelo menos 6 caracteres: ")

if ((userPassword.length) < 6) {
    alert("A senha é muito pequena")
} else {
    alert("A senha preenche os requisitos")
}
*/

let weekDay = prompt("Qual o dia da semana?").toLowerCase();

if (weekDay == "sexta") {
    alert('Yay, sobrevivemos a mais uma semana!');
} else {
    alert('Ainda temos trabalho a fazer');
}

switch (weekDay) {
    case "segunda feira":
        alert("Hoje é segunda-feira");
        break;
    case "terça feira":
        alert("Hoje é terça feira");
        break;
    case "quarta feira":
        alert("Hoje é quarta feira");
        break;
    case "quinta feira":
        alert("Hoje é quinta feira");
        break;
    case "sexta feira":
        alert("Hoje é sexta feira");
        break;
    case "sábado":
        alert("Hoje é sábado");
        break;
    case "domingo":
        alert("Hoje é domingo");
        break;
    default:
        alert("Ops, esse dia não existe.")
}

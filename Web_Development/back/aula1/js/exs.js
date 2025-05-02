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

let weekDay = prompt("Qual o dia da semana?").toLowerCase();

if (weekDay == "sexta") {
    alert('Yay, sobrevivemos a mais uma semana!');
} else {
    alert('Ainda temos trabalho a fazer');
}

/*
switch (weekDay) {
    case "segunda feira":
        alert("segunda-feira");
        break;
    case "terça feira":
        alert("terça feira");
        break;
    case "quarta feira":
        alert("quarta feira");
        break;
    case "quinta feira":
        alert("quinta feira");
        break;
    case "sexta feira":
        alert("sexta feira");
        break;
    case "sábado":
        alert("sábado");
        break;
    case "domingo":
        alert("domingo");
        break;
    default:
        alert("Ops, esse dia não existe.")
}
*/
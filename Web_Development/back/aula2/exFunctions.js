// Funções p. 64
// Escreva uma função chamada printHeart que envie um alerta com um coração (<3);

function printHeart() {
    alert("❤️");
}

// Escreva uma função chamada rant que aceite um argumento chamado message.
// A função deverá ser associada a um botão que, quando clicado, deverá
// imprimir o que utilizador quiser definir como mensagem 3 vezes em letra maiúscula.

function rant(message) {
    for (let i = 0; i <= 2; i++) {
        console.log("I HATE " + message.toUpperCase() + "!");
    }
}

function tellMeWhatYouHate(){
    let hate = prompt("Tell me what you hate: ");
    rant(hate);
}

// Vamos jogar um jogo chamado ‘olhos de cobra’. Escreva uma função chamada
// isSnakeEyes que aceite dois números como inputs.
// Se ambos os números forem 1, escreva uma mensagem a dizer: ‘Yay, snake eyes’,
// se não ‘Não são olhos de cobra’:

function isSnakeEyes(numberOne, numberTwo) {
    numberOne = prompt('Add one number: ');
    numberTwo = prompt('Add another number: ');
    if (numberOne == 1 && numberTwo == 1) {
        console.log("Yay, snake eyes");
    } else {
        console.log("There's no snake eyes");
    }
}


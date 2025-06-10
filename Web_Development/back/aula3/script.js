// 1. Escreva uma função chamada multiply que receba dois valores 
// e retorne o resultado da multiplicação dos mesmos.

function multiply(numberOne, numberTwo){
    return numberOne * numberTwo;
}

// 2. O tempo está incerto e eu não sei se deva vestir calções ou calças, ajude-me a decidir. 
// Escreva uma função chamada isShortsWeather que aceite um argumento a que podemos chamar temperature. 
// Se a temperatura for maior que 25, retorna verdadeiro. Se não, retorna falso.

function isShortsWeather(temperature){
    return temperature > 25;
}

// 3. Escreva uma função chamada lastElement que aceite um array. 
// Essa função deve retornar o último elemento do array (sem o remover). 
// Se o array for vazio, a função deve retornar null.

function lastElement(array){
    if (array.length === 0) {
        return null;
    }
    return array[array.length - 1];
}


// 4. Escreva uma função chamada sumArray que aceite um array de números. 
// A função deve retornar a soma de todos os números do array.

function sumArray(array){
    let sum = 0;
    for (let i = 0; i < array.length; i++){
        sum += array[i];
    }
    return sum;
}

// 5. Escreva uma função chamada returnDay. A função aceita um parâmetro de 1 a 7 e retorna o dia
// correspondente: 1, retorna segunda, 2, retorna Terça, etc.... Se o número for menor que 1 ou maior que 7,
// a função deve retornar null.

function returnDay(choice){
    const days = {
        1: "Segunda",
        2: "Terça",
        3: "Quarta",
        4: "Quinta",
        5: "Sexta",
        6: "Sábado",
        7: "Domingo"
    };
    return days[choice] || null;
}


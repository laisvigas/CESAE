// a. Ler as notas de N alunos e calcular a média aritmética da turma.
/*
let totalStudents: number = 0;
let i: number = 0;
let grade: number = 0;
let sum: number = 0;
let average: number = 0;

totalStudents = Number(prompt('Enter the number of students: '));

do {
    grade = Number(prompt(`Enter grade for student ${i + 1}: `));
    sum += grade;
    i++;
} while (i < totalStudents);

average = sum / totalStudents;
alert(`The average grade of the class is ${average.toFixed(2)}`);



// ______________________________________________________________________________________________________
// b. Ler as notas de N alunos de uma turma e apresentar o total de negativas.
let totalStudents: number = 0;
let grade: number = 0;
let fails: number = 0;

totalStudents = Number(prompt('Enter the number of students: '));

for (let i = 0; i < totalStudents; i++) {
    grade = Number(prompt(`Enter grade for student ${i + 1}: `));
    if (grade < 10) {
        fails++;
    }
}

alert(`Total of failing grades: ${fails}`);


// ______________________________________________________________________________________________________
// c. Apresentar todos os números pares entre X e Y.
let x: number = Number(prompt('Enter the starting number: '));
let y: number = Number(prompt('Enter the ending number: '));

let output: string = '';

for (let num = x; num <= y; num++) {
    if (num % 2 === 0) {
        output += num + ' ';
    }
}

alert(`Even numbers between ${x} and ${y}: ${output}`);


// ______________________________________________________________________________________________________
// d. Ler números até ser inserido o número 0 e que permita calcular a soma
// e média de todos os números introduzidos.
let number: number;
let sum: number = 0;
let count: number = 0;

do {
    number = Number(prompt('Enter a number [0 to stop]: '));
    if (number !== 0) {
        sum += number;
        count++;
    }
} while (number !== 0);

if (count > 0) {
    const average = sum / count;
    alert(`Sum: ${sum} | Number of numbers entered: ${count} | Average: ${average.toFixed(2)}`);
} else {
    alert('No numbers were entered.');
}



// ______________________________________________________________________________________________________
// e. Determinar a percentagem dos N alunos de uma turma
// com idade superior a uma dada idade definida pelo utilizador.
let n: number = Number(prompt('Enter the number of students: '));
let ageThreshold: number = Number(prompt('Enter the age threshold: '));
let countAboveThreshold: number = 0;

for (let i = 0; i < n; i++) {
    let age: number = Number(prompt(`Enter age of student ${i + 1}: `));
    if (age > ageThreshold) {
        countAboveThreshold++;
    }
}

let percentage = (countAboveThreshold / n) * 100;

alert(`Percentage of students older than ${ageThreshold}: ${percentage.toFixed(2)}%`);


// ______________________________________________________________________________________________________
// f. Ler uma sequência de números inteiros até que sejam introduzidos
// 5 números ímpares e que mostre o maior número par.
// Se não tiver sido introduzido nenhum número par deve aparecer uma mensagem adequada.
let oddCount = 0;
let maxEven = 0;
let evenFound = false;

while (oddCount < 5) {
    let num = Number(prompt('Enter an integer number: '));

    if (num % 2 !== 0) {
        oddCount++;
    } else {
        if (!evenFound) {
            maxEven = num;
            evenFound = true;
        } else if (num > maxEven) {
            maxEven = num;
        }
    }
}

if (evenFound) {
    alert(`The largest even number entered is: ${maxEven}`);
} else {
    alert('No even number was entered.');
}
*/

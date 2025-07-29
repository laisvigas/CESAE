// a - Elabore um algoritmo que leia um número inteiro e que diga se o número é par ou ímpar.
/*
let number: number = 0;

number = Number(prompt('Please, enter a number: '));

if (number % 2 === 0) {
    alert(`The number ${number} is even.`);
} else {
    alert(`The number ${number} is odd.`);
}

// ______________________________________________________________________________________________________
// b - Dadas as notas do exame escrito e do oral de um aluno,
// verificar se este obteve aprovação (ExEscrito=70%, ExOral=30%, aprovação ≥ 10).

let writtenExam: number = 0;
let oralExam: number = 0;
let finalGrade: number = 0;

writtenExam = Number(prompt('Please, enter the written exam grade: '));
oralExam = Number(prompt('Please, enter the oral exam grade: '));

finalGrade = (writtenExam * 0.7) + (oralExam * 0.3);

if (finalGrade >= 10) {
    alert(`Final grade is ${finalGrade.toFixed(2)}. Student passed.`);
} else {
    alert(`Final grade is ${finalGrade.toFixed(2)}. Student failed.`);
}

// ______________________________________________________________________________________________________
// c. Pretende-se calcular o salário semanal de um empregado. Sabe-se que o número de horas semanais é
// 36 e que o preço da hora é de 7,5€. Se o empregado fizer horas extra (mais de 36 horas) recebe 10€
// por cada hora extra.
// Elabore um algoritmo que calcule o salário semanal de um empregado a partir do nº de horas que este
// trabalhou.

let workedHours: number = 0;
let salary: number = 0;
const regularHours: number = 36;
const regularRate: number = 7.5;
const overtimeRate: number = 10;

workedHours = Number(prompt('Please, enter the number of hours worked this week: '));

if (workedHours <= regularHours) {
    salary = workedHours * regularRate;
} else {
    salary = (regularHours * regularRate) + ((workedHours - regularHours) * overtimeRate);
}

alert(`The weekly salary is €${salary.toFixed(2)}`);


// ______________________________________________________________________________________________________
// d. Uma empresa decidiu classificar os seus empregados em quatro grupos:
// i. Grupo 1 - Solteiros com menos de 25 anos
// ii. Grupo 2 - Solteiros com 25 anos ou mais
// iii. Grupo 3 - Casados com menos de 34 anos
// iv. Grupo 4 - Casados com 34 anos ou mais
// Crie um algoritmo que determine a que grupo corresponde um dado empregado lendo o estado civil (0
// para solteiro e 1 para casado) e a sua idade.

let civilStatus: number = 0;
let age: number = 0;

civilStatus = Number(prompt('Enter civil status (0 for single, 1 for married): '));
age = Number(prompt('Enter the age of the employee: '));

if (civilStatus === 0 && age < 25) {
    alert('Employee belongs to Group 1 - Single and under 25 years old.');
} else if (civilStatus === 0 && age >= 25) {
    alert('Employee belongs to Group 2 - Single and 25 years or older.');
} else if (civilStatus === 1 && age < 34) {
    alert('Employee belongs to Group 3 - Married and under 34 years old.');
} else if (civilStatus === 1 && age >= 34) {
    alert('Employee belongs to Group 4 - Married and 34 years or older.');
} else {
    alert('Invalid input. Please enter valid civil status and age.');
}


// ______________________________________________________________________________________________________
// e. Construa um programa que aceite números entre 1 e 7 e a cada um deles faça corresponder o dia da
// semana. Por exemplo, lendo o número 1 o programa deverá escrever “domingo” e lendo o número 7
// devera escrever “sábado”.

let dayNumber: number = 0;
let dayName: string = '';

dayNumber = Number(prompt('Enter a number between 1 and 7: '));

switch (dayNumber) {
    case 1:
        dayName = 'Sunday';
        break;
    case 2:
        dayName = 'Monday';
        break;
    case 3:
        dayName = 'Tuesday';
        break;
    case 4:
        dayName = 'Wednesday';
        break;
    case 5:
        dayName = 'Thursday';
        break;
    case 6:
        dayName = 'Friday';
        break;
    case 7:
        dayName = 'Saturday';
        break;
    default:
        dayName = 'Invalid number.';
}

alert(dayName);


// ______________________________________________________________________________________________________
// f. Um banco concede um crédito especial aos seus clientes, variável com o saldo médio no último ano.
// Construa um algoritmo que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com
// a tabela abaixo. Mostre uma mensagem informando o saldo médio e o valor do crédito.
// i. de 0 a 200 - nenhum crédito
// ii. de 201 a 400 - 20% do valor do saldo médio
// iii. de 401 a 600 - 30% do valor do saldo médio
// iv. acima de 601 - 40% do valor do saldo médio

let averageBalance: number = 0;
let credit: number = 0;

averageBalance = Number(prompt('Enter the average balance over the last year: '));

if (averageBalance <= 200) {
    credit = 0;
} else if (averageBalance <= 400) {
    credit = averageBalance * 0.2;
} else if (averageBalance <= 600) {
    credit = averageBalance * 0.3;
} else {
    credit = averageBalance * 0.4;
}

alert(`Average balance: €${averageBalance.toFixed(2)}\nSpecial credit: €${credit.toFixed(2)}`);


// ______________________________________________________________________________________________________
// g. Uma empresa concede aumentos de salário aos seus funcionários, variáveis de acordo com o cargo.
// Construa um algoritmo que leia o salário e o cargo de um funcionário e calcule o novo salário. Se o
// cargo do funcionário não estiver na tabela, ele devera, então, receber 10% de aumento. Mostre o
// salário antigo, o novo salário e a diferença.
// Os cargos considerados (e seus códigos) são:
// i. 101 Gerente 25% ;
// ii. 102 Engenheiro 20%;
// iii. 103 Técnico 15%

let salary: number = 0;
let positionCode: number = 0;
let newSalary: number = 0;
let increase: number = 0;

salary = Number(prompt('Enter the current salary: '));
positionCode = Number(prompt('Enter the position code (101 for Manager, 102 for Engineer, 103 for Technician): '));

if (positionCode === 101) {
    increase = salary * 0.25;
} else if (positionCode === 102) {
    increase = salary * 0.20;
} else if (positionCode === 103) {
    increase = salary * 0.15;
} else {
    increase = salary * 0.10;
}

newSalary = salary + increase;

alert(`Old salary: €${salary.toFixed(2)}\nNew salary: €${newSalary.toFixed(2)}\nIncrease: €${increase.toFixed(2)}`);
*/


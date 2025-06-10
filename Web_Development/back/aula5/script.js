const usernames = ["mark", "staceymom1978", "q9825892759238", "carrie98", "MoanaFan"];

const less10 = usernames.filter(c => {
    if (c.length < 10){
        return c;
    }
})

console.log(less10);

const numeros = [1, 2, 3, 4, 5, 6, 7, 9]
const even = [2, 4, 6, 8, 10]
const moreNums = [2, 4, 6, 8, 10, 11]

const isJustEven = numeros.every(numero => {
    return numero % 2 === 0;
})

const someEven = numeros.some(numero => {
    return numero % 2 === 0;
})

console.log(isJustEven);
console.log(someEven);

const sumList = numeros.reduce((accumulator, currentValue) => {
    return accumulator + currentValue;
})

console.log(sumList);
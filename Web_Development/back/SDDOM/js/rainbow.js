let allLetters = document.querySelectorAll("span");
const colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

for(let element in allLetters){
     console.log(element)
     allLetters[element].style.color = colors[element]
}

/*
let spans = document.querySelectorAll('span');
const colors = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];
 
// let counter = 0;
for(let element in spans){
     console.log(element)
     spans[element].style.color = colors[element]
}
 */

/*
let count = 0
for (let letter of allLetters){
    letter.style.color = colors[count];
    count++;
}
*/
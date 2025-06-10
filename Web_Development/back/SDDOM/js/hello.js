//Ao passar em cima do botão Hello (não clicar) deverá fazer
//um alert que diga ‘olá’
//• Ao passar em cima do botão Bye deverá fazer um alert que diga ‘Adeus’


const helloBtn = document.getElementById("hello");
const goodbyeBtn = document.getElementById("goodbye");
const changeColourBtn = document.getElementById("change-color");
const newColor = document.getElementById("new-color")

helloBtn.addEventListener("mouseover", function(){
    console.log("Hello");
    alert("Hello!");
});

goodbyeBtn.addEventListener("mouseover", function(){
    alert("Bye!");
});

function randomInt(min, max) { 
  return Math.floor(Math.random() * (max - min + 1) + min);
}

changeColourBtn.addEventListener("click", function(){
    newColor.style.width = "170px";
    let r = randomInt(0, 255);
    let g = randomInt(0, 255);
    let b = randomInt(0, 255);
    let rgbResult = `rgb${r}, ${g}, ${b}`
    newColor.style.backgroundColor = 'rgb(' + r + ',' + g + ',' + b + ')';
    newColor.innerText = rgbResult;
});
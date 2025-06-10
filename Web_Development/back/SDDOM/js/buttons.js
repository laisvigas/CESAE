let myDiv = document.getElementById('container');

for (let i = 0; i < 100; i++){
    let myButton = document.createElement('button');
    myButton.innerText = 'click here!';
    
    myButton.classList.add('classListTest');
    myDiv.appendChild(myButton);
}
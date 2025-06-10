const myImg = document.querySelector("img");

function eggChicken(){
    if (myImg.src == "https://devsprouthosting.com/images/egg.jpg"){
        myImg.setAttribute("src", "https://devsprouthosting.com/images/chicken.jpg")
    } else {
        myImg.setAttribute("src", "https://devsprouthosting.com/images/egg.jpg")
    }
}
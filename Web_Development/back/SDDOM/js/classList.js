function changeHighlight(){
    myList = document.querySelectorAll("li");

    for(let element of myList){
        element.classList.remove("highlight");
    }
}
const numsList = document.querySelectorAll(".num")

for(let num of numsList){
    num.addEventListener("click", function() {
        console.log(this.value)
    })
}
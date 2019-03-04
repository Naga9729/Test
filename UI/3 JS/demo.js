
function getFood() {
    return "No Food"
}

function getFood(pay) {
    if (arguments.length === 0) return "No Food"
    return "Biryani"
}

console.log(getFood(76))  //?
//console.log(getFood(100))
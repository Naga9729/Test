/*
var emp={
    "name":"Praveen",
    "id":18344848,
    "desgination":"Trainer"
}

console.log(emp);
console.log(JSON.stringify(emp))
*/
// Arrays on JSON

var emp={
    "name":"Praveen",
    "id":18344848,
    "desgination":"Trainer",
    "technologiesKnwon":["Java","Database","Security"]
}

var emps=[

    {
        "name":"Praveen",
        "id":18344848,
        "desgination":"Trainer",
        "technologiesKnwon":["Java","Database","Security"],
        "age":76
    },
    {
        "name":"James",
        "id":3435455,
        "desgination":"Developer",
        "technologiesKnwon":["Java","Spring","Struts"]
    }

];

for(var i=0;i<emps.length;i++){
    console.log(emps[i].name);
    console.log(emps[i].desgination);
    console.log("-----------");
    
        
}

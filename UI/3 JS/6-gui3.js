function validateForm(){

    let fn=document.getElementById("fn").value;
    let lastName=document.getElementById("ln").value;

    let status=true;
    
    
    if(fn==null || fn=="" || fn==" "){
        document.getElementById("fn.err").innerHTML="First name required";
   
        status=false;
    }else{
        document.getElementById("fn.err").innerHTML="";
    }

    if(lastName==null || lastName=="" || lastName==" "){
        document.getElementById("ln.err").innerHTML="Last name required";
       status=false;
    }else{
        document.getElementById("ln.err").innerHTML="";
    }

    return status;

}
function validateForm() {

    let fn = document.getElementById("fn").value;
    let lastName = document.getElementById("ln").value;

    let status = true;
    if (!(fn.search(/[^a-zA-Z]+/) === -1)) {
        document.getElementById("fn.err").innerHTML = "First name should not contains special characters and numbers";
        status = false;

    }

    if (fn == null || fn == "" || fn == " ") {
        document.getElementById("fn.err").innerHTML = "First name required";

        status = false;
    } else if(status) {
        document.getElementById("fn.err").innerHTML = "";
    }

    if (lastName == null || lastName == "" || lastName == " ") {
        document.getElementById("ln.err").innerHTML = "Last name required";
        status = false;
    } else {
        document.getElementById("ln.err").innerHTML = "";
    }

    return status;

}
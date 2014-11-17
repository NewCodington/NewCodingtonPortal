function validateForm() {
	var ename = document.getElementById("uname").value;
	var epass = document.getElementById("pass").value;
	
	/* Topic : Javascript
	 * Instructions:
	 * 		Ensure that the employee id and name are not empty.
	 *
	 * Hint:
	 * Use the length property of the variable
	 *
	 */ 
	if (ename.length == 0) {
		alert("Enter name");
	} else if (epass.length == 0) {
		alert("Enter password")
	} else {
		alert("Registering " + ename + " ...")
	}
		
	return true;
}

function validateEmail(){
	
	var email = document.getElementById("email").value;
	
    var atpos = email.indexOf("@");
	alert("Ey2");
	alert(atpos);
    var dotpos = email.lastIndexOf(".");
	alert(dotpos);
    if (atpos< 1 || dotpos<atpos+2 || dotpos+2>=email.length) {
        alert("Not a valid e-mail address");
        return false;
    }

}


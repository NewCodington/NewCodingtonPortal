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

function validateOk(){
	alert("Ok");
}


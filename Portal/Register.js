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
	if (!validateEmail())return false;
	if (!validateConfirmPass())return false;
		
	return true;
}

function validateEmail(){
	
	var email = document.getElementById("email").value;
	
    var atpos = email.indexOf("@");

    var dotpos = email.lastIndexOf(".");
	()[]\;:,<> or space 
	var wrongchar = ["(",")","[","]",""\"",";",":","<",">"," "];
	for (i = 0; i < wrongchar.length; i++){}
	var wrongchar
	
	if(atpos > 0 && email[atpos-1] !=="."){
		alert("Not a valid e-mail address");
		return false;
	}
	
    if (atpos< 1 || dotpos<atpos+2 || dotpos+1>=email.length) {
        alert("Not a valid e-mail address");
        return false;
    }
	return true
}

function validateConfirmPass(){
	var pass = document.getElementById("pass").value;
	var conpass = document.getElementById("cpass").value;

    if (pass != conpass) {
        alert("Password and confirm password is not the same");
        return false;
    }
	return true;

}


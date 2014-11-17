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

	var wrongchar = ["(",")","[","]","'\'",";",":","<",">"," "];
	
	for (i = 0; i < wrongchar.length; i++){
		if (email.indexOf(wrongchar[i])>=0){
			alert("Invalid character in the e-mail address");
			return false;
		}
	}

	
	if(atpos > 0 && email[atpos-1] !=="."){
		alert("Not a valid e-mail address");
		return false;
	}
	
    if (atpos < 1 || dotpos<atpos+2 || dotpos+1>=email.length) {
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

function validateDni(){
 
	var dni = document.getElementById("dni").value;
	
    if (dni.length > 0) {
	alter("donde falla")
	
        if(dotpos = dni.indexOf(".")>0){
		    var subdni = dni.slice(dotpos + 2,length - 2);
			alert(dni);
			if(dotpos = subdni.indexOf(".")>2)
			{
			  alert(subdni);
		    }
		
		if (dotpos < 2 || dotpos<atpos+2 || dotpos+1>=email.length) {
		
        alert("Not a valid e-mail address");
        return false;
		}
    
	}
    }
	return true;

}


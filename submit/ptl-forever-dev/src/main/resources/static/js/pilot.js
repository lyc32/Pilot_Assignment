function openEmail(emailTo, jobId, jobTitle){
    console.log(emailTo, jobId, jobTitle);
    //default email app can be set in mail application's preference
    window.open ("mailto:"+emailTo+"?subject=Apply For Position: "+jobId+" "+jobTitle);
}

function validateRegistration(){
    debugger;
    var _password = document.getElementById('password');
    var _password2 = document.getElementById('reenter-password');
    if(_password2 && _password2.value
        && _password2.value === _password.value){
        return true;
    }else{
        document.getElementById("validation-error").removeAttribute("hidden");
        return false;
    }
}

function retrieveProgram(id){
    let items = $("[id$=-detail]");
    for(let item of items){
        item.hidden = true;
    }
    let _target = document.getElementById(id + '-detail');
    _target.hidden = false;
    _target.scrollIntoView({ behavior: 'smooth', block: 'start' });
}


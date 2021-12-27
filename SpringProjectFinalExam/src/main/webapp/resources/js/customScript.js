/**
 홈페이지 가입에 사용하는 자바스크립
 */

var email = document.getElementById('email');
var emailForward = document.getElementById('emailForward');
var emailBackward = document.getElementById('emailBackward');
var telFirst = document.getElementById('telFirst');
var telMiddle = document.getElementById('telMiddle');
var telLast = document.getElementById('telLast');
var tel = document.getElementById('tel');
var btn = document.getElementById('registerBtn');
var passwd = document.getElementById('passwd');
var passwdre = document.getElementById('passwdre');


btn.addEventListener('click', function() {
    if(passwd.value != passwdre.value) {
        alert("비밀번호가 일치하지 않습니다.");
        passwd.value = "";
        passwdre.value = "";
        passwd.focus();
        return false;
    } else {
        email.value = emailForward.value + "@" + emailBackward.value;
        tel.value = telFirst.value + "-" + telMiddle.value + "-" + telLast.value;
    }
});
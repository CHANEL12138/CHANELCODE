function changeSubmitAttributeEnable() {

    var node = document.getElementsByClassName("form-submit");
    node[0].removeAttribute("disabled");

}
function changeSubmitAttributeDisable() {
    var node = document.getElementsByClassName("form-submit");
    node[0].setAttribute("disabled","disabled");

}
function checkForm() {
    var usernameNode = document.getElementById("username");
    var passwordNode = document.getElementById("password");

    var usernameVal = usernameNode.value;
    var passwordVal = passwordNode.value;

    if(''===usernameVal)
    {
        alert("请输入用户名！")
        return false;
    }
    if(''===passwordVal)
    {
        alert("请输入密码！")
        return false;
    }



    return false;
}
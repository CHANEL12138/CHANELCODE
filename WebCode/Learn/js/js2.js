onload = function f() {
    var obj = document.getElementById("username").onkeydown =
        function (event) {
        if(event.keyCode===13)
            alert("Logining>>>>>>>>>>")
            else if(event.keyCode===27)
                alert("Exiting>>>>>>>>")
    }
    document.getElementById("button").onclick = function () {
        alert("Logining>>>>>>>>>>>")
    }
}




function validateForm() {
    var user = document.getElementById("username").value;
    var pass = document.getElementById("password").value;

    if (user !== "" && pass !== "") {
        document.getElementById("frm").submit();

    } else {
        alert("please fill the form");
    }
}
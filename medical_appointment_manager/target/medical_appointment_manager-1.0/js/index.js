$(document).ready(function () {

    $("#form-login").submit(function (event) {

        event.preventDefault();
        autenticarUsuario();
    });

    $("#form-register").submit(function (event) {
        event.preventDefault();
        registrarUsuario();
    });


});

function autenticarUsuario() {

    let username_paciente = $("#username_paciente").val();
    let contrasena = $("#contrasena").val();

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPacienteLogin",
        data: $.param({
            username_paciente: username_paciente,
            contrasena: contrasena
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                $("#login-error").addClass("d-none");
                let username_paciente = parsedResult['username_paciente'];
                document.location.href = "home.html?username_paciente=" + username_paciente;
            } else {
                $("#login-error").removeClass("d-none");
            }
        }
    });
}
function registrarUsuario() {

    let username_paciente = $("#input-username_paciente").val();
    let contrasena = $("#input-contrasena").val();
    let contrasenaConfirmacion = $("#input-contrasena-repeat").val();
    let nombre = $("#input-nombre").val();
    let apellido = $("#input-apellido").val();
    let edad = $("#input-edad").val();
    let genero = $("#input-genero").val();
    let email = $("#input-email").val();
    let regimen = $("#input-regimen").val();

    if (contrasena == contrasenaConfirmacion) {

        $.ajax({
            type: "GET",
            dataType: "html",
            url: "./ServletUsuarioPacienteRegister",
            data: $.param({
                username_paciente: username_paciente,
                contrasena: contrasena,
                nombre: nombre,
                apellido: apellido,
                edad: edad,
                genero: genero,
                email: email,
                regimen:regimen
            }),
            success: function (result) {
                let parsedResult = JSON.parse(result);

                if (parsedResult != false) {
                    $("#register-error").addClass("d-none");
                    let username_paciente = parsedResult['username_paciente'];
                    document.location.href = "home.html?username_paciente=" + username_paciente;
                } else {
                    $("#register-error").removeClass("d-none");
                    $("#register-error").html("Error en el registro del usuario");
                }
            }
        });
    } else {
        $("#register-error").removeClass("d-none");
        $("#register-error").html("Las contraseñas no coinciden");
    }
}




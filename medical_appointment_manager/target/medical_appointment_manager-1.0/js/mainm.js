//var username_paciente = new URL(location.href).searchParams.get("username_paciente");
//var user;

$(document).ready(function () {


    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });
    getUsuario().then(function () {


    });

});
async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletListarMedicos",
        data: $.param({

        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {

                //mostrarmedicos(parsedResult);
                mostrarmedicos(parsedResult);
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });

}
function mostrarmedicos(medico) {

    let contenido = "";

    $.each(medico, function (index, medicos) {
        medicos = JSON.parse(medicos);
        //window.window.alert(medicos);

        contenido += '<option value="' + medicos.username_medico + '">' + medicos.nombre+ " " + medicos.apellido + '</option>'
                
    });
    $("#ordenar-fecha").html(contenido);
    //window.window.alert(contenido);
}





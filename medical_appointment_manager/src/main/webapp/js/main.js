var username_paciente = new URL(location.href).searchParams.get("username_paciente");
var user;

$(document).ready(function () {


    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });
    getUsuario().then(function () {
        getCita(false, "ASC");

    });

});
async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username_paciente: username_paciente
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;
                
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });

}
function getCita(ordenar, orden) {

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletCitaListar",
        data: $.param({
            ordenar: ordenar,
            orden: orden
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);
            if (parsedResult != false) {
                mostrarcitas(parsedResult);
                mostrarpaciente(nombre);
            } else {
                console.log("Error recuperando los datos de las peliculas");
            }
        }
    });
}
function mostrarcitas(cita) {

    let contenido = "";
        
    $.each(cita, function (index, citas) {
        citas = JSON.parse(citas);
        contenido += '<tr><th scope="row">' + citas.id_cita + '</th>' +
                '<td>' + citas.fecha_cita + '</td>' +
                '<td>' + citas.hora_cita + '</td>' +
                '<td>' + citas.username_paciente + '</td>' +
                '<td>' + citas.username_paciente + '</td>' +
                '<td>' + citas.asistencia + '</td>' +
                '<td>' + citas.observaciones + '</td>' +
                '<td>' + citas.reprogramada + '</td>' +
                '<td>' + citas.pago_cuota + '</td>'
    });
    $("#citas-tbody").html(contenido);
}

function mostrarpaciente(paciente){
    $.each(paciente, function (index, pacientes) {
        pacientes = JSON.parse(pacientes);
        
        '<td>' + pacientes.nombre + '</td>'
    
    });
}


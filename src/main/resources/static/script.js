function test() {
    var name = $("#name").val();
    var surname = $("#surname").val();
    var cos = $("#cos").is(':checked');

    var object = {
        name: name,
        surname: surname,
        cos: cos
    }

    $.ajax({
        url: "http://localhost:8080/endpoint",
        method: "POST",
        dataType: "json",
        contentType: "application/json",
        data: JSON.stringify(object)
    })
    .done(res => {
        $('#divName').html(res.name);
        $('#divSurname').html(res.surname);
        $('#divCos').html(res.cos.toString());
    });
}
function calcularVelocidad(){
    var w = parseFloat(document.getElementById('w').value);
    var q = parseFloat(document.getElementById('q').value);
    var v;
    v = w / q;
    document.getElementById("respuesta").innerHTML = "La velocidad es: " + v;
    
}
function calcularTrabajo(){
    var f = parseFloat(document.getElementById('f').value);
    var r = parseFloat(document.getElementById('r').value);
    var cos = parseFloat(document.getElementById('cos').value);
    var w;
    w = f * r * Math.cos(cos);
    document.getElementById("respuestaTrabajo").innerHTML = "El trabajo es: " + w;
}

function calcularCargaElectrica(){
    var i = parseFloat(document.getElementById('i').value);
    var a = parseFloat(document.getElementById('a').value);
    var Q;
    Q = i * a;
    document.getElementById("respuestaFuerza").innerHTML = "La carga electrica es: " + Q;
}

function calcular(){
    var w = parseFloat(document.getElementById('Trabajo').value);
    var q = parseFloat(document.getElementById('Carga').value);
    var v;
    v = w / q;
    document.getElementById("respuesta").innerHTML = "La velocidad es: " + v;
}

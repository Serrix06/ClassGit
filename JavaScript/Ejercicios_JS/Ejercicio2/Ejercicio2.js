//Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good Afternoon
de 17 a 19 nos saluda: Good Evening
de 20 a 23 nos saluda: Good Night
Trabajaremos con 24 horas
*/
let horaDia = 22;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning"
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoon"
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening"
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night"
}
else{
    mensaje = "Valor Incorrecto"
}
console.log(mensaje);
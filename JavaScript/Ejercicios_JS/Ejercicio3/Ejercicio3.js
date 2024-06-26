

//Esta es la version mejorada
let month3 = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
function getMonth(n){
    if(n < 1 || n > 12){
        throw new Error("out of range");
    }
    return month3[n-1]   
}
console.log(getMonth(5));
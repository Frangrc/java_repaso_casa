

console.log("Generando tabla...");

//meterfila();

var lista = new Array();

var lista = new Array();
    lista = [["Vaina:", "Peine", "15 €","5"]];//Array bidimensional (array de arrays)
    lista[1]=["Vaina:", "Quitapelos para Jorge", "30 €","2"];
    lista[2]=["Vaina:", "Coche", "200€","4"];
generarTabla();
function generarTabla(){
    
    var nombrePrecio="Precio vaina";
    var table=document.getElementsByTagName("table");
    table=table[0];
    table.innerHTML="<caption>Lista de vainas</caption>";
    
    table.innerHTML += ` 
<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th>
        <th>Stock<th>
    </tr>
</thead>`;
     
    for(var i=0; i<lista.length; i++){
        var nodoTR=document.createElement("tr");
        table.appendChild(nodoTR);
        for(var columna of lista[i] ){
           var nodoCol=document.createElement("td");
           nodoTR.appendChild(nodoCol);
           var textoCol=document.createTextNode(columna);
           nodoCol.appendChild(textoCol);
           
        }
        
    }
}
function meterFila(){
   
   var tipo=document.getElementById("tipo").value;
   var nombre=document.getElementById("nombre").value;
   var precioVaina=document.getElementById("preciovaina").value;
   var stock=document.getElementById("stock").value; 
   
   //var datosFila=[tipo, nombre, precioVaina, stock];
   
   lista.push([tipo, nombre, precioVaina, stock]);
    generarTabla();
}

function meterFilaDirectamenteTabla(){
   var table = document.getElementsByTagName("table");
   table = table[0];
   var nombrePrecio="Precio vaina";
   var tipo=document.getElementById("tipo").value;
   var nombre=document.getElementById("nombre").value;
   var precioVaina=document.getElementById("preciovaina").value;
   var stock=document.getElementById("stock").value; 
   var datosFila=[tipo, nombre, precioVaina, stock];
   
   var nodoTR=document.createElement("tr");
        table.appendChild(nodoTR);
        for(var columna of datosFila){
           var nodoCol=document.createElement("td");
           nodoTR.appendChild(nodoCol);
           var textoCol=document.createTextNode(columna);
           nodoCol.appendChild(textoCol);
           
        } 
}

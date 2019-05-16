

console.log("Generando tabla...");
generarTabla();
function generarTabla(){
    var table=document.getElementsByTagName("table");
    table=table[0];
    table.innerHTML="<caption>Lista de vainas</caption>";
    var nombrePrecio="Precio vaina";
    table.innerHTML += ` 
<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th>
        <th>Stock</th>
    </tr>
</thead>`;
    var lista = new Array();
    lista = [["Vaina:", "Peine", "15 €",5]];//Array bidimensional (array de arrays)
    lista[1]=["Vaina:", "Quitapelos para Jorge", "30 €",2];
    lista[2]=["Vaina:", "Coche", "200€",4];
    
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

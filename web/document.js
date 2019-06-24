
function add(name, size) {
    console.log(size);
    var totalSize = document.getElementsByName(name)[0].value || 0;
    if(totalSize === 0)
        totalSize = size;
    var tbody = document.getElementById(name);
    var row = document.createElement("TR");
    for(var i = 0; i <size; i++)
    {
        var input = document.createElement("input");
        input.name = name + "" + totalSize++;
        var td = document.createElement("TD");
        td.appendChild(input);
        row.appendChild(td);
    }
    var span = document.createElement("span");
    span.onclick = function (ev) {
        this.parentElement.parentElement.parentElement.removeChild(this.parentElement.parentElement);
    };
    span.innerText = 'Удалить';
    td = document.createElement("TD");
    td.appendChild(span);
    row.appendChild(td);
    tbody.appendChild(row);
    document.getElementsByName(name)[0].value = totalSize;
}

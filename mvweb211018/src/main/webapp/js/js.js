function add()
{
    var list = document.getElementById("list");
    var text = prompt("", "C");
    var hash = document.createElement("li");
    hash.textContent = text;
    list.appendChild(hash);

    alert(list.childNodes.length);
}

function show()
{
    var list = document.getElementById("list");

    var size1 = list.children.length;
    var size2 = list.childNodes.length;

    var string = "";
    for (var i = 0; i < size1; i++) {
        string += list.children[i].textContent + "\n";
    }           
    alert(string);
    alert(list.childNodes[0]);
}

function delete1() {
    var list = document.getElementById("list");
    list.removeChild(list.children[0]);
}
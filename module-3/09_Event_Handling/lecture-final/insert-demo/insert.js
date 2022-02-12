function addStuff() {
    const mainDiv = document.getElementById("main");
    const para = mainDiv.querySelector('p');
    para.style.border = "1px solid black";
    para.innerText = "Paragraph Tag";

    const newParaBeforeBegin = document.createElement('p');
    newParaBeforeBegin.innerText = "p before begin";
    para.insertAdjacentElement("beforebegin", newParaBeforeBegin);

    const newParaAfterBegin = document.createElement('p');
    newParaAfterBegin.innerText = "p after begin";
    para.insertAdjacentElement("afterbegin", newParaAfterBegin);


    const newParaBeforeEnd = document.createElement('p');
    newParaBeforeEnd.innerText = "p before end";
    newParaBeforeEnd.style.color = "red";
    para.insertAdjacentElement("beforeend", newParaBeforeEnd);

    const newParaAfterEnd = document.createElement('p');
    newParaAfterEnd.innerText = "p after end";
    para.insertAdjacentElement("afterend", newParaAfterEnd);
}

addStuff();
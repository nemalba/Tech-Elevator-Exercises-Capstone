//3. add code to handle the event
function displayDate() {
    document.getElementById('demo').innerText =
        Date(); // built-in Date function that displays date
}

function alertDisplay() {
    window.alert("BOO YAAAAA!!!");
}

//listen for when the DOM content is loaded
document.addEventListener('DOMContentLoaded', () => {
    // add an event listener to the button
    //1.  I need a DOM element
    const button = document.getElementById('myBtn');
    //2. add an event listener on the element
    button.addEventListener('click', displayDate);

    button.addEventListener('dblclick', () => {
        alert('Hello World!');
    });

    const div1 = document.getElementById('id1');
    div1.addEventListener("click", alertDisplay);

    const otherBtn = document.getElementById('anotherBtn');
    otherBtn.addEventListener('click', () => {
        otherBtn.style.color = "red";
    });
});
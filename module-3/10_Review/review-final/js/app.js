const NUMBER_QUESTIONS = 10;
let problemSet = [];
let currentProblem = 1; // variable to hold what problem we are on

/**
 * Generate an array of problems (problemSet) of NUMBER_QUESTIONS size
 * each element will be an object
 * left, right, answer
 */
function generateProblemSet() {
    // loop through and create problems
    for (let i = 0; i < NUMBER_QUESTIONS; i++) {
        let problem = {
            left: random(10),
            right: random(10),
            answer: null
        };
        problem.answer = problem.left * problem.right;
        problemSet.push(problem);
    }

}
/**
 * Function to generate random number based on max
 */
function random(max) {
    return Math.floor(Math.random() * max);
}
function displayProblem() {
    const probContainer = document.querySelector('.expression');
    // const currentProblem
    //     = document.querySelector('.currentProblem').innerText;
    const problem = `${problemSet[currentProblem - 1].left} * ${problemSet[currentProblem - 1].right}`;
    probContainer.innerText = problem;
}

function displayAnswers() {
    // get the answer from the problemSet
    // const currentProblem
    //     = document.querySelector('.currentProblem').innerText;
    // generate 3 random wrong answers
    const correctAns = problemSet[currentProblem - 1].answer;
    // load all 4 answers into an array
    const answers = [correctAns, random(82), random(82), random(82)];

    // call the utility function shuffleArray
    const shuffledAnswers = shuffleArray(answers);
    // then display!
    const ansContainer = document.getElementById('answers');
    const list = ansContainer.querySelector('ul');
    const listItems = list.querySelectorAll('li');

    for (let i = 0; i < listItems.length; i++) {
        listItems[i].innerText = shuffledAnswers[i];
    }
}

function updateScore() {
    const currentScore = document.querySelector('.currentScore');
    let score = parseInt(currentScore.innerText);
    score++;
    currentScore.innerText = score;
}

function displayNextProblem() {
    //don't increment past the size of the array
    if (currentProblem < NUMBER_QUESTIONS) {
        currentProblem++;
        // increment the html
        document.querySelector('.currentProblem').innerText =
            currentProblem;
        displayProblem();
        displayAnswers();
    }
}

/**
 * Utility function to shuffle the items in an array
 * @param {object} arr
 */
function shuffleArray(arr) {
    return arr.sort(function (a, b) { return Math.random() - 0.5 })
}


document.addEventListener('DOMContentLoaded', () => {
    generateProblemSet();
    displayProblem();
    displayAnswers();
    // listener added to each li 
    const answerListItems = document.querySelectorAll('#answers ul li');
    answerListItems.forEach((item) => {
        item.addEventListener('click', (event) => {
            // event.currentTarget gets me the li the user clicked on
            // .innerText gives back the answer
            const userAnswer = parseInt(event.currentTarget.innerText);
            const correctAnswer = problemSet[currentProblem - 1].answer;
            // don't increment past size of problem set
            if (userAnswer === correctAnswer &&
                currentProblem <= NUMBER_QUESTIONS) {
                // update the score
                updateScore();
            }
            // displayNextProblem and display answers
            displayNextProblem();
        })
    })
    // if click correct problem, add 1 to score
    // display next problem and increment current problem

    // if click start over button, 
    // reset everything
    const btnStartOver =
        document.getElementById('btnStartOver');
    btnStartOver.addEventListener('click', () => {
        currentProblem = 1;
        document.querySelector('.currentProblem').innerText =
            currentProblem;
        document.querySelector('.currentScore').innerText = 0;
        generateProblemSet();
        displayProblem();
        displayAnswers();
    });
});
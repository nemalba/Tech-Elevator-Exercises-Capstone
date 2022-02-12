const name = 'Cigar Parties for Dummies';
const description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
const reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  },
  {
    reviewer: 'Tim Ferriss',
    title: 'Had a cigar party started in less than 4 hours.',
    review:
      "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
    rating: 4
  },
  {
    reviewer: 'Ramit Sethi',
    title: 'What every new entrepreneurs needs. A door stop.',
    review:
      "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
    rating: 1
  },
  {
    reviewer: 'Gary Vaynerchuk',
    title: 'And I thought I could write',
    review:
      "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  const pageName = pageTitle.querySelector('.name');
  pageName.innerText = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerText = description;
}

/**
 * I will display all of the reviews on the page.
 * I will loop over the array of reviews and use some helper functions
 * to create the elements needed for our markup and add them to the DOM
 */
function displayReviews() {
  const main = document.getElementById('main'); // connection to the document

  reviews.forEach((review) => {
    // create a div element to hold each review 
    const container = document.createElement('div');
    // add the class 'review' to each div for css styling
    container.setAttribute('class', 'review');
    // call function addReviewer which will
    // create element to hold the reviewer and add it to
    // the container
    addReviewer(container, review.reviewer);
    addRating(container, review.rating);
    addTitle(container, review.title);
    addReview(container, review.review);
    // add all the html created to our main container called main
    main.appendChild(container);
  });
}

/**
 * I will create a new h4 element with the name of the reviewer and append it to
 * the parent element that is passed to me.
 *
 * @param {HTMLElement} parent: The element to append the reviewer to
 * @param {string} name The name of the reviewer
 */
function addReviewer(parent, name) {
  // create an h4 element to hold my reviewer name
  const reviewer = document.createElement('h4');
  // set the reviewer name to the new element
  reviewer.innerText = name;
  // append the tag to the parent
  parent.appendChild(reviewer);

}

/**
 * I will add the rating div along with a star image for the number of ratings 1-5
 * @param {HTMLElement} parent
 * @param {Number} numberOfStars
 */
function addRating(parent, numberOfStars) {
  const rating = document.createElement('div');
  rating.setAttribute('class', 'rating');

  for (let i = 0; i < numberOfStars; i++) {
    const star = document.createElement('img');
    // set the source src -- where is image coming from?
    // index.html is the root, so where do I go?
    // into folder img and then name of file
    star.src = "img/star.png";
    rating.appendChild(star);
  }
  parent.appendChild(rating);
}

/**
 * I will add an h3 element along with the review title
 * @param {HTMLElement} parent
 * @param {string} title
 */
function addTitle(parent, title) {
  const h3Title = document.createElement('h3');
  h3Title.innerText = title;
  parent.appendChild(h3Title);
}

/**
 * I will add the product review
 * @param {HTMLElement} parent
 * @param {string} review
 */
function addReview(parent, review) {
  const para = document.createElement('p');
  para.innerText = review;
  parent.appendChild(para);
}

// set the product reviews page title
setPageTitle();
// set the product reviews page description
setPageDescription();
// display all of the product reviews on our page
displayReviews();

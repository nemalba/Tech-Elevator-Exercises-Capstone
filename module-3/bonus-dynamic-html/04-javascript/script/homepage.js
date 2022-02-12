
const table = document.getElementById("movies")

const service = new MovieService()
const movies = service.getAllMovies()

for (let movie of movies)
{
    let tr = document.createElement('tr')

    let tdOrder = document.createElement('td')
    let tdTitle = document.createElement('td')

    let order = document.createTextNode(movie.order)
    let title = document.createTextNode(movie.title)

    tdOrder.appendChild(order)
    tdTitle.appendChild(title)

    tr.appendChild(tdOrder)
    tr.appendChild(tdTitle)

    table.appendChild(tr)

}
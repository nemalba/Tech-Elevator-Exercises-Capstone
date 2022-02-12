class MovieService
{
    getAllMovies()
    {
        console.log("call API to get movie data");
        
        const movies = [
            { order: 1, title: "Captain America" },
            { order: 2, title: "Captain Marvel" },
            { order: 3, title: "Iron Man"}
        ]

        return movies
    }
}
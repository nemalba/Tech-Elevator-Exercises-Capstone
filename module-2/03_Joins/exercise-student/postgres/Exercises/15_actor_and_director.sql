-- 15. The title of the movie and the name of director for movies where the director was also an actor in the same movie (73 rows)

SELECT  title, person_name
FROM movie m
JOIN person p ON m.director_id = p.person_id
JOIN movie_actor ma ON ma.actor_id = p.person_id AND m.movie_id = ma.movie_id;


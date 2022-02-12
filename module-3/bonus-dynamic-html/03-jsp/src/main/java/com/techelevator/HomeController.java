package com.techelevator;


import javax.servlet.http.HttpServletRequest;

import com.techelevator.models.Movie;
import com.techelevator.models.Movies;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController
{

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHomePage(HttpServletRequest request)
	{
		List<Movie> movies = Movies.getOrderedList();

		request.setAttribute("movies", movies);

		return "home2";
	}

}

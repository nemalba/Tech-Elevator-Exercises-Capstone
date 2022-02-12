package com.techelevator;

import com.techelevator.models.Movie;
import com.techelevator.models.Movies;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ClientInfoStatus;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Movie> movies = Movies.getOrderedList();
		PrintWriter writer = response.getWriter();

		writer.println("<!DOCTYPE html>");
		writer.println("<html>");
		writer.println("<head>");
		writer.println("	<meta charset='UTF-8'>");
		writer.println("	<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
		writer.println("	<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
		writer.println("	<title>Marvel Timeline</title>");
		writer.println("	<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootswatch@4.5.2/dist/cerulean/bootstrap.min.css'>");
		writer.println("	<style>");
		writer.println("	body{ display: flex; flex-direction: column; align-items: center; } ");
		writer.println("	h1 { width: 100vw; background-color: #333; padding: 20px 20px 30px 20px; text-align: center; color: white; }");
		writer.println("	h1 span { color: #ff4646; } ");
		writer.println("	table.table { width: 75vw; margin-top: 25px } ");
		writer.println("	table.table tr:first-child { background-color: #777; color: white }");
		writer.println("	</style>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("	<h1>Marvel <span>(on Disney+)</span></h1>");
		writer.println("	<table class='table table-hover table-striped'>");
        writer.println("		<tr><th>Order</th><th>Title</th></tr>");

		for(Movie movie : movies)
		{
			writer.println(String.format("		<tr><td>%d</td><td>%s</td></tr>", movie.getOrder(), movie.getTitle()));
		}

		writer.println("	</table>");
		writer.println("</body>");
		writer.println("</html>");
	}


}

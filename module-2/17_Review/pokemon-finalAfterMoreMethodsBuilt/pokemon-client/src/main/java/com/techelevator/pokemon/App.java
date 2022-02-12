package com.techelevator.pokemon;

import com.techelevator.pokemon.model.AuthenticatedUser;
import com.techelevator.pokemon.model.Pokemon;
import com.techelevator.pokemon.model.PokemonDetail;
import com.techelevator.pokemon.model.UserCredentials;
import com.techelevator.pokemon.services.AuthenticationService;
import com.techelevator.pokemon.services.AuthenticationServiceException;
import com.techelevator.pokemon.services.PokemonService;
import com.techelevator.view.ConsoleService;

import java.util.List;

public class App {

private static final String API_BASE_URL = "http://localhost:8080/";
    
    private static final String MENU_OPTION_EXIT = "Exit";
    private static final String LOGIN_MENU_OPTION_REGISTER = "Register";
	private static final String LOGIN_MENU_OPTION_LOGIN = "Login";
	private static final String[] LOGIN_MENU_OPTIONS = { LOGIN_MENU_OPTION_REGISTER, LOGIN_MENU_OPTION_LOGIN, MENU_OPTION_EXIT };
	private static final String MAIN_MENU_OPTION_VIEW_POKEMON = "View Pokemons";
	private static final String MAIN_MENU_OPTION_VIEW_DETAIL = "View detail on a Pokemon";
	private static final String MAIN_MENU_OPTION_SAVE_POKEMON = "Save Pokemon";

	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_VIEW_POKEMON, MAIN_MENU_OPTION_VIEW_DETAIL, MAIN_MENU_OPTION_SAVE_POKEMON, MENU_OPTION_EXIT };
	
    private AuthenticatedUser currentUser;
    private ConsoleService console;
    private AuthenticationService authenticationService;
    private PokemonService pokemonService;

    public static void main(String[] args) {
    	App app = new App(new ConsoleService(System.in, System.out), new AuthenticationService(API_BASE_URL),
				new PokemonService(API_BASE_URL));
    	app.run();
    }

    public App(ConsoleService console, AuthenticationService authenticationService, PokemonService pokemonService) {
		this.console = console;
		this.authenticationService = authenticationService;
		this.pokemonService = pokemonService;
	}

	public void run() {
		System.out.println("******************************");
		System.out.println("* Welcome to Pokemon Keeper! *");
		System.out.println("******************************");
		
		registerAndLogin();
		mainMenu();
	}

	private void mainMenu() {
		while(true) {
			String choice = (String)console.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(MAIN_MENU_OPTION_VIEW_POKEMON.equals(choice)) {
				viewPokemon();
			} else if(MAIN_MENU_OPTION_SAVE_POKEMON.equals(choice)) {
				savePokemon();
			} else if(MAIN_MENU_OPTION_VIEW_DETAIL.equals(choice)) {
				viewPokemonDetail();
			} else {
				// the only other option on the main menu is to exit
				exitProgram();
			}
		}
	}

	private void viewPokemon() {
		List<Pokemon> pokemonList = pokemonService.getAllPokemons();
		console.displayPokemon(pokemonList);
	}

	private void savePokemon() {
		List<Pokemon> pokemonList = pokemonService.getAllPokemons();
		Pokemon pokemon = (Pokemon)console.getChoiceFromOptions(pokemonList.toArray());
		PokemonDetail pokemonDetail = pokemonService.getPokemonDetailById(pokemon.getId());
		pokemonService.savePokemonToDB(pokemonDetail);


		
	}


	private void viewPokemonDetail() {
		List<Pokemon> pokemonList = pokemonService.getAllPokemons();
		Pokemon pokemon = (Pokemon)console.getChoiceFromOptions(pokemonList.toArray());
		PokemonDetail pokemonDetail = pokemonService.getPokemonDetailById(pokemon.getId());
		console.display(pokemonDetail);
		
	}

	
	private void exitProgram() {
		System.exit(0);
	}

	private void registerAndLogin() {
		while(!isAuthenticated()) {
			String choice = (String)console.getChoiceFromOptions(LOGIN_MENU_OPTIONS);
			if (LOGIN_MENU_OPTION_LOGIN.equals(choice)) {
				login();
			} else if (LOGIN_MENU_OPTION_REGISTER.equals(choice)) {
				register();
			} else {
				// the only other option on the login menu is to exit
				exitProgram();
			}
		}
	}

	private boolean isAuthenticated() {
		return currentUser != null;
	}

	private void register() {
		System.out.println("Please register a new user account");
		boolean isRegistered = false;
        while (!isRegistered) //will keep looping until user is registered
        {
            UserCredentials credentials = collectUserCredentials();
            try {
            	authenticationService.register(credentials);
            	isRegistered = true;
            	System.out.println("Registration successful. You can now login.");
            } catch(AuthenticationServiceException e) {
            	System.out.println("REGISTRATION ERROR: "+e.getMessage());
				System.out.println("Please attempt to register again.");
            }
        }
	}

	private void login() {
		System.out.println("Please log in");
		currentUser = null;
		while (currentUser == null) //will keep looping until user is logged in
		{
			UserCredentials credentials = collectUserCredentials();
		    try {
				currentUser = authenticationService.login(credentials);
				pokemonService.setAuthToken(currentUser.getToken());
			} catch (AuthenticationServiceException e) {
				System.out.println("LOGIN ERROR: "+e.getMessage());
				System.out.println("Please attempt to login again.");
			}
		}
	}
	
	private UserCredentials collectUserCredentials() {
		String username = console.getUserInput("Username");
		String password = console.getUserInput("Password");
		return new UserCredentials(username, password);
	}
}

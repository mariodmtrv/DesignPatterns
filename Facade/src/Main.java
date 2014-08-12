/**
 * Facade provides a unified interface to a set of interfaces in a system
 * Defines a higher level interface to simplify system use
 * */
public class Main {
	public static void main(String[] args) {
		Stereo stereo = new Stereo();
		TV tv = new TV();
		GameConsole console = new GameConsole();
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(stereo, tv,
				console);
		homeTheater.watchMovie("Divergent");
		homeTheater.stopMovie();
	}

}

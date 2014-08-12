public class HomeTheaterFacade {
	private Stereo stereo;
	private TV tv;
	private GameConsole console;

	public HomeTheaterFacade(Stereo stereo, TV tv, GameConsole console) {
		this.stereo = stereo;
		this.tv = tv;
		this.console = console;

	}

	public void watchMovie(String movie) {
		tv.on();
		stereo.volumeUp();
		console.stopAction();
		console.loadMovie(movie);
		console.playMovie();
	}

	public void stopMovie() {
		stereo.stop();
		console.stopAction();
		tv.off();
	}
}

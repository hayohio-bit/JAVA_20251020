package exexexex;

public class 다형성미적용 {

	public static void main(String[] args) {
		MusicApp music = new MusicApp();
		MapApp map = new MapApp();
		GameApp game = new GameApp();

		music.playMusic();
		map.showMap();
		game.startGame();

	}

}

class MusicApp {
	void playMusic() {
		System.out.println("재생");
	}
}

class MapApp {
	void showMap() {
		System.out.println("지도표시");
	}
}

class GameApp {
	void startGame() {
		System.out.println("게임시작");
	}
}
package jp.cp.tafs.lesson;

public class SuperGameMachine {

	private String gameMachine;
	private String Maker;
	private String OnlineMode;
	private String Release;
	private String Price;

	SuperGameMachine(String game, String maker, String online, String release, String price) {
		gameMachine = game;
		Maker = maker;
		OnlineMode = online;
		Release = release;
		Price = price;
	}

	public String Play() {
		return "ゲームソフトで遊んでいます。";
	}

	public String Playing() {
		return "ゲームソフトで遊んでいます。\r\n" +
				"game：" + gameMachine +
				"\r\nmaker：" + Maker +
				"\r\nonline：" + OnlineMode +
				"\r\nrelease： " + Release +
				"\r\nprice： " + Price;
	}

	public static void main(String[] args) {
		System.out.println("ゲームソフトで遊んでいます。");
	}

}

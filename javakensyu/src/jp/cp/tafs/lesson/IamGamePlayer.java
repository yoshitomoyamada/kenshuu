package jp.cp.tafs.lesson;

public class IamGamePlayer {
	public static void main(String[] args) {

		//ToDo ゲームソフトで遊びましょう。
		SuperGameMachine Play = new SuperGameMachine(null, null, null, null, null);
		SuperGameMachine Playing = new SuperGameMachine("Nintendo64", "任天堂", "有り", "2000/04/17", "25,000");

		System.out.println(Play.Play());
		System.out.println(Playing.Playing());
	}

}

package jp.cp.tafs.lesson;

import java.util.Scanner;

public class IamGamePlayer {
	public static void main(String[] args) throws Exception {

		//ToDo ゲーム機のインスタンスの作成
		SuperGameMachine machine = new SuperGameMachine();

		//ToDo ゲームソフトで遊びましょう。

		machine.INSERT_GameSoft("サクラ大戦");
		machine.PowerOn();
		machine.Playing();

		// テスト用
		//		machine.PowerOn();
		//		machine.PowerOff();

		machine.Power_Supply();

		machine.TAKE_OUT_GameSoft();
		//		machine.INSERT_GameSoft("サクラ大戦");
		machine.INSERT_GameSoft("クロノトリガー");
		//		machine.TAKE_OUT_GameSoft();
		//		machine.TAKE_OUT_GameSoft();

		System.out.println("\n");

		//ToDo 電源が入っていますか	

		if (machine.getisPowerOn() == false) {
			System.out.println("電源が落ちています。");
			machine.PowerOn();
		}

		if (machine.Active == false) {

			System.out.println("ソフトを選択します。");
			Scanner scan_1 = new Scanner(System.in);
			String soft = scan_1.next();
			System.out.println(soft);
			machine.INSERT_GameSoft(soft);
			machine.Playing();
		}

		// 遊びませう
		machine.Playing();

		// 感想
		System.out.println("\n");
		System.out.println("感想を聞かせてください\n");

		Scanner scan_2 = new Scanner(System.in);
		String comment = scan_2.next();
		System.out.println("「" + comment + "」");

		System.out.println(machine.getMaker());
	}
}

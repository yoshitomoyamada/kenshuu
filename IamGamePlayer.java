package jp.cp.tafs.lesson;

import java.util.Scanner;

public class IamGamePlayer {
	public static void main(String[] args) throws Exception {

		//ToDo �Q�[���@�̃C���X�^���X�̍쐬
		SuperGameMachine machine = new SuperGameMachine();

		//ToDo �Q�[���\�t�g�ŗV�т܂��傤�B

		machine.INSERT_GameSoft("�T�N�����");
		machine.PowerOn();
		machine.Playing();

		// �e�X�g�p
		//		machine.PowerOn();
		//		machine.PowerOff();

		machine.Power_Supply();

		machine.TAKE_OUT_GameSoft();
		//		machine.INSERT_GameSoft("�T�N�����");
		machine.INSERT_GameSoft("�N���m�g���K�[");
		//		machine.TAKE_OUT_GameSoft();
		//		machine.TAKE_OUT_GameSoft();

		System.out.println("\n");

		//ToDo �d���������Ă��܂���	

		if (machine.getisPowerOn() == false) {
			System.out.println("�d���������Ă��܂��B");
			machine.PowerOn();
		}

		if (machine.Active == false) {

			System.out.println("�\�t�g��I�����܂��B");
			Scanner scan_1 = new Scanner(System.in);
			String soft = scan_1.next();
			System.out.println(soft);
			machine.INSERT_GameSoft(soft);
			machine.Playing();
		}

		// �V�т܂���
		machine.Playing();

		// ���z
		System.out.println("\n");
		System.out.println("���z�𕷂����Ă�������\n");

		Scanner scan_2 = new Scanner(System.in);
		String comment = scan_2.next();
		System.out.println("�u" + comment + "�v");

		System.out.println(machine.getMaker());
	}
}

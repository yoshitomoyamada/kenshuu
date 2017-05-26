package jp.cp.tafs.lesson;

public class SuperGameMachine {
	//	ゲーム機情報
	private String gameMachine = "Nintendo64";
	private String Maker = "任天堂";
	private String OnlineMode = "有り";
	private String Release = "2000/04/17";
	private String Price = "25,000";
	//	ゲーム機の状態
	private boolean isPowerOn = false;
	private String GameSoft = null;

	boolean Active;

	public String getGameMachineName() {
		return gameMachine;
	}

	public void setGameMachineName(String gameMachine) {
		this.gameMachine = gameMachine;
	}

	public String getMaker() {
		return Maker;
	}

	public void setMaker(String Maker) {
		this.Maker = Maker;
	}

	public String getOnlineMode() {
		return OnlineMode;
	}

	public void setOnlineMode(String OnlineMode) {
		this.OnlineMode = OnlineMode;
	}

	public String getRelease() {
		return getRelease();
	}

	public void setRelease(String Release) {
		this.Release = Release;
	}

	public String getPrice() {
		return getPrice();
	}

	public void setPrice(String Price) {
		this.Price = Price;
	}

	public boolean getisPowerOn() {
		return isPowerOn;
	}

	public void setisPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public void Play() {
		System.out.println("ゲームソフトで遊んでいます。");
		return;
	}

	public void Playing() throws Exception {
		if (GameSoft == null) {
			throw new Exception("ゲームソフトが入っていない為遊べません。");
		} else if (isPowerOn == false) {
			throw new Exception("電源が入っていない為遊べません。");
		} else {
			System.out.println("ゲームソフトで遊んでいます。\r\n" +
					"game：" + gameMachine +
					"\r\nmaker：" + Maker +
					"\r\nonline：" + OnlineMode +
					"\r\nrelease： " + Release +
					"\r\nprice： " + Price);
			System.out.println("ゲームソフト：" + GameSoft);
		}
		return;
	}

	//	public boolean getflag() {
	//		return flag;
	//	}

	public void PowerOn() throws Exception {
		if (isPowerOn == false) {
			isPowerOn = true;
			System.out.println("電源がONになりました。");
		} else {
			throw new Exception("電源は既にONです。");
		}
	}

	public void PowerOff() throws Exception {
		if (isPowerOn == true) {
			isPowerOn = false;
			System.out.println("電源がOFFになりました。");
		} else {
			throw new Exception("電源は既にOFFです。");
		}
	}

	public void Power_Supply() {
		//電源がON/OFFか調べる：TRUE=ON、FALSE=OFF
		if (isPowerOn == true) {
			System.out.println("電源はONです。");
		} else {
			System.out.println("電源はOFFです。");
		}
	}

	public void INSERT_GameSoft(String newsoft) throws Exception {
		//ゲームソフトの挿入処理：ソフトが無ければセットする
		if (GameSoft == null) {
			GameSoft = newsoft;
			System.out.println("ゲームソフトをセットしました。");
			System.out.println(GameSoft);
			Active = true;
		} else {
			throw new Exception("ゲームソフト" + GameSoft + "がセット済みです。");
		}
	}

	public void TAKE_OUT_GameSoft() throws Exception {
		//ゲームソフトの取り出し処理：ソフトがあれば取り出す
		if (GameSoft == null) {
			throw new Exception("ゲームソフトは入っておりません。");
		} else {
			System.out.println(GameSoft + "を" + gameMachine + "から取り出しました");
			GameSoft = null;
			Active = false;
		}
	}
}
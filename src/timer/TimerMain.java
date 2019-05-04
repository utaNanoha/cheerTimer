package timer;

import java.util.Timer;

public class TimerMain {

	public static void main(String args[]) {

		// タイム
		int countDownTime = Integer.parseInt(args[0]);
		System.out.print(countDownTime);
		// イラスト
		// BufferedImage img = args[1];
		// System.out.print(img);
		// ボイス

		Timer timer = new Timer();
		while (countDownTime > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			countDownTime--;
			System.out.print(countDownTime);

			if (!(countDownTime == 0)) {
				/*
				 * if ( countDownTime < Integer.parseInt(args[0])/2 ) {
				 * System.out.print(hulfImg)//イラスト
				 * AppManager.hulfVoice(); //ボイス
				 * } else { AppManager.countSE(); }
				 */
			} else {
				timer.cancel();
				/*
				 * AppManager.finishSE();
				 * AppManager.finishVoice();
				 */
			}
		}
	}

}

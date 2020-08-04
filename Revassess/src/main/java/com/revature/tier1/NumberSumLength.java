package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		long powerNum = 0;
		String stringnum = Long.toString(num);
		if (num == 0) {
			return true;
		} else {

			for (int i = 0; i < stringnum.length(); i++) {
				char c = stringnum.charAt(i);
				long cnum = Long.parseLong((Character.toString(c)));
				powerNum += (Math.pow(cnum, stringnum.length()));
			}
			if (powerNum == num)
				return true;
		}
		return false;
	}
}

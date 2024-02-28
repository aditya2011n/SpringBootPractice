package com.ioc;

public class Student {

//	MathCheat mathCheat;
	
	Cheat cheat;

//	public void setMathCheat(MathCheat mathCheat) {
//		this.mathCheat = mathCheat;
//	}
	
	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}
	
	public void showCheat() {
		cheat.cheating();
	}

	
	
}

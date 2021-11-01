package com.SB;

import com.SA.student;
import com.SA.student2;

public class B extends student implements student2 {

	private int eng;

	public B(String name, int eng) {
		super(name);
		this.eng = eng;
	}

	public void skill() {
		System.out.println("B skill");
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

}

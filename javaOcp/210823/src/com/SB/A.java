package com.SB;

import com.SA.student;
import com.SA.student2;

public class A extends student implements student2 {

	private int chi;

	public A(String name,int chi) {
		super(name);
		this.chi = chi;
	}

	public void skill() {
		System.out.println("A skill");
	}

	public int getChi() {
		return chi;
	}

	public void setChi(int chi) {
		this.chi = chi;
	}

	public String show() {
		return super.show() + "\tchi: " + chi;
	}

}

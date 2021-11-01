package ioEX;

import java.io.Serializable;

public class Order implements Serializable {
	private String Name;
	private int Lcd, Ram;

	public Order() {
		super();
	}

	public Order(String name, int lcd, int ram) {
		super();
		Name = name;
		Lcd = lcd;
		Ram = ram;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getLcd() {
		return Lcd;
	}

	public void setLcd(int lcd) {
		Lcd = lcd;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}

	public void show() {
		System.out.println("¦W:" + getName()
				+ "\tLCD:" + getLcd()
				+ "\tRam:" + getRam());
	}
}

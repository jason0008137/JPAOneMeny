package SampleEx;

import java.util.Arrays;
import java.util.List;

public class test_extendsGan {
	public static void main(String[] args) {
		CanVas c = new CanVas();
		List<Cirle> l = Arrays.asList(new Cirle(1), new Cirle(2), new Cirle(3));
		List<OOOOO> l2 = null;

		c.drawAll(l);
		c.drawAll(l2);
	}
}

interface IShape {
	void draw(CanVas c);
}

class Cirle implements IShape {
	int i;

	public Cirle(int i) {
		super();
		this.i = i;
	}

	public void draw(CanVas c) {
		System.out.println(c + " Cirle" + " " + i);
	}
}

class Rectangle implements IShape {
	int i;

	public Rectangle(int i) {
		super();
		this.i = i;
	}

	public void draw(CanVas c) {
		System.out.println(c + " Rectangle" + " " + i);
	}
}

class OOOOO extends Rectangle {

	public OOOOO(int i) {
		super(i);
	}
}

class CanVas {
	void drawAll(List<? extends IShape> shapes) {
		for (IShape shape : shapes) {
			shape.draw(this);
		}
	}
}
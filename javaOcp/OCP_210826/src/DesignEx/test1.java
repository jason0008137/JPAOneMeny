package DesignEx;

public class test1 {
	public static void main(String[] args) {

		style1 s1 = new style1();

		s1.getA().setName("A");
		s1.getB().setName("B");

		System.out.println(s1.getA().getName() + "\t" + s1.getB().getName());

		
		style1 s2 = new style1(new A("AA"), new B("BB"));

		System.out.println(s2.getA().getName() + "\t" + s2.getB().getName());
	}
}

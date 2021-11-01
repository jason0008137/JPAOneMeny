package DesignEx;

public class style2 {

	private A[] a;
	private B[] b;

	public style2() {
		super();
		a = new A[10];
		b = new B[10];
	}

	public style2(A[] a, B[] b) {
		super();
		this.a = a;
		this.b = b;
	}

	public A[] getA() {
		return a;
	}

	public void setA(A[] a) {
		this.a = a;
	}

	public B[] getB() {
		return b;
	}

	public void setB(B[] b) {
		this.b = b;
	}

}

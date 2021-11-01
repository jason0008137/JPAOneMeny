package lamdaEX;

interface book2<E, T> {
	E bookPrice1(E price);

	T bookPrice2(T price);

	T bookPrice3(E price);
}

public class ex2 {

	public static void main(String[] args) {
		book2 b = new book2<Integer, Double>() {

			public Integer bookPrice1(Integer price) {
				return null;
			}

			public Double bookPrice2(Double price) {
				return null;
			}

			public Double bookPrice3(Integer price) {
				return (double) price;
			}

		};
		System.out.println(b.bookPrice3(12));
		System.out.println("=============================");
		System.out.println(new book2<String,Double>(){

			public String bookPrice1(String price) {
				return null;
			}

			public Double bookPrice2(Double price) {
				return null;
			}

			public Double bookPrice3(String price) {
				return Double.parseDouble(price);
			}}.bookPrice3("1212"));
		
		

	}

}

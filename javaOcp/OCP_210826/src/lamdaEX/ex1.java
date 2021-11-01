package lamdaEX;

interface book1<E> {
	E bookPrice(E price);
}

public class ex1 {

	public static void main(String[] args) {
		book1 b = new book1<Integer>() {

			@Override
			public Integer bookPrice(Integer price) {
				// TODO Auto-generated method stub
				return null;
			}
					
		};
	}
}

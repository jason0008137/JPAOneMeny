package theadEX;

import jdbcEX.fkinstrings;

public class add1 {

	public static void main(String[] args) throws InterruptedException {
		school[] s = new school[4];
		//school[] s = new school[2];

		s[0] = new school("a");
		s[1] = new school("b");
		s[2] = new school("c");
		s[3] = new school("d");
		
		s[0].start();
		s[1].start();
		s[1].join();
		s[2].start();
		s[3].start();
		
		
		
		/*
		for (school o : s) {
			//o.show();
			o.start();
		}*/

		//fkinstrings.myFor("YOO");

	}

}

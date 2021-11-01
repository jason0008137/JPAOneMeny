import java.util.ArrayList;
import java.util.Iterator;

public class UserGradeMain {

	public static void main(String[] args) {
		ArrayList<UserGrade> a = new ArrayList<UserGrade>();
		a.add(new UserGrade("A", 1));
		a.add(new UserGrade("B", 2));
		a.add(new UserGrade("C", 3));
		System.out.println(a.toString());

		int index = -1;

//		for (int i = 0; i < a.size(); i++) {
//			if (a.get(i).getName().equals("A") && a.get(i).getScore() == 1) {
//				index = i;
//				break;
//			}
//		}

//		for (UserGrade u : a) {
//			index++;
//			if (u.getName().equals("A") && u.getScore() == 1) {
//			}
//		}

//		a.remove(new UserGrade("A", 1));
//		a.remove(1);
		a.remove(a.indexOf(new UserGrade("A", 1)));
		System.out.println(a.toString());
	}

}

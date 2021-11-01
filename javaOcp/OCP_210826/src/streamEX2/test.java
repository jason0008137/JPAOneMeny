package streamEX2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(10, 20);
		List<Integer> l2 = Arrays.asList(15, 30);


//		list1.stream()
//        .flatMap(list2.stream().flatMap(e1->e1.stream())
//        .forEach(s->System.out.println(s+" "));
		
//		Stream.of(l1,l2)
//        .flatMap(list->list.intStream())
//        .forEach(s->System.out.print(s+" "));
		
//		Stream.of(l1,l2)
//        .flatMapToInt(list->list.intStream())
//        .forEach(s->System.out.print(s+" "));
		
		Stream.of(l1,l2)
        .flatMap(list->list.stream())
        .forEach(s->System.out.print(s+" "));
		
	}

}

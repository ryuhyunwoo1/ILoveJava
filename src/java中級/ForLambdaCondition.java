package java中級;

import java.util.*;
import java.util.stream.*;

public class ForLambdaCondition {
	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<>();
		int s = 0;
		for (int i = 1; i <= 10; i ++) {
			ilist.add(i);
		}
		
		ilist = ilist.stream()
					.filter(i -> i % 2 == 1)
					.map(i -> i * i)
					.collect(Collectors.toList());
		
		ilist.forEach(i -> {System.out.printf(i + "\t");});
		System.out.println();
		
		s = ilist.stream().reduce(0,  Integer::sum);
		System.out.println("1~10 사이의 홀수에 대한 제곱합: " + s);
	}
}

package test.example;

import java.util.ArrayList;

public class testGeneric {
	
	public static void main(String[] args) {
		employee<String> emp1 =new employee<>("123");
		System.out.printf("%s%n",emp1.haha);
		
		employee<ArrayList<String>> emp2 =new employee<>(new ArrayList<>());
		emp2.haha.add("123");
		emp2.haha.add("456");
		System.out.printf("%s%n",emp2.haha.toString());
		System.out.printf("你好%s%n",emp2.haha.toString());

	}	
}

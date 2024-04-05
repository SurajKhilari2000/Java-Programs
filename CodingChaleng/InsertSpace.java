package CodingChaleng;

import java.util.Scanner;

public class InsertSpace {
	public static String insertSpace(String s) {
        // Use a lambda expression to insert a space between each character
        return s.chars().mapToObj(c -> (char) c +" ").reduce("", String::concat).trim();
    }

    public static void main(String[] args) {
    InsertSpace source = new InsertSpace();
    
        String result = source.insertSpace("capgemini");
        System.out.println(result);
    }

}
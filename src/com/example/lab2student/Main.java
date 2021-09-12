package com.example.lab2student;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		//Create arraylist of user-defined class objects
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		
		al.add(new Student(100,"준현",23));
		al.add(new Student(101,"수현",23));
		al.add(new Student(102,"현서",21));
		al.add(new Student(103,"민석",25));
		al.add(new Student(104,"예준",23));
		al.add(new Student(105,"주영",26));
		al.add(new Student(106,"서예",21));
		al.add(new Student(107,"혜림",20));
		al.add(new Student(108,"지원",28));
		al.add(new Student(109,"소은",21));
		
		
		Collections.sort(al);
		
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List ((reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		
	}
}

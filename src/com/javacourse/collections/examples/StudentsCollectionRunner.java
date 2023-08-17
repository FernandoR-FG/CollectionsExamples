package com.javacourse.collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class DStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(3,"Fer"),
				new Student(2,"Eve"),new Student(1,"Ada"));
		System.out.println(students);
		
		
		//Vamos a ordenar studens en studentsAl con un arrayList
		//Para ordenar es necesario crear la clase de omparacion que es para ver cual es mas grande
		List<Student> studentsAl= new ArrayList<>(students);
		
		//Despues de crear los metodos 
		Collections.sort(studentsAl);
		System.out.println("\nAsc"+studentsAl);
		
		//Collections.sort(studentsAl, new DStudentComparator());
		studentsAl.sort(new DStudentComparator() );
		System.out.println("\nDsc"+studentsAl);
		
		//List Extiende collection
		/*
		 * Sus metodos se centran en la posicion de los objetos
		 * */
		
		//HashSet no le importa el orden de insercion de datos
		Set<Integer> numbers = new HashSet<>();
		numbers.add(12345);
		numbers.add(1234);
		numbers.add(123);
		numbers.add(12);
		//En lo anterior no importa eel orden en que se guarda ni se ordena
		
		//Aqui se guarda en el orden que se insertaron
		//no pueden haber duplicados
		Set<Integer> numbers1 = new LinkedHashSet<>();
		numbers1.add(12345);
		numbers1.add(1234);
		numbers1.add(123);
		numbers1.add(12);
	
		
		//List de caracteres
		List<Character> characters = List.of('A','N','A','B','D', 'I','O');
		//Escojer alguna de esas depende si importa el orden
		
		//Unique - set Es decir queremos solo 1 de cada
		//Tree
		//HASH
		//LinkedHash
		
		//Si no te importa que este ordenado o insertado es hash
		
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("TreeSet: " + treeSet);
		
		Set<Character> linkHashSet = new LinkedHashSet<>(characters);
		System.out.println("LinkedHashSet: " + linkHashSet);
		
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("hashSet: " + hashSet);
		
		
		//TreeSer
		TreeSet<Integer> numbersT = new TreeSet<>(Set.of(65,30,25,71,4,5,25,98,41));
		//En arboles todo se ordena
		numbersT.floor(40);
		numbersT.lower(45);
		numbersT.higher(43);
		numbersT.ceiling(75);
		numbersT.subSet(30, 15);
		numbersT.subSet(30, true , 15 , true);
		numbersT.headSet(10);
		numbersT.tailSet(50);
		
		
		
		//Colas Queue
		/*
		 *Ordenados en orden natural
		 * */
		Queue<String> queue = new PriorityQueue<>();
		queue.poll();
		queue.offer("Apple");
		queue.addAll(List.of("Esto","es","una","cola"));
		queue.poll();
		
		
		
 		//Hablando de Map
		//Es usado para almacenar llaves y valores
		// get put remove
		//
		
	}

}

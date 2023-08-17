package com.javacourse.collections.examples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hash map es sin orden y no ordenado
		//HasTable: Son sincronizados o sea Thread safe
		//	Almacenar key sin valor
		//LinkedHashMap: Insercion y borrado mas lento busqueda rapida
		//TreeMap: Implementa Map y NavigableMap, es ordenado
		
		Map<String, Integer> map = Map.of("A", 5,"B", 45,"C", 75);
		//Todo lo que se crea con .of es inmutable
		
		map.get("A");
		map.size();
		map.isEmpty();
		map.containsKey("A");
		map.containsValue(8);
		map.keySet();
		map.values();
		
		Map<String, Integer> hashMap = new HashMap<>(map);
		hashMap.put("A", 70);
		hashMap.put("X", 40);
		hashMap.put("G", 20);
		hashMap.put("Y", 100);
		//Estos valores se ingresan y se ordenan
		
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(map);
		linkedHashMap.put("F", 70);
		linkedHashMap.put("E", 40);
		linkedHashMap.put("R", 20);
		linkedHashMap.put("Y", 100);
		
		Map<String, Integer> treeMap = new TreeMap<>(map);
		treeMap.put("N", 70);
		treeMap.put("O", 40);
		treeMap.put("E", 20);
		treeMap.put("M", 100);
		
		//Ejercicio ocurrencias 
		
		String str="Hola amigos este es un gran ejemplo";
		Map<Character, Integer> ocurrencias = new HashMap<>();
			//ocurrencias.put("H", 1);
		char[] chars = str.toCharArray();
		for(char character: chars) {
			//get character
			Integer integer = ocurrencias.get(character);
			if(integer == null) {
				ocurrencias.put(character, 1);
			}else {
				ocurrencias.put(character, integer+1);
			}
			//Si esta aumentar la cuenta
			//si no se inicializa
			
		}
		System.out.println("\n"+ocurrencias);

		Map<String, Integer> stringOcurrencias = new HashMap<>();
		//ocurrencias.put("H", 1);
	String[] words = str.split(" ");
	for(String word: words) {
		//get character
		Integer integer = stringOcurrencias.get(word);
		if(integer == null) {
			stringOcurrencias.put(word, 1);
		}else {
			stringOcurrencias.put(word, integer+1);
		}
		//Si esta aumentar la cuenta
		//si no se inicializa		
	}
	System.out.println("\n"+stringOcurrencias);
	
	//Jugando con TreeMap
	TreeMap<String, Integer> treeMap1 = new TreeMap<>();
	treeMap1.put("N", 70);
	treeMap1.put("O", 40);
	treeMap1.put("E", 20);
	treeMap1.put("M", 100);
	
	System.out.println("\n"+treeMap1.higherKey("B"));
	System.out.println(treeMap1.ceilingKey("B"));
	System.out.println(treeMap1.lowerKey("B"));
	System.out.println(treeMap1.floorKey("M"));
	System.out.println(treeMap1.firstEntry());
	System.out.println(treeMap1.lastEntry());
	System.out.println(treeMap1.subMap("A", "J"));
	System.out.println(treeMap1.size());
	System.out.println(treeMap1.subMap("B", false, "L", false));
}

	
	
}

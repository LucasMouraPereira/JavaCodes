package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		
		//Inserir elemento na lista:
		//add(obj), add(int, obj);
		
		list.add("Maria");
		list.add("Lucas");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("João");
		
		list.add(2, "Marco");
		list.add(4, "Marcio");
		list.add(3, "Alexandre");
		
		//Tamanho da lista:
		//size();
		
		System.out.println(list.size());
		
		System.out.println("-----------");
		
		for(String x : list) {
			System.out.println(x);	
		}
		
		
		
		//Remover elementos na lista:
		//remove(obj), remove(int), removeIf(Predicate);
		
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> (x.charAt(0) == 'M')); //predicado
		
		for(String x : list) {
			System.out.println(x);	
		}
		
		//Encontrar posição de elemento:
		//indexOf(obj), lastIndexOf(obj);
		
		System.out.println("-----------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		//Filtrar lista com base em predicado:
		//List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
		
		System.out.println("-----------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);	
		}

		//Encontrar primeira ocorrência com base em predicado:
		//Integer result = list.stream().filter(x -> x > 4).findFist().orElse(null);
		
		System.out.println("-----------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println(name);
		
	}

}

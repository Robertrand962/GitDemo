package STREAMSJAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streams {//FALTA ALGO DE TESTNG PA QUE NO MARQUE ERROR

	public static void regular() {//Normal
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
//En este test es de la manera regular con For loops para poder contar cuantos nombres empiezan con la letra A


	// @Test
	public void streamFilter() {//Filtro
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");   //CON STREAM FILTER se filtra la arraylist
		names.add("Alekhya");//Para poder hacer varios comandos y metodos
		names.add("Adam");
		names.add("Ram");
//There is no life for intermediate operations if there is no terminal ops..
//Terminal operation will execute only if inter operations (filter) returnstrue
//We can create Stream
//How to use filter in Stream API
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
//con Long para convertir en string el objeto en este caso c que es igual a
//La lista names.stream para utilizar stream y de ahi .filter para filtrar		
//(s->s.method()) es la syntax para poder aplicar el filtro de lo que quieras (que empiecen con una letra o terminen con otra etc...)
//.count para contar en este caso cuantas aplican		
		System.out.println(c);
//Para imprimir el object
		Long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
//Se crea otro object que contenga una lista, una lista en stream es Stream.of
//Agregas los valores de la lista			
			s.startsWith("A");
//condicion de que contenga al inicio una A mayuscula		
		}).count();
		System.out.println(d);
//imprimir object de los valores que cumplan la condicion
		// print all the names of ArrayList
//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));    	   
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
//En este caso es para imprimir valores de 4 letras o mas con el filtro s.length
//.limit sirve para imprimir 1 o el primero		
//.forEach(s->sysout(s)); para poder imprimir el stream que cumpla con los filtros y condiciones		
	}

	

	public void streamMap() {//Map para cambiar el string ya sea a mayusculas u otra cosa
    	   ArrayList<String> names = new ArrayList<String>();
    	   names.add("man");
    	   names.add("Don");
    	   names.add("women");
//Print names which have last letter as "a" with Uppercase (Mayuscula)    	   
    	   Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//Para hacer la lista que cumplan con el filtro de terminacion "a"
//y será convertido a mayusculas    	   
    	   .forEach(s->System.out.println(s));
//Para imprimir en consola    	   
    	   
//-----------------------------------------------------------------//    	   
//Print names which have first letter as a with uppercase and sorted
    	   List<String>names1=Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama"); 
//Se hace el array list llamado names1    	   
    	   names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//con .stream se pueden aplicar los metodos en este caso para ordenar es sorted
//.map para convertir a mayusculas y .forEach para imprimir    	   
//Mezclar dos listas diferentes con "Match"  -------------  	   
    	   Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//Se crea el Stream list para juntar dos listas names y names 1 con esta syntax    	   
//newStream.sorted().forEach(s->System.out.println(s)); PARA ORDENAR LA LISTA
           boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
//Es un valor boolean el object flag que es igual ala lista que coincida con Adam          
           System.out.println(flag);
//Imprime si si coincide .equalsIgnoreCase es para comparar sin contar mayusculas           
           Assert.assertTrue(flag);
//Para verificar si es True            
	}   
    	  	   
//-------------------------------------------------------------------------//
      // @Test
       public void streamCollect() {
    	//Lista 
       List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
       .collect(Collectors.toList());
//para recolectar los valores en otra lista que se formara con .collect
       System.out.println(ls.get(0));
//valor del index 0 Abhijeet    	   
       //   
       
    	List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
//Imprimir numeros unicos osea no repetidos
//Sort the array (ordenar el array)- y obtener el 3er index    	
       values.stream().distinct().forEach(s->System.out.println(s));
//Para imprimir valores unicos con distinct sin repetirse       
       List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
//Convertir la lista li que contiene los valores pero con distinct , ordenados con sorted y recolectado en otra lista        
       System.out.println(li.get(2));
//imprimir el 3 valor de la lista ordenado sin repetirse       
       }
       }
       
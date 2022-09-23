package Java;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// String es un objeto // String literal ... Hay dos maneras
		//String s ="roberto";
	//	String s1 = "roberto";    //String es un objeto que representa
		//String s5 = "hello";      // secuencia de characters
		
//Diferencias en String literal : if you have same multiple
//...values with the same name, then it won't create new object
// it will refer to the existing (ES LA MAS USADA EN AUTOMATION)
		
		//new Se puede definir String de dos maneras (Arriba y esta de abajo)
		//String s2 = new String("Welcome");
		//String s3 = new String("Welcome");
	
//No matter if it is the same string value, it will still explicity
//create new object in the memory space
// it will refer to the existing
		
		String s = "Rahul Shetty Academ";
//split method sirve para dividir ó separar el string convertirlo en ARRAY
//String [] splittedString = s.split(" "); //imprime RahulShettyAcadem
		String [] splittedString = s.split("Shetty"); // imprime RahulAcadem con espacio de más
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim()); //trim recorta espacios...
		//System.out.println(splittedString[2]); no se usa pq son 2 array
//CON TRIM RECORTA ESPACIOS IMPRIME Rahul, Academ,Academ 
		
// Con un for loop, se puede imprimir cada letra usando "s".chartAt(i));
//for (int i =0;i<s.length();i++) Con esto se imprime letra por 
//letra hacia abajo en orden normal
		for (int i =s.length()-1; i>=0;i--) //Imprime en orden al revés
		{
		System.out.println(s.charAt(i)); 
		}
//InterviewQuestion: Como se imprimen en orden al revés?
// con for (int i =s.length()-1; i>=0;i--)
	}

}

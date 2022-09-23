package Java;
import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int [] arr2 = {1,2,4,5,6,7,8,9,10,122};
		
		//2,4,6,8,10,122
		// check if array has multiple of 2
		for (int i =0; i <arr2.length;i++)
		{ 
			if (arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;
				// si pones un "break;" se cumple la condicion y no sigue imprimiendo mas
		}
		else
		{
			System.out.println(arr2[i] + "is not multiple of 2");
		}
	}

		ArrayList<String> a = new ArrayList<String>();
		a.add("roberto");
		a.add("shetty");
		a.add("Selenium");
		a.add("gomez");
		//a.add es para agregar valores de el arraylist
		//a.remove();   es para eliminar uno de la lista
		//a.get es para obtener de la lista
		System.out.println(a.get(3));
		
	}
}

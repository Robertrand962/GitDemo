package MetodosJava;
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();
		
	}
    public String getData()
    {
    	System.out.println("hello world");
    	return "rahul shetty";
    }
    public static String getData2() // cuando se hace static va pertenecer   
//a la clase no al objeto, se moverá a nivel de clase
// y podria llamarse directo sin crear objeto ejemp: getData en vez de d.getdata   
    {
    	System.out.println("hello world");
    	return "rahul shetty";
    }
    
	
}

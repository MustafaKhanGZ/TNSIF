
package Day10;

public class exceptionsdemo {
        ////Exception Handling by using try , catch  finally , throw and throws
	public void Demo(){//throws Exception  //Arthi exp
		int a = 5/1;
		System.out.println(a);
	}
	public void Show() {
	try {
		Demo();
	//	throw new Exception(); //Syntax for throw
		
	}catch(Exception e) {
		System.out.println("Exception---->"+e); //detailed message
	}finally {
		System.out.println("Hello World");
	}
	
}
	
	public static void main(String[] args){
		exceptionsdemo obj = new exceptionsdemo();
		obj.Show();
	}
    
}

    

//Program to demonstrate Lambda Expression
package Day18;


public class WithoutLambdaExpr { 
	  
	    public static void main(String[] args) {  
	        
	    	//without lambda, 
	    	//Message implementation using anonymous class  
	     
	        IStatement s=new IStatement() {
	        	public String show()
	        	{
	        		return "Welcome to Lambda Expression";
	        	}};
	        	
	        	System.out.println(s.show());
	        
	        		
	       
	    }  
	}  

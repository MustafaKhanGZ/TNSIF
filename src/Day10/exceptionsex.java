
package Day10;

public class exceptionsex {
    //Exception Handling by using try and catch

public void Demo() { //Arthi exp
    int a = 5/0;
    System.out.println(a);
}
public void Slave() {
    try {
        Demo();
        
    }catch(Exception e) {
        System.out.println("Exception---->"+e); //detailed message
    }
    
}

public static void main(String[] args) {
    exceptionsex obj = new exceptionsex();
    obj.Slave();
}
    
}

    


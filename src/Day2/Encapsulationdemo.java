package Day2; 

public class Encapsulationdemo {
    public static void main(String[] args) {
        encapsulation ob=new encapsulation();
        ob.setSerialnumber(1);
        ob.setName("mustafa");
        ob.setAge(20);
       System.out.println( ob.getSerialnumber());
       System.out.println(ob.getAge());
        System.out.println(ob.getName());
       
    }

   
    
}




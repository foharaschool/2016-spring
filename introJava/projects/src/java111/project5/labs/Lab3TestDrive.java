package java111.project5.labs;

public class Lab3TestDrive {
    
    public static void main(String[] args) {
        OverloadingConstructorA test1 = new OverloadingConstructorA();
        OverloadingConstructorA test2 = new OverloadingConstructorA(15);
        OverloadingConstructorA test3 = new OverloadingConstructorA("Barney");
        OverloadingConstructorA test4 = new OverloadingConstructorA();
        OverloadingConstructorA test5 = new OverloadingConstructorA(25);
        
        
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
    }
}
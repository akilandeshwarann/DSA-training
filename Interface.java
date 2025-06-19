interface A {
    void display();
}

class B implements A{
    public void display(){
        System.out.println("Hi..!!");
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.display(); 
    }
}

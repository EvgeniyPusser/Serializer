import java.io.Serializable;

public class Person implements Serializable {

    String name;
    int age;

    public void sayHello(){
        System.out.println("Hello"+ name);
    }
}

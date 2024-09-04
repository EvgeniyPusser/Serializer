import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
 Person person = new Person();

 person.name = "Grisha";
 person.age = 78;

        FileOutputStream fileOut = new FileOutputStream("PersonInfor.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(person);
        out.close();
        fileOut.close();

        System.out.println("Object serialised");


 person.sayHello();

 Person person1 = null;

        FileInputStream fileIn =  new FileInputStream("PersonInfor.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        person1 =(Person)in.readObject();
        in.close();
        fileIn.close();

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println("Object deserialized");
        }
    }

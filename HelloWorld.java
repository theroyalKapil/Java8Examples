package java8;

public class HelloWorld {
    public static void main(String[] args) {
       HelloWorldInterface helloWorldInterface= () -> System.out.println("Hello World");
       helloWorldInterface.display();
    }

}
interface HelloWorldInterface{
    void display();

}
package org.hcltech;

public class App {
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        String message = greeting.getMessage();
        System.out.println("Hello : "+message);

        String anotherMessage = greeting.getMessage();
        System.out.println(anotherMessage);
    }
}

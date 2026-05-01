package org.hcltech;

public class App {
    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        String message = greeting.greetingMessage();
        System.out.println("Hello : "+message);

        String specialMessage = greeting.greetingMessage();
        System.out.println(specialMessage);

        String anotherMessage = greeting.getAnotherMessage();
        System.out.println(anotherMessage);
    }
}

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

        String thirdMessage = greeting.getThirdMessage();
        System.out.println(thirdMessage);

        String fourthMessage = greeting.getFourthMessage();
        System.out.println(fourthMessage);

        String fifthMessage = greeting.getFifthMessage();
        System.out.println(fifthMessage);

        String sixthMessage = greeting.getSixthMessage();
        System.out.println(sixthMessage);
    }
}

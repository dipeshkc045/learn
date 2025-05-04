package org.dipesh.lambdaexpression;

public class TestA {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {

            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
        };
        greeting.sayHello();
    }
}

package org.trump.vincent.gof.structural.decorator;

public class Application {

    public static void main(String[] args) {
        Origin origin = new OriginImpl();

        Origin decorator = new Decorator(origin);
        decorator.function();

        Origin doubleDecorator = new DoubleDecorator(decorator);
        doubleDecorator.function();
    }
}

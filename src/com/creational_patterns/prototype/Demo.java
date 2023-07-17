package com.creational_patterns.prototype;

import com.creational_patterns.prototype.cache.BundledShapeCache;
import com.creational_patterns.prototype.shapes.Circle;
import com.creational_patterns.prototype.shapes.Rectangle;
import com.creational_patterns.prototype.shapes.Shape;
import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Demo2();
    }


    public static void Demo1() {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        System.out.println("直接clone出来的和原来一样吗？:" + circle.equals(anotherCircle));
        anotherCircle.color = "green";
        shapes.add(anotherCircle);
        System.out.println("clone后改色，还一样吗？：" + circle.equals(anotherCircle));

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    public static void Demo2() {
        BundledShapeCache cache = new BundledShapeCache();
        Shape shape1 = cache.get("red circle");
        Shape shape2 = cache.get("blue rectangle");
        Shape shape3 = cache.get("blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("red circle != blue rectangle (yay!)");
        } else {
            System.out.println("red circle == blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}

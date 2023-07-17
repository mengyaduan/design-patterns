package com.creational_patterns.prototype.cache;

import com.creational_patterns.prototype.shapes.Circle;
import com.creational_patterns.prototype.shapes.Rectangle;
import com.creational_patterns.prototype.shapes.Shape;

import java.util.HashMap;

public class BundledShapeCache {
    private HashMap<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 5;
        rectangle.y = 7;
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";

        cache.put("red circle", circle);
        cache.put("blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}

package com.creational_patterns.prototype.shapes;

public class Rectangle extends Shape {
    public int width;
    public int height;


    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.height = target.height;
            this.width = target.width;
        }
    }

    public Rectangle() {

    }


    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle) || !super.equals(object2)) {
            return false;
        }
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == width && shape2.height == height;
    }
}

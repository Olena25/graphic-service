package com.intellias.graphic.shape.impl;

import com.intellias.graphic.shape.Shape;

public class Triangle implements Shape {
    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }
}

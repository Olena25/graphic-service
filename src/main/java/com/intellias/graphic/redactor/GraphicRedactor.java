package com.intellias.graphic.redactor;

import com.intellias.graphic.shape.Shape;

public class GraphicRedactor implements ShapePrinter {
    @Override
    public void print(Shape shape) {
        shape.printName();
    }
}

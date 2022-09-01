package com.intellias.graphic;

import com.intellias.graphic.redactor.GraphicRedactor;
import com.intellias.graphic.redactor.ShapePrinter;
import com.intellias.graphic.shape.Shape;
import com.intellias.graphic.shape.impl.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Quad(),
                new Parallelepiped(), new Triangle(), new Rectangle());

        ShapePrinter shapePrinter = new GraphicRedactor();

        shapes.forEach(shapePrinter::print);
    }
}

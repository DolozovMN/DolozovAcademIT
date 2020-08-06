package ru.academit.dolozov.range_main;

import ru.academit.dolozov.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(10, 30);
        Range range2 = new Range(45, 120);

        double length1 = range1.getLength();
        double length2 = range2.getLength();

        System.out.println("Длина диапазона №1: " + length1);
        System.out.println("Длина диапазона №2: " + length2);

        double point = 60;

        if (range1.isInside(point)) {
            System.out.println("Число: " + point + " внутри диапазона №1 от " + range1.getFrom() + " до " + range1.getTo());
        } else {
            System.out.println("Число: " + point + " не входит в диапазон №1 от " + range1.getFrom() + " до " + range1.getTo());
        }

        if (range2.isInside(point)) {
            System.out.println("Число: " + point + " внутри диапазона №2 от " + range2.getFrom() + " до " + range2.getTo());
        } else {
            System.out.println("Число: " + point + " не входит в диапазон №2 от " + range2.getFrom() + " до " + range2.getTo());
        }

        Range rangeIntersection = range1.getIntersection(range2);

        if (rangeIntersection!= null){
            System.out.println("Диапазон пересечения от: " +rangeIntersection.getFrom()+ " до " +rangeIntersection.getTo()+ " , длиной: " +rangeIntersection.getLength());
        }
       else {
            System.out.println("Пересечения диапазонов нет");
        }
    }
}

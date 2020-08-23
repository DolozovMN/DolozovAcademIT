package ru.academit.dolozov.range_main;

import ru.academit.dolozov.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(20, 40);
        Range range2 = new Range(30, 50);

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

        System.out.println();

        Range rangeIntersection = range1.getIntersection(range2);

        if (rangeIntersection != null) {
            System.out.println("Диапазон пересечения: " + rangeIntersection.toString() + " длиной: " + rangeIntersection.getLength());
        } else {
            System.out.println("Пересечения диапазонов нет");
        }

        System.out.println();

        Range[] rangeUnion = range1.getUnion(range2);

        if (rangeUnion.length == 2) {
            System.out.println("Объедененый диапазон состоит из двух: ");
            System.out.println("1-ый: " + rangeUnion[0].toString());
            System.out.println("2-ой: " + rangeUnion[1].toString());
            System.out.println("Сумарная длина объедениненого диапазона: " + (rangeUnion[0].getLength() + rangeUnion[1].getLength()));
        } else {
            System.out.println("Объедененый диапазон: " + rangeUnion[0].toString() + " длиной " + rangeUnion[0].getLength());
        }

        System.out.println();

        Range[] rangeDifference = range1.getDifference(range2);

        if (rangeDifference.length == 0) {
            System.out.println("Диапазон разности отсутсвует ");
        } else if (rangeDifference.length == 2) {
            System.out.println("Диапазон разности состоит из двух: ");
            System.out.println("1-ый: " + rangeDifference[0].toString());
            System.out.println("2-ой: " + rangeDifference[1].toString());
            System.out.println("Сумарная длина диапазона разности: " + (rangeDifference[0].getLength() + rangeDifference[1].getLength()));
        } else {
            System.out.println("Диапазон разности: " + rangeDifference[0].toString() + " длиной " + rangeDifference[0].getLength());
        }
    }
}

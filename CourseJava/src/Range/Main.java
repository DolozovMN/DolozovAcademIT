package Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(10, 50);
        Range range2 = new Range(40, 120);

        double distance1 = range1.getLength();
        double distance2 = range2.getLength();

        System.out.println("Длина диапазона №1: " + distance1);
        System.out.println("Длина диапазона №2: " + distance2);

        double point = 60;

        if (range1.isInside(point)) {
            System.out.println("Число: " + point + " внутри диапазона №1 от " + range1.getFrom() + " до " + range1.getTo());
        } else {
            System.out.println("Число: " + point + " не входит в диапазон от " + range1.getFrom() + " до " + range1.getTo());
        }

        if (range1.isInside(point)) {
            System.out.println("Число: " + point + " внутри диапазона №1 от " + range1.getFrom() + " до " + range1.getTo());
        } else {
            System.out.println("Число: " + point + " не входит в диапазон от " + range1.getFrom() + " до " + range1.getTo());
        }
    }
}

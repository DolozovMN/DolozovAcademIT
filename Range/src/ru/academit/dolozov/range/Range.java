package ru.academit.dolozov.range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLength() {
        return to - from;
    }

    public boolean isInside(double number) {
        return number <= to && number >= from;
    }

    public double getToMin(Range range) {
        return Math.min(this.to, range.getTo());
    }

    public double getFromMax(Range range) {
        return Math.max(this.from, range.getFrom());
    }

    public Range getIntersection(Range range) {
        double length = getToMin(range) - getFromMax(range);

        if (length > 0) {
            return new Range(getFromMax(range),getToMin(range));
        }

        return null;
    }
}

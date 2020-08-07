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

    public double getFromMin(Range range) {
        return Math.min(this.from, range.getFrom());
    }

    public double getFromMax(Range range) {
        return Math.max(this.from, range.getFrom());
    }

    public double getToMin(Range range) {
        return Math.min(this.to, range.getTo());
    }

    public double getToMax(Range range) {
        return Math.max(this.to, range.getTo());
    }

    public Range getIntersection(Range range) {

        if (getToMin(range) - getFromMax(range) > 0) {
            return new Range(getFromMax(range), getToMin(range));
        }

        return null;
    }

    public Range[] getUnion(Range range) {

        if (getToMin(range) < getFromMax(range)) {
            return new Range[]{new Range(getFromMin(range), getToMin(range)), new Range(getFromMax(range), getToMax(range))};
        }

        return new Range[]{new Range(getFromMin(range), getToMax(range))};
    }

    public Range[] getDifference(Range range) {

        if (getFromMin(range) == getFromMax(range) && getToMin(range) == getToMax(range)) {
            return null;
        } else if (getToMin(range) < getFromMax(range)) {
            return null;
        } else if (getFromMin(range) == getFromMax(range)) {
            return new Range[]{new Range(getToMin(range), getToMax(range))};
        } else if (getToMin(range) == getToMax(range)) {
            return new Range[]{new Range(getFromMin(range), getFromMax(range))};
        }
        return new Range[]{new Range(getFromMin(range), getFromMax(range)), new Range(getToMin(range), getToMax(range))};
    }
}

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

    public Range getIntersection(Range range) {
        if (Math.min(this.to, range.to) > Math.max(this.from, range.from)) {
            return new Range(Math.max(this.from, range.from), Math.min(this.to, range.to));
        }

        return null;
    }

    public Range[] getUnion(Range range) {
        if (Math.min(to, range.to) >= Math.max(from, range.from)) {
            return new Range[]{new Range(Math.min(from, range.from), Math.max(to, range.to))};
        }

        return new Range[]{new Range(Math.min(from, range.from), Math.min(to, range.to)),
                new Range(Math.max(from, range.from), Math.max(to, range.to))};
    }

    public Range[] getDifference(Range range) {
        if (from < range.from && to > range.to) {
            return new Range[]{new Range(from, range.from), new Range(range.to, to)};
        }
        if (from >= range.from && to <= range.to) {
            return new Range[]{};
        }
        if (from < range.to && from >= range.from) {
            return new Range[]{new Range(range.to, to)};
        }
        if (to > range.from && to <= range.to) {
            return new Range[]{new Range(from, range.from)};
        }

        return new Range[]{new Range(from, to)};
    }

    @Override
    public String toString() {
        return "от " + from + " до " + to;
    }
}

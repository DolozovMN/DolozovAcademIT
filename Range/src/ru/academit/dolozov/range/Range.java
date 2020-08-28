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
        double MaxFrom = Math.max(from, range.from);
        double MinTo = Math.min(to, range.to);

        if (MinTo > MaxFrom) {
            return new Range(MaxFrom, MinTo);
        }

        return null;
    }

    public Range[] getUnion(Range range) {
        double MinFrom = Math.min(from, range.from);
        double MaxFrom = Math.max(from, range.from);
        double MinTo = Math.min(to, range.to);
        double MaxTo = Math.max(to, range.to);

        if (MinTo >= MaxFrom) {
            return new Range[]{new Range(MinFrom, MaxTo)};
        }

        return new Range[]{new Range(MinFrom, MinTo),
                new Range(MaxFrom, MaxTo)};
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

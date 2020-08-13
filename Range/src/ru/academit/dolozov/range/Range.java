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

    public int compareRanges(Range range) {
        if (this.from == range.from && this.to == range.to) {
            return 0;
        } else if (this.from == range.from) {
            return 1;
        } else if (this.to == range.to) {
            return 2;
        } else if (this.to == range.from || this.from == range.to) {
            return 3;
        } else if (Math.min(this.to, range.to) > Math.max(this.from, range.from)) {
            return 4;
        }

        return -1;
    }

    public Range getIntersection(Range range) {
        int index = compareRanges(range);

        if (index == 0) {
            return new Range(this.from, this.to);
        } else if (index == 1 || index == 2 || index == 4) {
            return new Range(Math.max(this.from, range.from), Math.min(this.to, range.to));
        }

        return null;
    }

    public Range[] getUnion(Range range) {
        int index = compareRanges(range);

        if (index == -1) {
            return new Range[]{new Range(Math.min(this.from, range.from), Math.min(this.to, range.to)),
                    new Range(Math.max(this.from, range.from), Math.max(this.to, range.to))};
        }

        return new Range[]{new Range(Math.min(this.from, range.from), Math.max(this.to, range.to))};
    }

    public Range[] getDifference(Range range) {
        int index = compareRanges(range);

        if (index == 1) {
            return new Range[]{new Range((Math.min(this.to, range.to)), Math.max(this.to, range.to))};
        } else if (index == 2) {
            return new Range[]{new Range((Math.min(this.from, range.from)), Math.max(this.from, range.from))};
        } else if (index == 4) {
            return new Range[]{new Range((Math.min(this.from, range.from)), Math.max(this.from, range.from)),
                    new Range((Math.min(this.to, range.to)), Math.max(this.to, range.to))};
        }

        return new Range[]{};
    }

    @Override
    public String toString() {
        return "от " + this.from + " до " + this.to;
    }
}

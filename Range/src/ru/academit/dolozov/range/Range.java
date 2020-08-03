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

    public void setIntersection(double from1, double from2, double to1, double to2) {
        double fromNew = Math.max(from1, from2);
        double toNew = Math.min(to1, to2);

        if (toNew - fromNew > 0) {
            this.to = toNew;
            this.from = fromNew;
        }

    }




}

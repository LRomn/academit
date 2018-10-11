package ru.nsk.hgg2018.lelikov;

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
        return this.to - this.from;
    }

    public boolean isInside(double c) {
        return this.from <= c && c <= this.to;
    }

    public Range getIntersection(Range secondInterval) {
        if (this.from >= secondInterval.to || this.to <= secondInterval.from) {
            return null;
        } else {
            return new Range(Math.max(this.from, secondInterval.from), Math.min(this.to, secondInterval.to));
        }
    }

    public Range[] getIntervalsUnion(Range secondInterval) {
        if (this.from > secondInterval.to || this.to < secondInterval.from) {
            return new Range[]{new Range(this.from, this.to), new Range(secondInterval.from, secondInterval.to)};
        } else {
            Range unionRange = new Range(Math.min(this.from, secondInterval.from), Math.max(this.to, secondInterval.to));
            return new Range[]{unionRange};
        }
    }

    public Range[] getIntervalsDifference(Range secondInterval) {
        if (this.from > secondInterval.to || this.to < secondInterval.from) {
            return new Range[]{new Range(this.from, this.to), new Range(secondInterval.from, secondInterval.to)};
        } else if (this.from == secondInterval.to || this.to == secondInterval.from) {
            return new Range[]{new Range(Math.min(this.from, secondInterval.from), Math.max(this.to, secondInterval.to))};
        } else if (this.from < secondInterval.from && this.to > secondInterval.to) {
            return new Range[]{new Range(this.from, secondInterval.from), new Range(secondInterval.to, this.to)};
        } else if (this.from < secondInterval.from && this.to < secondInterval.to) {
            return new Range[]{new Range(this.from, secondInterval.from)};
        } else if (this.from > secondInterval.from && this.to > secondInterval.to) {
            return new Range[]{new Range(secondInterval.to, this.to)};
        } else if (this.from == secondInterval.from && this.to > secondInterval.to) {
            return new Range[]{new Range(secondInterval.to, this.to)};
        } else if (this.from < secondInterval.from && this.to == secondInterval.to) {
            return new Range[]{new Range(this.from, secondInterval.from)};
        } else {
            return new Range[0];
        }
    }
}

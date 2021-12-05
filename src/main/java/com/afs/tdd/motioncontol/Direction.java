package com.afs.tdd.motioncontol;

public enum Direction {
    North,East,South,West;
    static public final Direction[] values = values();

    public Direction prev() {
        return values[(ordinal() - 1  + values.length) % values.length];
    }

    public Direction next() {
        return values[(ordinal() + 1) % values.length];
    }
}

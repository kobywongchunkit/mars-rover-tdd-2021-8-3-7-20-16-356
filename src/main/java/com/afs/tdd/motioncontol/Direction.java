package com.afs.tdd.motioncontol;

import java.util.Arrays;

public enum Direction {
    North('N'),East('E'),South('S'),West('W');
    char abbv;
    static public final Direction[] values = values();

    Direction(char abbv) {
        this.abbv = abbv;
    }

    char getAbbv(){
        return this.abbv;
    }

    static Direction getDirectionFromAbbv(char abbv){
        return Arrays.stream(values)
                .filter(direction -> direction.abbv == abbv)
                .findFirst()
                .orElse(Direction.North);

    }

    public Direction prev() {
        return values[(ordinal() - 1  + values.length) % values.length];
    }

    public Direction next() {
        return values[(ordinal() + 1) % values.length];
    }
}

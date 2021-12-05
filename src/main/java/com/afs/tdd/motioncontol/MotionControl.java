package com.afs.tdd.motioncontol;

public class MotionControl {
    private Direction direction;
    private int location_x = 0;
    private int location_y = 0;

    public MotionControl(int x, int y, String dir) {
        location_x = x;
        location_y = y;
        switch (dir){
            case "N":
                direction = Direction.North;
                break;
            case "E":
                direction = Direction.East;
                break;
            case "S":
                direction = Direction.South;
                break;
            case "W":
                direction = Direction.West;
                break;
        }
    }

    public void moveForward() {
        switch (direction){
            case North:
                location_y++;
                break;
            case East:
                location_x++;
                break;
            case South:
                location_y--;
                break;
            case West:
                location_x--;
                break;
        }
    }

    public void turnLeft() {
        direction = direction.prev();
    }

    public void turnRight() {
        direction = direction.next();
    }

    @Override
    public String toString() {
        return String.format("%d %d %c",location_x,location_y,direction.toString().charAt(0));
    }
}

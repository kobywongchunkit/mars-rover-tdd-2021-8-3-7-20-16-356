package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_return_locationPoint_W_when_turnLeft_given_locationPoint_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 W", actual);
    }

    @Test
    void should_return_locationPoint_S_when_turnLeft_given_locationPoint_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 S", actual);
    }

    @Test
    void should_return_locationPoint_E_when_turnLeft_given_locationPoint_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 E", actual);
    }

    @Test
    void should_return_locationPoint_N_when_turnLeft_given_locationPoint_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "L";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 N", actual);
    }

    @Test
    void should_return_locationPoint_E_when_turnRight_given_locationPoint_N() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "R";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 E", actual);
    }

    @Test
    void should_return_locationPoint_S_when_turnRight_given_locationPoint_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "R";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 S", actual);
    }

    @Test
    void should_return_locationPoint_W_when_turnRight_given_locationPoint_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "R";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 W", actual);
    }

    @Test
    void should_return_locationPoint_N_when_turnRight_given_locationPoint_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "R";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 0 N", actual);
    }

    @Test
    void should_return_locationY_add1_when_moveForward_given_locationPoint_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "M";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 1 N", actual);
    }

    @Test
    void should_return_locationY_minus1_when_moveForward_given_locationPoint_S() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        String command = "M";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("0 -1 S", actual);
    }

    @Test
    void should_return_locationX_minus1_when_moveForward_given_locationPoint_W() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        String command = "M";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("-1 0 W", actual);
    }

    @Test
    void should_return_locationX_add1_when_moveForward_given_locationPoint_E() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        String command = "M";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("1 0 E", actual);
    }

    @Test
    void should_return_corresponding_position_when_multi_movements_given_multi_command_MLMR() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        String command = "MLMR";
        //when
        marsRover.executeCommand(command);
        String actual = marsRover.getStatus();
        //then
        assertEquals("-1 1 N", actual);
    }
}
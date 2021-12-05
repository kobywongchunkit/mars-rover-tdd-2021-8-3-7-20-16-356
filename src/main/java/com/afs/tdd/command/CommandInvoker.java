package com.afs.tdd.command;

import java.util.LinkedList;
import java.util.Queue;

public class CommandInvoker {
    private final Queue<Command> orders = new LinkedList<>();

    public void addOrder(Command command) {
        orders.offer(command);
    }

    public void sendOrders() {
        while (!orders.isEmpty()) {
            Command command = orders.poll();
            command.execute();
        }
    }
}

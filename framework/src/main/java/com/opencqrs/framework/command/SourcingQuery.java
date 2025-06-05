package com.opencqrs.framework.command;

@FunctionalInterface
public interface SourcingQuery<C extends Command> {

    String queryFor(C command);
}

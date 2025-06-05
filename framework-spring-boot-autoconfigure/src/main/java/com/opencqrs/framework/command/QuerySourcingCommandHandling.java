package com.opencqrs.framework.command;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@CommandHandling(sourcingMode = SourcingMode.RECURSIVE) // TODO: QUERY
public @interface QuerySourcingCommandHandling {

    // should be mapped to @CommandHandling by spring
    Class<? extends SourcingQuery<? extends Command>> query();
}

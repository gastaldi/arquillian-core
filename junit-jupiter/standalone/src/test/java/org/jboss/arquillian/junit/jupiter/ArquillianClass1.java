package org.jboss.arquillian.junit.jupiter;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@ArquillianTest
public class ArquillianClass1 {

    @BeforeAll
    public static void beforeAll() throws Throwable {
//        wasCalled(Cycle.BEFORE_ALL);
    }

    @AfterAll
    public static void afterAll() throws Throwable {
//        wasCalled(Cycle.AFTER_ALL);
    }

    @BeforeEach
    public void beforeEach() throws Throwable {
//        wasCalled(Cycle.BEFORE_EACH);
    }

    @AfterEach
    public void afterEach() throws Throwable {
//        wasCalled(Cycle.AFTER_EACH);
    }

    @Test
    public void shouldBeInvoked() throws Throwable {
//        wasCalled(Cycle.TEST);
    }

}

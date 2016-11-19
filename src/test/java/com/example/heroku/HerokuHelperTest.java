package com.example.heroku;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

import static org.junit.Assert.assertEquals;

/**
 * This class contains tests for the HerokuHelper class.
 */
public class HerokuHelperTest {
    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    @Test
    public void returnDefaultPortIfNotInEnvironmentVariables() {
        final int DEFAULT_PORT = 4567;

        assertEquals("Assigned port should be 4567", DEFAULT_PORT, HerokuHelper.getAssignedPort());
    }

    @Test
    public void returnAssignedPort() {
        final int ASSIGNED_PORT = 8080;
        environmentVariables.set("PORT", Integer.toString(ASSIGNED_PORT));

        assertEquals("Assigned port should be 8080", ASSIGNED_PORT, HerokuHelper.getAssignedPort());
    }
}

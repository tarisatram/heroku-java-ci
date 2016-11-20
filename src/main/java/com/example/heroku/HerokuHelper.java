package com.example.heroku;

/**
 * This class contains helper methods for deploying to Heroku.
 */
public class HerokuHelper {
    /**
     * @return The port for the server to listen on.
     */
    public static int getAssignedPort() {
        // Default TCP port to use when deploying locally.
        final int DEFAULT_PORT = 4567;

        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }

        // return DEFAULT_PORT if the PORT environment variable isn't set.
        return DEFAULT_PORT;
    }
}

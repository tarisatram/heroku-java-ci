package com.example.heroku;

/**
 * This class contains helper methods for deploying to Heroku.
 */
public class HerokuHelper {
    /**
     * @return The port for the server to listen on.
     */
    public static int getAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}

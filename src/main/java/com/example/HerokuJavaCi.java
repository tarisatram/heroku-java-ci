package com.example;

import com.example.heroku.HerokuHelper;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * HerokuJavaCi is an example of automated JUnit testing and deployment of a Java Spark
 * application to Heroku, utilizing Travis CI.
 *
 * References:
 * https://devcenter.heroku.com/articles/deploying-java-applications-to-heroku-from-eclipse-or-intellij-idea
 * https://devcenter.heroku.com/articles/deploying-java-applications-with-the-heroku-maven-plugin
 * https://sparktutorials.github.io/2015/08/24/spark-heroku.html
 */
public class HerokuJavaCi {
    // Helper class for Heroku deploy.
    private static final HerokuHelper herokuHelper = new HerokuHelper();
    public static void main(String[] args) {
        // Set the port to listen on.
        port(herokuHelper.getAssignedPort());
        // Route for HTTP GETs to /ping
        get("/ping", (req, res) -> "PONG!");
    }
}

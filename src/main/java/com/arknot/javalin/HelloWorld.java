package com.arknot.javalin;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/hello/:name", ctx -> {
            ctx.result("Hello: " + ctx.pathParam("name"));
        });

        app.get("/hello/*/and/*", ctx -> {
            ctx.result("Hello: " + ctx.splat(0) + " and " + ctx.splat(1));
        });
    }
}
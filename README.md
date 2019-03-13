# hellow-world-javalin
A Hello World REST API created with Javalin

Currently this end points are available

```
        app.get("/", ctx -> ctx.result("Hello World"));

        app.get("/hello/:name", ctx -> {
            ctx.result("Hello: " + ctx.pathParam("name"));
        });

        app.get("/hello/*/and/*", ctx -> {
            ctx.result("Hello: " + ctx.splat(0) + " and " + ctx.splat(1));
        });

```

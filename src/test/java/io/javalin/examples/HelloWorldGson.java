/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.javalin.Javalin;
import io.javalin.json.JavalinJson;
import java.util.Arrays;

public class HelloWorldGson {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().create();
        JavalinJson.setFromJsonMapper(gson::fromJson);
        JavalinJson.setToJsonMapper(gson::toJson);

        Javalin app = Javalin.create().port(7070).start();
        app.get("/", ctx -> ctx.json(Arrays.asList("a", "b", "c")));

    }

}

package com.easy2excel;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String,String> {
    @Override
    public String handleRequest(String input, Context context) {
        context.getLogger().log("welcome to my first " + input);
        return "welcome to my first " + input;
    }
}

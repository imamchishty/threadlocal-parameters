package com.shedhack.thread.parameters.parameters;

import java.util.ArrayList;
import java.util.List;

public class MethodChain {

    private List<MethodCall> methodCalls = new ArrayList<>();


    public MethodChain addMethodChain(MethodCall call) {
        this.methodCalls.add(call);
        return this;
    }

    @Override
    public String toString() {
        return "{\"MethodChain\":"
                 + methodCalls;
    }
}

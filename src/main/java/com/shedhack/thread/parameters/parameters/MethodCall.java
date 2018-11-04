package com.shedhack.thread.parameters.parameters;

import java.util.HashMap;
import java.util.Map;

public class MethodCall {

    public MethodCall(String name, Map<String, Object> params) {
        this.name = name;
        this.params = params;
    }

    private String name;

    private Map<String, Object> params;


    public String getName() {
        return name;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    @Override
    public String toString() {
        return "{"
                + "\"name\":\"" + name + "\""
                + ", \"params\": [" + params
                + "]";
    }

    public static class Builder {

        private String name;

        private Map<String, Object> params = new HashMap<>();

        public Builder withMethodName(String name) {
            this.name = name;
            return this;
        }

        public Builder withParam(String name, Object value) {
            this.params.put(name, value);
            return this;
        }

        public MethodCall build() {
            if(name !=null && params != null) {
                return new MethodCall(name, params);
            }

            throw new IllegalStateException("The name and the parameters need to be valid. They cannot be null. Unable to create the MethodCall object.");
        }

    }

    // ----------------
    // Static method
    // ----------------

    public static Builder builder() {
        return new Builder();
    }

}

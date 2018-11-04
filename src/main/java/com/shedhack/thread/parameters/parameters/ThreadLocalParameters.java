package com.shedhack.thread.parameters.parameters;


/**
 * Utility class simplifies the manner in which ThreadLocal (for parameters) are stored, accessed and cleared.
 *
 * @author imamchishty
 */
public class ThreadLocalParameters {

    private static final ThreadLocal<MethodChain> local = new ThreadLocal<>();

    public static void set(MethodChain chain) {
        local.set(chain);
    }

    public static MethodChain get() {
        return local.get();
    }

    public static void clear(){
        local.remove();
    }

}
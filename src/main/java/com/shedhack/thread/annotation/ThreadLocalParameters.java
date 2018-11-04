package com.shedhack.thread.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotate methods that you wish to be enabled for setting the thread context.
 * If you have some params that need to be hidden then mark them using the
 * {@link com.shedhack.thread.annotation.Ignore} annotation.
 */
@Target({ElementType.METHOD})
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface ThreadLocalParameters {

    ThreadContextType type() default ThreadContextType.JSON;

}

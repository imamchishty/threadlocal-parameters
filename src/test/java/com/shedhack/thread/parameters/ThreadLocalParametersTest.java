package com.shedhack.thread.parameters;

import com.shedhack.thread.parameters.parameters.MethodCall;
import com.shedhack.thread.parameters.parameters.MethodChain;
import com.shedhack.thread.parameters.parameters.ThreadLocalParameters;
import org.junit.Assert;
import org.junit.Test;

public class ThreadLocalParametersTest {

    @Test
    public void should_set_method_chain_to_thread_local() {

        // Arrange
        MethodChain chain = new MethodChain()
                .addMethodChain(MethodCall.builder().withMethodName("M1").withParam("name", "imam").build());


        // Act
        ThreadLocalParameters tlp = new ThreadLocalParameters();
        tlp.set(chain);


        tlp.get().addMethodChain(MethodCall.builder().withMethodName("M2").withParam("age", 12).build());

        // Assert
        Assert.assertNotNull(tlp.get());

        tlp.clear();

        Assert.assertNull(tlp.get());
    }

}

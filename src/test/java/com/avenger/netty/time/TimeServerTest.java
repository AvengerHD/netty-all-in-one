package com.avenger.netty.time;

import org.junit.Assert;
import org.junit.Test;

public class TimeServerTest {

    @Test
    public void testServer(){
        int port = 8080;
        try {
            new TimeServer().bind(port);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}

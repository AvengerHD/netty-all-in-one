package com.avenger.netty.time;

import org.junit.Assert;
import org.junit.Test;

public class TimeClientTest {

    @Test
    public void testClient(){
        int port = 8080;
        try {
            new TimeClient().connect(port, "127.0.0.1");
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }
}

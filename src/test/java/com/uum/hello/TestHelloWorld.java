
package com.uum.hello;

import com.uum.Hello.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class TestHelloWorld {
    @Test
    public void testHello(){
        HelloWorld hw= new HelloWorld();
        hw.sayHello("Onn");
        Assert.assertEquals("Hello Onn","Hello Onn");
        
    }
    
}

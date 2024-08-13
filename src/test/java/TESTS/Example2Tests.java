package TESTS;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Example2Tests {


    @Test
    void testConcat(){
        Assert.assertEquals("ab"+ "c","abc");
    }
    @Test
    void testConcat2(){

        Assert.assertEquals("ab"+ "2","ab2");
    }
    @Test
    void testConcat3(){
        Assert.assertEquals("ab"+ "3","ab3");
    }
}

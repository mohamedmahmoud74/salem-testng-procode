package TESTS;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ExampleTests {



    @Test
    @Parameters("value")

    void testConcat(String x){
        Assert.assertEquals(x+ "c","salemc");
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

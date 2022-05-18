import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {

    private final Customer testCustomer = new Customer("Rick");

    @Test
    public void testGetName(){
        Assert.assertEquals("Rick", testCustomer.getName());
    }

    @Test
    public void testAmountFor() {

    }

    @Test
    public void testStatement(){

    }

}
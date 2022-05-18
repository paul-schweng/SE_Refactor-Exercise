import org.junit.Assert;
import org.junit.Test;


public class MovieTest {

    private final Movie testMovie= new Movie("Pokemon", 5);

    @Test
    public void testGetMovie(){
        Assert.assertEquals("Pokemon",testMovie.getTitle());
    }

    @Test
    public void testGetPriceCode(){
        Assert.assertEquals(5, testMovie.getPriceCode());
    }

    @Test
    public void testSetPriceCode(){
        testMovie.setPriceCode(20);
        Assert.assertEquals(20, testMovie.getPriceCode());
    }

}
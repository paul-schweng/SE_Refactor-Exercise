import org.junit.Assert;
import org.junit.Test;


public class RentalTest {

    private final Movie testMovie = new Movie( "Iron Man", 10);
    private final Rental testRental = new Rental(testMovie, 25);

    @Test
    public void testGetMovie() {
        Assert.assertEquals(testMovie, testRental.getMovie());
    }

    @Test
    public void testGetDaysRented(){
        Assert.assertEquals(25, testRental.getDaysRented());
    }
}

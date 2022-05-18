import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Customer {
    private final String name;
    private final List<Rental> rentals = new ArrayList<>();


    public Customer (String newName){
        name = newName;
    }


    public void addRental(Rental rental) {
        rentals.add(rental);
    }


    public String getName (){
        return name;
    }


    public String generateRentalRecord() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentalsIterator = rentals.iterator();

        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (rentalsIterator.hasNext()) {
            double thisAmount;
            Rental rental = rentalsIterator.next();

            //determine amounts for each line
            thisAmount = rental.amountFor();

            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints++;

            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle()+ "\t" + "\t" + rental.getDaysRented() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }

        //add footer lines
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";

        return result;
    }




}
    
class Rental {
    private final Movie movie;
    private final int daysRented;


    public Rental(Movie newMovie, int newDaysRented) {
        movie = newMovie;
        daysRented = newDaysRented;
    }


    public int getDaysRented() {
        return daysRented;
    }


    public Movie getMovie() {
        return movie;
    }


    public double amountFor() {
        double thisAmount = 0;

        switch (this.getMovie().getPriceCode()) {
            case Movie.REGULAR -> {
                thisAmount += 2;
                if (this.getDaysRented() > 2)
                    thisAmount += (this.getDaysRented() - 2) * 1.5;
            }

            case Movie.NEW_RELEASE -> thisAmount += this.getDaysRented() * 3;

            case Movie.CHILDREN -> {
                thisAmount += 1.5;
                if (this.getDaysRented() > 3)
                    thisAmount += (this.getDaysRented() - 3) * 1.5;
            }
        }

        return thisAmount;
    }


}
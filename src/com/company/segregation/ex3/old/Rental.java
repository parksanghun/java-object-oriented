package com.company.segregation.ex2.old;

public class Rental {
    private Movie movie;
    private int daysRented;

    @Deprecated
    public int getFrequentRenterPointsOld() {
        if (movie.getPriceCode() == Movie.NEW_RELEASE && daysRented > 1)
            return 2;
        else
            return 1;
    }

    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}

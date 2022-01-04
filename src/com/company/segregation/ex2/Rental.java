package com.company.segregation.ex2;

public class Rental {
    private Movie movie;
    private int daysRented;

    public int getFrequentRenterPoints() {
        return movie.getFrequntRenterPoints(daysRented);
    }
}

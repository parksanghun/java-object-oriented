package com.company.segregation.ex2.old;

public class Movie {
    public static int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public int priceCode;

    public int getPriceCode() {
        return priceCode;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (priceCode == Movie.NEW_RELEASE && daysRented > 1)
            return 2;
        else
            return 1;
    }
}

package com.company.segregation.ex2;

public class NewReleaseMovie extends Movie {
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return daysRented > 1 ? 2 : 1;
    }
}

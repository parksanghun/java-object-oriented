package com.company.segregation.ex2;

public class RegularMovie extends Movie {
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}

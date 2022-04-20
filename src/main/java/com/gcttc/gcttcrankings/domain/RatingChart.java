package com.gcttc.gcttcrankings.domain;

public class RatingChart {

    private RatingChart() {
    }

    private static final int[] expectedResultExchangePoints = {
            8,7,6,5,4,3,2,2,1,1,0
    };

    private static final int[] upsetResultExchangePoints = {
            8,10,13,16,20,25,30,35,40,45,50
    };

    private static int calculateIndex(int playerARating, int playerBRating) {
        int pointSpread = Math.abs (playerARating - playerBRating);
        if (pointSpread <= 12) {
            return 0;
        } else if (pointSpread <= 37) {
            return 1;
        } else if (pointSpread <= 62) {
            return 2;
        } else if (pointSpread <= 87) {
            return 3;
        } else if (pointSpread <= 112) {
            return 4;
        } else if (pointSpread <= 137) {
            return 5;
        } else if (pointSpread <= 162) {
            return 6;
        } else if (pointSpread <= 187) {
            return 7;
        } else if (pointSpread <= 212) {
            return 8;
        } else if (pointSpread <= 237) {
            return 9;
        }
        return 10;
    }

    public static int getExchangedPoints (int playerARating, int playerBRating, boolean expectedResult) {

        if (expectedResult) {
            return expectedResultExchangePoints[calculateIndex (playerARating, playerBRating)];
        }

        return upsetResultExchangePoints[calculateIndex (playerARating, playerBRating)];

    }
}

package com.gcttc.gcttcrankings;

import com.gcttc.gcttcrankings.domain.RatingChart;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RatingChartTest {

    private static final int[] EXPECTED_RESULT_EXCHANGE_POINTS = {
            8,7,6,5,4,3,2,2,1,1,0
    };

    private static final int[] UPSET_RESULT_EXCHANGE_POINTS = {
            8,10,13,16,20,25,30,35,40,45,50
    };
    public static final int IRRELEVANT_RATING = 1400;
    public static final int FIRST_LEVEL_IRRELEVANT_DIFFERENCE = 5;
    public static final int SECOND_LEVEL_IRRELEVANT_DIFFERENCE = 20;
    public static final int THIRD_LEVEL_IRRELEVANT_DIFFERENCE = 40;
    public static final int FOURTH_LEVEL_IRRELEVANT_DIFFERENCE = 70;
    public static final int FIFTH_LEVEL_IRRELEVANT_DIFFERENCE = 90;
    public static final int SIXTH_LEVEL_IRRELEVANT_DIFFERENCE = 120;
    public static final int SEVENTH_LEVEL_IRRELEVANT_DIFFERENCE = 150;
    public static final int EIGHTH_LEVEL_IRRELEVANT_DIFFERENCE = 170;
    public static final int NINTH_LEVEL_IRRELEVANT_DIFFERENCE = 200;
    public static final int TENTH_LEVEL_IRRELEVANT_DIFFERENCE = 220;
    public static final int ELEVENTH_LEVEL_IRRELEVANT_DIFFERENCE = 250;

    @Test
    void getFirstLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + FIRST_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[0], exchangedPoints);

    }

    @Test
    void getFirstLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + FIRST_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[0], exchangedPoints);

    }

    @Test
    void getSecondLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + SECOND_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[1], exchangedPoints);

    }

    @Test
    void getSecondLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + SECOND_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[1], exchangedPoints);

    }

    @Test
    void getThirdLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + THIRD_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[2], exchangedPoints);

    }

    @Test
    void getThirdLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + THIRD_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[2], exchangedPoints);

    }

    @Test
    void getFourthLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + FOURTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[3], exchangedPoints);

    }

    @Test
    void getFourthLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + FOURTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[3], exchangedPoints);

    }

    @Test
    void getFifthLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + FIFTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[4], exchangedPoints);

    }

    @Test
    void getFifthLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + FIFTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[4], exchangedPoints);

    }

    @Test
    void getSixthLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + SIXTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[5], exchangedPoints);

    }

    @Test
    void getSixthLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + SIXTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[5], exchangedPoints);

    }

    @Test
    void getSeventhLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + SEVENTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[6], exchangedPoints);

    }

    @Test
    void getSeventhLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + SEVENTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[6], exchangedPoints);

    }

    @Test
    void getEighthLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + EIGHTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[7], exchangedPoints);

    }

    @Test
    void getEighthLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + EIGHTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[7], exchangedPoints);

    }

    @Test
    void getNinthLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + NINTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[8], exchangedPoints);

    }

    @Test
    void getNinthLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + NINTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[8], exchangedPoints);

    }

    @Test
    void getTenthLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + TENTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[9], exchangedPoints);

    }

    @Test
    void getTenthLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + TENTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[9], exchangedPoints);

    }

    @Test
    void getEleventhLevelExpectedResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + ELEVENTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = true;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (EXPECTED_RESULT_EXCHANGE_POINTS[10], exchangedPoints);

    }

    @Test
    void getEleventhLevelUpsetResultExchangedPoints() {

        int playerBRating = IRRELEVANT_RATING + ELEVENTH_LEVEL_IRRELEVANT_DIFFERENCE;
        boolean expectedResult = false;

        int exchangedPoints = RatingChart.getExchangedPoints(IRRELEVANT_RATING, playerBRating, expectedResult);

        Assertions.assertEquals (UPSET_RESULT_EXCHANGE_POINTS[10], exchangedPoints);

    }

}

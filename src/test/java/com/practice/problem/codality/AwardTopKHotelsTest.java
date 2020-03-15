package com.practice.problem.codality;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

class AwardTopKHotelsTest {
    private TopKHotelsFinder awardTopKHotels;

    @BeforeEach
    public void setUp() {
        awardTopKHotels = new TopKHotelsFinder();
    }

    @ParameterizedTest
    @MethodSource("topKHotelsProvider")
    void awardTopKHotels(String positiveKeywords, String negativeKeywords,
                         List<Integer> hotelIds,
                         List<String> reviews, int topHotels, List<Integer> expected) {
        List<Integer> actual = awardTopKHotels.awardTopKHotels(positiveKeywords, negativeKeywords, hotelIds, reviews, topHotels);

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> topKHotelsProvider() {
        return Stream.of(
                Arguments.of(
                        "breakfast beach citycenter location metro view staff price",
                        "not",
                        getHotelIds(),
                        getReviews(),
                        2,
                        getExpectedIds())
        );
    }

    private static List<Integer> getHotelIds() {
        List<Integer> hotelIds = new ArrayList<>();
        hotelIds.add(1);
        hotelIds.add(2);
        hotelIds.add(1);
        hotelIds.add(1);
        hotelIds.add(2);
        return hotelIds;
    }

    private static List<Integer> getExpectedIds() {
        List<Integer> hotelIds = new ArrayList<>();
        hotelIds.add(2);
        hotelIds.add(1);
        return hotelIds;
    }

    private static List<String> getReviews() {
        List<String> reviews = new ArrayList<>();
        reviews.add("This hotel has a nice view of the citycenter. The location is perfect.");
        reviews.add("The breakfast is ok. Regarding location, it is quite far from citycenter but price is cheap so it is worth.");
        reviews.add("Location is excellent, 5 minutes from citycenter. There is also a metro station very close to the hotel");
        reviews.add("They said I couldn't take my dog and there were other guests with dogs! That is not fair.");
        reviews.add("Very friendly staff and good cost-benefit ratio. Its location is a bit far from citycenter");
        return reviews;
    }
}
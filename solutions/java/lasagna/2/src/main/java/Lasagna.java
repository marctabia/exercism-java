public class Lasagna {
    private static final int EXPECTED_MIN_IN_OVEN = 40;
    private static final int PREP_TIME_MIN = 2;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return EXPECTED_MIN_IN_OVEN;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int min) {
        return expectedMinutesInOven() - min;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int prepTime) {
        return prepTime * PREP_TIME_MIN;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int prepTime, int min) {
        return preparationTimeInMinutes(prepTime) + min;
    }
}

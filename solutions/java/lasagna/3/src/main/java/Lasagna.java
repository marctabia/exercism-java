public class Lasagna {
    private static final int EXPECTED_MIN_IN_OVEN = 40;
    private static final int PREP_TIME_MIN = 2;
    
    public int expectedMinutesInOven() {
        return EXPECTED_MIN_IN_OVEN;
    }
    
    public int remainingMinutesInOven(int min) {
        return expectedMinutesInOven() - min;
    }
   
    public int preparationTimeInMinutes(int prepTime) {
        return prepTime * PREP_TIME_MIN;
    }
    
    public int totalTimeInMinutes(int prepTime, int min) {
        return preparationTimeInMinutes(prepTime) + min;
    }
}

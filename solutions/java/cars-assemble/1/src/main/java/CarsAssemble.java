public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double carsPerHour = speed * 221.0;
        if (speed >= 1 && speed <= 4) {
            return carsPerHour * 1.0;
        } else if (speed >= 5 && speed <= 8) {
            return carsPerHour * 0.90;
        } else if (speed == 9) {
            return carsPerHour * 0.80;
        } else {
            return carsPerHour * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        double itemsPerMin = speed * 221 / 60.0;
        if (speed >= 1 && speed <= 4) {
            return (int)(itemsPerMin * 1.0);
        } else if (speed >= 5 && speed <= 8) {
            return (int)(itemsPerMin * 0.90);
        } else if (speed == 9) {
            return (int)(itemsPerMin * 0.80);
        } else {
            return (int)(itemsPerMin * 0.77);
        }
    }
}

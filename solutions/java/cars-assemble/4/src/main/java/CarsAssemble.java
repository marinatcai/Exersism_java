public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 1.0;
        if (speed <= 4) {
            successRate = 1.0;
        }
        else if (speed > 4 && speed <= 8) {
            successRate = 0.9;
        }
        else if (speed == 9) {
            successRate = 0.8;
        }
        else if (speed == 10) {
            successRate = 0.77;
        }
        return successRate*speed*221;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}

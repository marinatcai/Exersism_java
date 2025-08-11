public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int successRate = 100;
        if (speed <= 4) {
            successRate = 100;
        }
        else if (speed > 4 && speed <= 8) {
            successRate = 90;
        }
        else if (speed == 9) {
            successRate = 80;
        }
        else if (speed == 10) {
            successRate = 77;
        }
        double productionLine = successRate*speed/100*221; // automatic casting (widening int to double)
        return productionLine;
    }

    public int workingItemsPerMinute(int speed) {
        int ItemsPerMinute = (int) productionRatePerHour(speed)/60; // manual casting (narrowing double to int)
        return ItemsPerMinute;
    }
}

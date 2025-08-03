public class Lasagna {
    int cookingTime = 40;
    int timeInOven = 10;
    int numberOfLayers = 1;

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return cookingTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int newValue) {
        timeInOven = newValue;
        return cookingTime-timeInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int newValue) {
        numberOfLayers = newValue;
        return numberOfLayers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int newValue1, int newValue2) {
        timeInOven = newValue2;
        int preparationTime = new Lasagna().preparationTimeInMinutes(newValue1);
        return preparationTime+timeInOven;
    }

}

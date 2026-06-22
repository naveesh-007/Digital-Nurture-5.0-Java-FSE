import forecast.ForecastCalculator;

public class Main {

    public static void main(String[] args) {

        double initialValue = 10000;
        double growthRate = 0.07;
        int years = 5;

        double futureValue = ForecastCalculator.calculateFutureValue(
                initialValue,
                growthRate,
                years);

        System.out.printf("Predicted value after %d years (Recursive): Rs.%.2f%n",
                years, futureValue);

        double[] memo = new double[years + 1];

        double memoizedValue = ForecastCalculator.calculateWithMemo(
                initialValue,
                growthRate,
                years,
                memo);

        System.out.printf("Predicted value after %d years (Memoized): Rs.%.2f%n", years, memoizedValue);
    }
}
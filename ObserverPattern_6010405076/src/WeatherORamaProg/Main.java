package WeatherORamaProg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
        StatisticsObserverDisplay statisticsObserverDisplay = new StatisticsObserverDisplay();

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(statisticsObserverDisplay);

        while (true){
            System.out.println("----------------------------");

            System.out.print("Temperature : ");
            float temp = Float.parseFloat(sc.nextLine());
            System.out.print("Humidity : ");
            float humid = Float.parseFloat(sc.nextLine());

            weatherData.measurementsChanged(temp, humid);
        }
    }
}

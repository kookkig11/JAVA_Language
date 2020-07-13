package WeatherORamaProg;

import javax.swing.*;
import java.awt.*;

public class StatisticsObserverDisplay implements Observer{
    private double previousTemperature, previousHumidity;
    private JFrame frame;
    private JTextArea area;

    double maxTemperature = -999999;
    double minTemperature = 999999;
    double maxHumidity = -999999;
    double minHumidity = 999999;


    public StatisticsObserverDisplay() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Statistics display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setText(" <<  Average Condition  >> \n\n");
    }


    @Override
    public void update(float temperature, float humidity) {
        if (previousTemperature == 0){
            previousTemperature = temperature;
        }
        if (previousHumidity == 0){
            previousHumidity = humidity;
        }
        // Measurer Temperature
        double averageTemperature = (previousTemperature + temperature) / 2;
        previousTemperature = averageTemperature;
        if (temperature > maxHumidity){
            maxTemperature = temperature;
        }
        if (temperature < minTemperature){
            minTemperature = temperature;
        }

        // Measurer Humidity
        double averageHumidity = (previousHumidity + humidity) / 2;
        previousHumidity = humidity;
        if (humidity > maxHumidity){
            maxHumidity = humidity;
        }
        if (humidity < minHumidity){
            minHumidity = humidity;
        }


        area.setText(" <<  Average Conditions  >> \n\n");

        area.append("  ** Temperature **\n");
        area.append("  Maximum: " + maxTemperature + "  /   Average: " + averageTemperature + "  /   Minimum: " + minTemperature + "\n");

        area.append("  ** Humidity **\n");
        area.append("  Maximum: " + maxHumidity + "   /   Average: " + averageHumidity + "  /   Minimum: " + minHumidity + "\n");

    }
}

package WeatherORamaProg;

import javax.swing.*;
import java.awt.*;

public class CurrentConditionsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    private JFrame frame;
    private JTextArea area;

    public CurrentConditionsDisplay() {
        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Current Condition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        area = new JTextArea(150, 150);
        frame.add(area);
        area.setText(" <<  Current Conditions  >> \n");

    }

        @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        area.append("  Current conditions: " + temperature + "C degrees and " + humidity + "% humidity \n");
    }

}

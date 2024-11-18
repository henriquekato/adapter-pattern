package exercise;

import java.util.Random;

// API|JAR|FRAMEWORK externo que não pode ser modificado (mas precisamos de suas funcionalidades)
public class OpenWeatherMapAPI {
    Random random = new Random();
    public int getTemperature(String city) { // temperature in Fahrenheit
        return random.nextInt(46) + 50;
    }
}

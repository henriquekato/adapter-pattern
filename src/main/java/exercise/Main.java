package exercise;

public class Main {
    public static void main(String[] args) {
        OpenWeatherMapAPI api = new OpenWeatherMapAPI();

        TemperatureProvider adapter = new OpenWeatherMapAdapter(api);

        System.out.println(adapter.getTemperature("santa catarina"));
        System.out.println(adapter.getTemperature("distrito federal"));
        System.out.println(adapter.getTemperature("são paulo"));
    }
}

package exercise_not_done;

public class Main {
    public static void main(String[] args) {
        OpenWeatherMapAPI api = new OpenWeatherMapAPI();

        System.out.println(api.getTemperature("santa catarina"));
        System.out.println(api.getTemperature("distrito federal"));
        System.out.println(api.getTemperature("são paulo"));
    }
}

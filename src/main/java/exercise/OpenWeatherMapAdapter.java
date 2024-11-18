package exercise;

class OpenWeatherMapAdapter implements TemperatureProvider {
    private final OpenWeatherMapAPI api;

    public OpenWeatherMapAdapter(OpenWeatherMapAPI api) {
        this.api = api;
    }

    @Override
    public int getTemperature(String city) {
        int temperature = api.getTemperature(city);
        return (temperature - 32) * 5/9;
    }
}

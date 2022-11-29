package WeatherStation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditions currentConditions = new CurrentConditions(weatherData);
//        Statistics statistics = new Statistics();

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
<<<<<<< HEAD

        double heatindex;
        double t = 78;
        double rh = 90;
        heatindex = 16.923
                + 1.85212 * 0.1 * t
                + 5.37941 * rh
                - 1.00254 * 0.1 * t * rh
                + 9.41695 * 0.001 * t*t
                + 7.28898 * 0.001 * rh*rh
                + 3.45372 * 0.0001 * t*t * rh
                - 8.14971 * 0.0001 * t * rh*rh
                + 1.02102 * 0.00001 * t*t * rh*rh
                - 3.8646 * 0.00001 * t*t*t
                + 2.91583 * 0.00001 * rh*rh*rh
                + 1.42721 * 0.000001 * t*t*t * rh
                + 1.97483 * 0.0000001 * t * rh*rh*rh
                - 2.18429 * 0.00000001 * t*t*t * rh*rh
                + 8.43296 * Math.pow(10, -10) * t*t * rh*rh*rh
                - 4.81975 * Math.pow(10, -11) * t*t*t * rh*rh*rh;
        System.out.println(heatindex);
=======
>>>>>>> origin/main
    }
}
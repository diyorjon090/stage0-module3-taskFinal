package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float c = temperatureCelsius, f;
        f = (c * 9) / 5 + 32;
        System.out.println(f);
    }
}

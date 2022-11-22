public class WindChill {
    public WindChill() {

    }

    public int WindChillEquation (double fahrenheit, double windSpeed) {
        return (int) (35.75 + (0.6215*fahrenheit) - (35.75*Math.pow(windSpeed, 0.16)) + (0.4275*fahrenheit*Math.pow(windSpeed, 0.16)));
    }
}


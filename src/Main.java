import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a temperature in Fahrenheit: ");
        int fahrenheit = scan.nextInt();
        System.out.print("Enter a wind speed in mi/hr: ");
        int windSpeed = scan.nextInt();

        WindChill windChillIdx = new WindChill();
        System.out.print(windChillIdx.WindChillEquation(fahrenheit, windSpeed));

        for (int i = 5; i <= 60; i += 5) {
            for (int j = 40; j >= -45; j -= 5) {
                System.out.print(windChillIdx.WindChillEquation(j, i) + " ");
            }
            System.out.println();
        }
    }
}

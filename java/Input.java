import java.util.Scanner;
public class Input {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Введите широту первой точки: ");
                double lat1 = input.nextDouble();
                System.out.print("Введите долготу первой точки: ");
                double lon1 = input.nextDouble();
                System.out.print("Введите широту второй точки: ");
                double lat2 = input.nextDouble();
                System.out.print("Введите долготу второй точки: ");
                double lon2 = input.nextDouble();
                System.out.print("Расстояние между двумя географическими координатами равно: " + distance_Between_LatLon(lat1, lon1, lat2, lon2) + " км\n");
        }
        public static double distance_Between_LatLon(double lat1, double lon1, double lat2, double lon2) {
                lat1 = Math.toRadians(lat1);
                lon1 = Math.toRadians(lon1);
                lat2 = Math.toRadians(lat2);
                lon2 = Math.toRadians(lon2);
                final double EARTH_RADIUS = 6371.01;
                return EARTH_RADIUS * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
        }
}
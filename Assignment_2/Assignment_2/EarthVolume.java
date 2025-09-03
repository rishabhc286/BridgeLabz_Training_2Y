public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * 0.621371;

        // Volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
}
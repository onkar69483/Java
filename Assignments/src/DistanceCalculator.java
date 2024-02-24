public class DistanceCalculator {
   
    public double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double calculateDistance(double distanceInKilometers) {
        return distanceInKilometers * 1000;
    }

 
    public double calculateDistance(double distanceInMeters, boolean toKilometers) {
        if (toKilometers) {
            return distanceInMeters / 1000;
        } else {
            return distanceInMeters;
        }
    }

    public static void main(String[] args) {
        DistanceCalculator calculator = new DistanceCalculator();

        // Calculate distance between two points
        double distance = calculator.calculateDistance(0, 0, 3, 4);
        System.out.println("Distance between (0,0) and (3,4): " + distance + " units");

        // Calculate distance in meters
        double distanceInKilometers = 5;
        double distanceInMeters = calculator.calculateDistance(distanceInKilometers);
        System.out.println("Distance in meters: " + distanceInMeters + " meters");

        // Calculate distance in kilometers
        double distanceInKilometersResult = calculator.calculateDistance(5000, true);
        System.out.println("Distance in kilometers: " + distanceInKilometersResult + " kilometers");
    }
}

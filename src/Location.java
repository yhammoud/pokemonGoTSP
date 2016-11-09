public class Location {

    int id;
    double longitude;
    double latitude;

    public Location(int id, double longitude, double latitude) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double distanceTo(Location location) {
        double longDist = Math.abs(getLongitude() - location.getLongitude());
        double latDist = Math.abs(getLatitude() - location.getLatitude());

        return Math.sqrt(Math.pow(longDist, 2) + Math.pow(latDist, 2));
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Longitude: " + getLongitude() + ", Latitude: " + getLatitude();
    }
}
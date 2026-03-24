package android.location.altitude;

public final class AltitudeConverter {
    public AltitudeConverter() {}
    public void addMslAltitudeToLocation(android.content.Context p0, android.location.Location p1) throws java.io.IOException {}
    @android.annotation.FlaggedApi("android.location.flags.geoid_heights_via_altitude_hal")
    public boolean tryAddMslAltitudeToLocation(android.location.Location p0) { return false; }
    @android.annotation.NonNull
    public android.frameworks.location.altitude.GetGeoidHeightResponse getGeoidHeight(android.content.Context p0, android.frameworks.location.altitude.GetGeoidHeightRequest p1) throws java.io.IOException { return null; }
}

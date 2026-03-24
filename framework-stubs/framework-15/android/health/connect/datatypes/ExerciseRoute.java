package android.health.connect.datatypes;

public final class ExerciseRoute implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.datatypes.ExerciseRoute> CREATOR = null;
    public ExerciseRoute(java.util.List<android.health.connect.datatypes.ExerciseRoute.Location> p0) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.health.connect.datatypes.ExerciseRoute.Location> getRouteLocations() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Location implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.health.connect.datatypes.ExerciseRoute.Location> CREATOR = null;
        Location() {}
        public int describeContents() { return 0; }
        @android.annotation.Nullable
        public android.health.connect.datatypes.units.Length getAltitude() { return null; }
        @android.annotation.Nullable
        public android.health.connect.datatypes.units.Length getHorizontalAccuracy() { return null; }
        public double getLatitude() { return 0.0; }
        public double getLongitude() { return 0.0; }
        @android.annotation.NonNull
        public java.time.Instant getTime() { return null; }
        @android.annotation.Nullable
        public android.health.connect.datatypes.units.Length getVerticalAccuracy() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.time.Instant p0, double p1, double p2) {}
            @android.annotation.NonNull
            public android.health.connect.datatypes.ExerciseRoute.Location build() { return null; }
            @android.annotation.NonNull
            public android.health.connect.datatypes.ExerciseRoute.Location.Builder setAltitude(android.health.connect.datatypes.units.Length p0) { return null; }
            @android.annotation.NonNull
            public android.health.connect.datatypes.ExerciseRoute.Location.Builder setHorizontalAccuracy(android.health.connect.datatypes.units.Length p0) { return null; }
            @android.annotation.NonNull
            public android.health.connect.datatypes.ExerciseRoute.Location.Builder setVerticalAccuracy(android.health.connect.datatypes.units.Length p0) { return null; }
        }
    }
}

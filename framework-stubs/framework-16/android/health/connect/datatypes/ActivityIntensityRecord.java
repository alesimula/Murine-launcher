package android.health.connect.datatypes;

@android.annotation.FlaggedApi("com.android.healthfitness.flags.activity_intensity")
public final class ActivityIntensityRecord extends android.health.connect.datatypes.IntervalRecord {
    public static final int ACTIVITY_INTENSITY_TYPE_MODERATE = 0;
    public static final int ACTIVITY_INTENSITY_TYPE_VIGOROUS = 1;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.time.Duration> DURATION_TOTAL = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.lang.Long> INTENSITY_MINUTES_TOTAL = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.time.Duration> MODERATE_DURATION_TOTAL = null;
    @android.annotation.NonNull
    public static final android.health.connect.datatypes.AggregationType<java.time.Duration> VIGOROUS_DURATION_TOTAL = null;
    ActivityIntensityRecord() { super(); }
    public int getActivityIntensityType() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, java.time.Instant p2, int p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActivityIntensityRecord build() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActivityIntensityRecord.Builder setEndZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.ActivityIntensityRecord.Builder setStartZoneOffset(java.time.ZoneOffset p0) { return null; }
    }
}

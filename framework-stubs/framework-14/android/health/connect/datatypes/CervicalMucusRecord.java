package android.health.connect.datatypes;

public final class CervicalMucusRecord extends android.health.connect.datatypes.InstantRecord {
    CervicalMucusRecord() { super(); }
    public int getSensation() { return 0; }
    public int getAppearance() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class CervicalMucusAppearance {
        public static final int APPEARANCE_CREAMY = 3;
        public static final int APPEARANCE_DRY = 1;
        public static final int APPEARANCE_EGG_WHITE = 5;
        public static final int APPEARANCE_STICKY = 2;
        public static final int APPEARANCE_UNKNOWN = 0;
        public static final int APPEARANCE_UNUSUAL = 6;
        public static final int APPEARANCE_WATERY = 4;
        CervicalMucusAppearance() {}
    }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2, int p3) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.CervicalMucusRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.CervicalMucusRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.CervicalMucusRecord build() { return null; }
    }

    public static final class CervicalMucusSensation {
        public static final int SENSATION_HEAVY = 3;
        public static final int SENSATION_LIGHT = 1;
        public static final int SENSATION_MEDIUM = 2;
        public static final int SENSATION_UNKNOWN = 0;
        CervicalMucusSensation() {}
    }
}

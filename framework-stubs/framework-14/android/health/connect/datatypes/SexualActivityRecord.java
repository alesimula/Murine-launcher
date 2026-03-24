package android.health.connect.datatypes;

public final class SexualActivityRecord extends android.health.connect.datatypes.InstantRecord {
    SexualActivityRecord() { super(); }
    public int getProtectionUsed() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder(android.health.connect.datatypes.Metadata p0, java.time.Instant p1, int p2) {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.SexualActivityRecord.Builder setZoneOffset(java.time.ZoneOffset p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SexualActivityRecord.Builder clearZoneOffset() { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.SexualActivityRecord build() { return null; }
    }

    public static final class SexualActivityProtectionUsed {
        public static final int PROTECTION_USED_PROTECTED = 1;
        public static final int PROTECTION_USED_UNKNOWN = 0;
        public static final int PROTECTION_USED_UNPROTECTED = 2;
        SexualActivityProtectionUsed() {}
    }
}

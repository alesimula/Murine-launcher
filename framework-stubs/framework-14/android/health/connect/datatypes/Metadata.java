package android.health.connect.datatypes;

public final class Metadata {
    public static final int RECORDING_METHOD_ACTIVELY_RECORDED = 1;
    public static final int RECORDING_METHOD_AUTOMATICALLY_RECORDED = 2;
    public static final int RECORDING_METHOD_MANUAL_ENTRY = 3;
    public static final int RECORDING_METHOD_UNKNOWN = 0;
    Metadata() {}
    @android.annotation.Nullable
    public java.lang.String getClientRecordId() { return null; }
    public long getClientRecordVersion() { return 0L; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.DataOrigin getDataOrigin() { return null; }
    @android.annotation.NonNull
    public java.lang.String getId() { return null; }
    public int getRecordingMethod() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getLastModifiedTime() { return null; }
    @android.annotation.NonNull
    public android.health.connect.datatypes.Device getDevice() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setDevice(android.health.connect.datatypes.Device p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setDataOrigin(android.health.connect.datatypes.DataOrigin p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setLastModifiedTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setClientRecordId(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setClientRecordVersion(long p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata.Builder setRecordingMethod(int p0) { return null; }
        @android.annotation.NonNull
        public android.health.connect.datatypes.Metadata build() { return null; }
    }
}

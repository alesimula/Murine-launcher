package android.health.connect.datatypes;

public abstract class InstantRecord extends android.health.connect.datatypes.Record {
    InstantRecord() { super(); }
    @android.annotation.NonNull
    public java.time.Instant getTime() { return null; }
    @android.annotation.NonNull
    public java.time.ZoneOffset getZoneOffset() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}

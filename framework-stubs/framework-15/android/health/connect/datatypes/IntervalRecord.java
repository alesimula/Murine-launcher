package android.health.connect.datatypes;

public abstract class IntervalRecord extends android.health.connect.datatypes.Record {
    IntervalRecord() { super(); }
    @android.annotation.NonNull
    public java.time.Instant getEndTime() { return null; }
    @android.annotation.NonNull
    public java.time.ZoneOffset getEndZoneOffset() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getStartTime() { return null; }
    @android.annotation.NonNull
    public java.time.ZoneOffset getStartZoneOffset() { return null; }
}

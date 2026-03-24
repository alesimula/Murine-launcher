package android.health.connect.datatypes;

public abstract class Record {
    Record() {}
    @android.annotation.NonNull
    public android.health.connect.datatypes.Metadata getMetadata() { return null; }
    public int getRecordType() { return 0; }
}

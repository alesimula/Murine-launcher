package android.health.connect;

public abstract class ReadRecordsRequest<T extends android.health.connect.datatypes.Record> {
    ReadRecordsRequest() {}
    @android.annotation.NonNull
    public java.lang.Class<T> getRecordType() { return null; }
}

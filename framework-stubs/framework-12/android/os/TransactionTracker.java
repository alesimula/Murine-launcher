package android.os;

public class TransactionTracker {
    private java.util.Map<java.lang.String, java.lang.Long> mTraces;
    private void resetTraces() {}
    TransactionTracker() {}
    public void addTrace(java.lang.Throwable p0) {}
    public void writeTracesToFile(android.os.ParcelFileDescriptor p0) {}
    public void clearTraces() {}
}

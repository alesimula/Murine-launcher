package android.net;

public interface TransportInfo {
    @android.annotation.NonNull
    default public android.net.TransportInfo makeCopy(long p0) { return null; }
    default public long getApplicableRedactions() { return 0L; }
}

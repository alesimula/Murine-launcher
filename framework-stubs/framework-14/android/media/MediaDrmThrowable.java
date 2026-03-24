package android.media;

public interface MediaDrmThrowable {
    default public int getVendorError() { return 0; }
    default public int getOemError() { return 0; }
    default public int getErrorContext() { return 0; }
}

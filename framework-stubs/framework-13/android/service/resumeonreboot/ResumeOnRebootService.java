package android.service.resumeonreboot;

@android.annotation.SystemApi
public abstract class ResumeOnRebootService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.resumeonreboot.ResumeOnRebootService";
    public static final java.lang.String UNWRAPPED_BLOB_KEY = "unrwapped_blob_key";
    public static final java.lang.String WRAPPED_BLOB_KEY = "wrapped_blob_key";
    public static final java.lang.String EXCEPTION_KEY = "exception_key";
    public ResumeOnRebootService() { super(); }
    public abstract byte[] onWrap(byte[] p0, long p1) throws java.io.IOException;
    public abstract byte[] onUnwrap(byte[] p0) throws java.io.IOException;
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
}

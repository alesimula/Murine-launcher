package android.service.carrier;

@android.annotation.SystemApi
public abstract class ApnService extends android.app.Service {
    private static final java.lang.String LOG_TAG = "ApnService";
    private final com.android.internal.telephony.IApnSourceService.Stub mBinder = null;
    public ApnService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.util.List<android.content.ContentValues> onRestoreApns(int p0);
}

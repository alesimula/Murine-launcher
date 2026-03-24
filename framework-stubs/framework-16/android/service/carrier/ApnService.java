package android.service.carrier;

@android.annotation.SystemApi
public abstract class ApnService extends android.app.Service {
    public ApnService() { super(); }
    @android.annotation.NonNull
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @android.annotation.NonNull
    public abstract java.util.List<android.content.ContentValues> onRestoreApns(int p0);
}

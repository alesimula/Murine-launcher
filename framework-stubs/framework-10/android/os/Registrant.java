package android.os;

public class Registrant {
    java.lang.ref.WeakReference refH;
    int what;
    java.lang.Object userObj;
    @android.annotation.UnsupportedAppUsage
    public Registrant(android.os.Handler p0, int p1, java.lang.Object p2) {}
    @android.annotation.UnsupportedAppUsage
    public void clear() {}
    @android.annotation.UnsupportedAppUsage
    public void notifyRegistrant() {}
    @android.annotation.UnsupportedAppUsage
    public void notifyResult(java.lang.Object p0) {}
    public void notifyException(java.lang.Throwable p0) {}
    @android.annotation.UnsupportedAppUsage
    public void notifyRegistrant(android.os.AsyncResult p0) {}
    void internalNotifyRegistrant(java.lang.Object p0, java.lang.Throwable p1) {}
    @android.annotation.UnsupportedAppUsage
    public android.os.Message messageForRegistrant() { return null; }
    public android.os.Handler getHandler() { return null; }
}

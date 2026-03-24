package android.os;

public class RegistrantList {
    java.util.ArrayList registrants;
    public RegistrantList() {}
    @android.annotation.UnsupportedAppUsage
    public synchronized void add(android.os.Handler p0, int p1, java.lang.Object p2) {}
    @android.annotation.UnsupportedAppUsage
    public synchronized void addUnique(android.os.Handler p0, int p1, java.lang.Object p2) {}
    @android.annotation.UnsupportedAppUsage
    public synchronized void add(android.os.Registrant p0) {}
    @android.annotation.UnsupportedAppUsage
    public synchronized void removeCleared() {}
    @android.annotation.UnsupportedAppUsage
    public synchronized int size() { return 0; }
    public synchronized java.lang.Object get(int p0) { return null; }
    private synchronized void internalNotifyRegistrants(java.lang.Object p0, java.lang.Throwable p1) {}
    @android.annotation.UnsupportedAppUsage
    public void notifyRegistrants() {}
    public void notifyException(java.lang.Throwable p0) {}
    @android.annotation.UnsupportedAppUsage
    public void notifyResult(java.lang.Object p0) {}
    @android.annotation.UnsupportedAppUsage
    public void notifyRegistrants(android.os.AsyncResult p0) {}
    @android.annotation.UnsupportedAppUsage
    public synchronized void remove(android.os.Handler p0) {}
}

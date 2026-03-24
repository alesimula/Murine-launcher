package android.telephony.mbms.vendor;

@android.annotation.SystemApi
public class MbmsGroupCallServiceBase extends android.app.Service {
    private final android.os.IBinder mInterface = null;
    public MbmsGroupCallServiceBase() { super(); }
    public int initialize(android.telephony.mbms.MbmsGroupCallSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
    public int startGroupCall(int p0, long p1, java.util.List<java.lang.Integer> p2, java.util.List<java.lang.Integer> p3, android.telephony.mbms.GroupCallCallback p4) { return 0; }
    public void stopGroupCall(int p0, long p1) {}
    public void updateGroupCall(int p0, long p1, java.util.List<java.lang.Integer> p2, java.util.List<java.lang.Integer> p3) {}
    public void dispose(int p0) throws android.os.RemoteException {}
    public void onAppCallbackDied(int p0, int p1) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
}

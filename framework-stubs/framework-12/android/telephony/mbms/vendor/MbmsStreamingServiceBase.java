package android.telephony.mbms.vendor;

@android.annotation.SystemApi
public class MbmsStreamingServiceBase extends android.telephony.mbms.vendor.IMbmsStreamingService.Stub {
    public MbmsStreamingServiceBase() { super(); }
    public int initialize(android.telephony.mbms.MbmsStreamingSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
    public final int initialize(android.telephony.mbms.IMbmsStreamingSessionCallback p0, int p1) throws android.os.RemoteException { return 0; }
    public int requestUpdateStreamingServices(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException { return 0; }
    public int startStreaming(int p0, java.lang.String p1, android.telephony.mbms.StreamingServiceCallback p2) throws android.os.RemoteException { return 0; }
    public int startStreaming(int p0, java.lang.String p1, android.telephony.mbms.IStreamingServiceCallback p2) throws android.os.RemoteException { return 0; }
    public android.net.Uri getPlaybackUri(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
    public void stopStreaming(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void dispose(int p0) throws android.os.RemoteException {}
    public void onAppCallbackDied(int p0, int p1) {}
    @android.annotation.SystemApi
    public android.os.IBinder asBinder() { return null; }
    @android.annotation.SystemApi
    public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
}

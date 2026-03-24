package android.telephony.mbms;

public class InternalStreamingServiceCallback extends android.telephony.mbms.IStreamingServiceCallback.Stub {
    public InternalStreamingServiceCallback(android.telephony.mbms.StreamingServiceCallback p0, java.util.concurrent.Executor p1) { super(); }
    public void onError(int p0, java.lang.String p1) throws android.os.RemoteException {}
    public void onStreamStateUpdated(int p0, int p1) throws android.os.RemoteException {}
    public void onMediaDescriptionUpdated() throws android.os.RemoteException {}
    public void onBroadcastSignalStrengthUpdated(int p0) throws android.os.RemoteException {}
    public void onStreamMethodUpdated(int p0) throws android.os.RemoteException {}
    public void stop() {}
}

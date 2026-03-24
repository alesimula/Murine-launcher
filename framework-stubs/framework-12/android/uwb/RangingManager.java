package android.uwb;

public class RangingManager extends android.uwb.IUwbRangingCallbacks.Stub {
    private static final java.lang.String TAG = "Uwb.RangingManager";
    private final android.uwb.IUwbAdapter mAdapter = null;
    private final java.util.Hashtable<android.uwb.SessionHandle, android.uwb.RangingSession> mRangingSessionTable = null;
    private int mNextSessionId;
    public RangingManager(android.uwb.IUwbAdapter p0) { super(); }
    public android.os.CancellationSignal openSession(android.content.AttributionSource p0, android.os.PersistableBundle p1, java.util.concurrent.Executor p2, android.uwb.RangingSession.Callback p3) { return null; }
    private boolean hasSession(android.uwb.SessionHandle p0) { return false; }
    public void onRangingOpened(android.uwb.SessionHandle p0) {}
    public void onRangingOpenFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) {}
    public void onRangingReconfigured(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) {}
    public void onRangingReconfigureFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) {}
    public void onRangingStarted(android.uwb.SessionHandle p0, android.os.PersistableBundle p1) {}
    public void onRangingStartFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) {}
    public void onRangingStopped(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) {}
    public void onRangingStopFailed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) {}
    public void onRangingClosed(android.uwb.SessionHandle p0, int p1, android.os.PersistableBundle p2) {}
    public void onRangingResult(android.uwb.SessionHandle p0, android.uwb.RangingReport p1) {}
    private static int convertToReason(int p0) { return 0; }
}

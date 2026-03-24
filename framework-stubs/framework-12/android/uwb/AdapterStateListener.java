package android.uwb;

public class AdapterStateListener extends android.uwb.IUwbAdapterStateCallbacks.Stub {
    private static final java.lang.String TAG = "Uwb.StateListener";
    private final android.uwb.IUwbAdapter mAdapter = null;
    private boolean mIsRegistered;
    private final java.util.Map<android.uwb.UwbManager.AdapterStateCallback, java.util.concurrent.Executor> mCallbackMap = null;
    private int mAdapterStateChangeReason;
    private int mAdapterState;
    public AdapterStateListener(android.uwb.IUwbAdapter p0) { super(); }
    public void register(java.util.concurrent.Executor p0, android.uwb.UwbManager.AdapterStateCallback p1) {}
    public void unregister(android.uwb.UwbManager.AdapterStateCallback p0) {}
    public void setEnabled(boolean p0) {}
    public int getAdapterState() { return 0; }
    private void sendCurrentState(android.uwb.UwbManager.AdapterStateCallback p0) {}
    public void onAdapterStateChanged(int p0, int p1) {}
    private static int convertToStateChangedReason(int p0) { return 0; }
    private static int convertToState(int p0) { return 0; }
}

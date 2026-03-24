package android.nfc;

public class NfcControllerAlwaysOnListener extends android.nfc.INfcControllerAlwaysOnListener.Stub {
    private static final java.lang.String TAG = null;
    private final android.nfc.INfcAdapter mAdapter = null;
    private final java.util.Map<android.nfc.NfcAdapter.ControllerAlwaysOnListener, java.util.concurrent.Executor> mListenerMap = null;
    private boolean mCurrentState;
    private boolean mIsRegistered;
    public NfcControllerAlwaysOnListener(android.nfc.INfcAdapter p0) { super(); }
    public void register(java.util.concurrent.Executor p0, android.nfc.NfcAdapter.ControllerAlwaysOnListener p1) {}
    public void unregister(android.nfc.NfcAdapter.ControllerAlwaysOnListener p0) {}
    private void sendCurrentState(android.nfc.NfcAdapter.ControllerAlwaysOnListener p0) {}
    public void onControllerAlwaysOnChanged(boolean p0) {}
}

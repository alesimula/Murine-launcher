package android.security;

public class GenerateRkpKey {
    private static final java.lang.String TAG = "GenerateRkpKey";
    private static final int NOTIFY_EMPTY = 0;
    private static final int NOTIFY_KEY_GENERATED = 1;
    private static final int TIMEOUT_MS = 1000;
    private android.security.IGenerateRkpKeyService mBinder;
    private android.content.Context mContext;
    private java.util.concurrent.CountDownLatch mCountDownLatch;
    private android.content.ServiceConnection mConnection;
    public GenerateRkpKey(android.content.Context p0) {}
    private void bindAndSendCommand(int p0, int p1) throws android.os.RemoteException {}
    public void notifyEmpty(int p0) throws android.os.RemoteException {}
    public void notifyKeyGenerated(int p0) throws android.os.RemoteException {}
}

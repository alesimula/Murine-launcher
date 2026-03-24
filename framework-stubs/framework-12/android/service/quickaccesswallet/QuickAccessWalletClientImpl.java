package android.service.quickaccesswallet;

public class QuickAccessWalletClientImpl implements android.service.quickaccesswallet.QuickAccessWalletClient, android.content.ServiceConnection {
    private static final java.lang.String TAG = "QAWalletSClient";
    public static final java.lang.String SETTING_KEY = "lockscreen_show_wallet";
    private final android.os.Handler mHandler = null;
    private final android.content.Context mContext = null;
    private final java.util.Queue<android.service.quickaccesswallet.QuickAccessWalletClientImpl.ApiCaller> mRequestQueue = null;
    private final java.util.Map<android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener, java.lang.String> mEventListeners = null;
    private boolean mIsConnected;
    private static final long SERVICE_CONNECTION_TIMEOUT_MS = 60000L;
    private android.service.quickaccesswallet.IQuickAccessWalletService mService;
    private final android.service.quickaccesswallet.QuickAccessWalletServiceInfo mServiceInfo = null;
    private static final int MSG_TIMEOUT_SERVICE = 5;
    QuickAccessWalletClientImpl(android.content.Context p0) {}
    public boolean isWalletServiceAvailable() { return false; }
    public boolean isWalletFeatureAvailable() { return false; }
    public boolean isWalletFeatureAvailableWhenDeviceLocked() { return false; }
    public void getWalletCards(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.QuickAccessWalletClient.OnWalletCardsRetrievedCallback p1) {}
    public void getWalletCards(java.util.concurrent.Executor p0, android.service.quickaccesswallet.GetWalletCardsRequest p1, android.service.quickaccesswallet.QuickAccessWalletClient.OnWalletCardsRetrievedCallback p2) {}
    public void selectWalletCard(android.service.quickaccesswallet.SelectWalletCardRequest p0) {}
    public void notifyWalletDismissed() {}
    public void addWalletServiceEventListener(android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p0) {}
    public void addWalletServiceEventListener(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p1) {}
    public void removeWalletServiceEventListener(android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p0) {}
    public void close() throws java.io.IOException {}
    public void disconnect() {}
    public android.content.Intent createWalletIntent() { return null; }
    public android.content.Intent createWalletSettingsIntent() { return null; }
    private android.content.Intent createIntent(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static java.lang.String queryActivityForAction(android.content.pm.PackageManager p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static boolean isActivityEnabled(android.content.pm.PackageManager p0, android.content.ComponentName p1) { return false; }
    public android.graphics.drawable.Drawable getLogo() { return null; }
    public android.graphics.drawable.Drawable getTileIcon() { return null; }
    public java.lang.CharSequence getServiceLabel() { return null; }
    public java.lang.CharSequence getShortcutShortLabel() { return null; }
    public java.lang.CharSequence getShortcutLongLabel() { return null; }
    private void connect() {}
    private void connectInternal() {}
    private void onConnectedInternal(android.service.quickaccesswallet.IQuickAccessWalletService p0) {}
    private void resetServiceConnectionTimeout() {}
    private void disconnectInternal(boolean p0) {}
    private void executeApiCall(android.service.quickaccesswallet.QuickAccessWalletClientImpl.ApiCaller p0) {}
    private void executeInternal(android.service.quickaccesswallet.QuickAccessWalletClientImpl.ApiCaller p0) {}
    private void performApiCallInternal(android.service.quickaccesswallet.QuickAccessWalletClientImpl.ApiCaller p0, android.service.quickaccesswallet.IQuickAccessWalletService p1) {}
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    public void onBindingDied(android.content.ComponentName p0) {}
    public void onNullBinding(android.content.ComponentName p0) {}
    private boolean checkSecureSetting(java.lang.String p0) { return false; }
    private boolean checkUserSetupComplete() { return false; }

    private static abstract class ApiCaller {
        private final java.lang.String mDesc = null;
        private ApiCaller(java.lang.String p0) {}
        abstract void performApiCall(android.service.quickaccesswallet.IQuickAccessWalletService p0) throws android.os.RemoteException;
        void onApiError() {}
    }

    private static class BaseCallbacks extends android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks.Stub {
        private BaseCallbacks() { super(); }
        public void onGetWalletCardsSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0) {}
        public void onGetWalletCardsFailure(android.service.quickaccesswallet.GetWalletCardsError p0) {}
        public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) {}
    }
}

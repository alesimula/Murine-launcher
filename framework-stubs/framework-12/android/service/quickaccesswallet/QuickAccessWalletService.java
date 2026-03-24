package android.service.quickaccesswallet;

public abstract class QuickAccessWalletService extends android.app.Service {
    private static final java.lang.String TAG = "QAWalletService";
    public static final java.lang.String SERVICE_INTERFACE = "android.service.quickaccesswallet.QuickAccessWalletService";
    public static final java.lang.String ACTION_VIEW_WALLET = "android.service.quickaccesswallet.action.VIEW_WALLET";
    public static final java.lang.String ACTION_VIEW_WALLET_SETTINGS = "android.service.quickaccesswallet.action.VIEW_WALLET_SETTINGS";
    public static final java.lang.String SERVICE_META_DATA = "android.quickaccesswallet";
    public static final java.lang.String TILE_SERVICE_META_DATA = "android.quickaccesswallet.tile";
    private final android.os.Handler mHandler = null;
    private java.lang.String mEventListenerId;
    private android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks mEventListener;
    private final android.service.quickaccesswallet.IQuickAccessWalletService mInterface = null;
    public QuickAccessWalletService() { super(); }
    private void onWalletCardsRequestedInternal(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) {}
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onWalletCardsRequested(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.GetWalletCardsCallback p1);
    public abstract void onWalletCardSelected(android.service.quickaccesswallet.SelectWalletCardRequest p0);
    public abstract void onWalletDismissed();
    public final void sendWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) {}
    private void sendWalletServiceEventInternal(android.service.quickaccesswallet.WalletServiceEvent p0) {}
    private void registerDismissWalletListenerInternal(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0, android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks p1) {}
    private void unregisterDismissWalletListenerInternal(android.service.quickaccesswallet.WalletServiceEventListenerRequest p0) {}
}

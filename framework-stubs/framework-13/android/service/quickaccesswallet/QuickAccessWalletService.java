package android.service.quickaccesswallet;

public abstract class QuickAccessWalletService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.quickaccesswallet.QuickAccessWalletService";
    public static final java.lang.String ACTION_VIEW_WALLET = "android.service.quickaccesswallet.action.VIEW_WALLET";
    public static final java.lang.String ACTION_VIEW_WALLET_SETTINGS = "android.service.quickaccesswallet.action.VIEW_WALLET_SETTINGS";
    public static final java.lang.String SERVICE_META_DATA = "android.quickaccesswallet";
    public static final java.lang.String TILE_SERVICE_META_DATA = "android.quickaccesswallet.tile";
    public QuickAccessWalletService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onWalletCardsRequested(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.GetWalletCardsCallback p1);
    public abstract void onWalletCardSelected(android.service.quickaccesswallet.SelectWalletCardRequest p0);
    public abstract void onWalletDismissed();
    public final void sendWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) {}
    public android.app.PendingIntent getTargetActivityPendingIntent() { return null; }
}

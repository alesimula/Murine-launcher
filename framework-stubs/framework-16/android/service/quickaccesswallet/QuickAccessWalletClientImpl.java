package android.service.quickaccesswallet;

public class QuickAccessWalletClientImpl implements android.service.quickaccesswallet.QuickAccessWalletClient, android.content.ServiceConnection {
    public static final java.lang.String SETTING_KEY = "lockscreen_show_wallet";
    QuickAccessWalletClientImpl(android.content.Context p0, java.util.concurrent.Executor p1) {}
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
    @android.annotation.Nullable
    public android.content.Intent createWalletIntent() { return null; }
    public void getWalletPendingIntent(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.WalletPendingIntentCallback p1) {}
    public void getGestureTargetActivityPendingIntent(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.GesturePendingIntentCallback p1) {}
    @android.annotation.Nullable
    public android.content.Intent createWalletSettingsIntent() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getLogo() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getTileIcon() { return null; }
    @android.annotation.Nullable
    public android.os.UserHandle getUser() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getServiceLabel() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getShortcutShortLabel() { return null; }
    public java.lang.CharSequence getShortcutLongLabel() { return null; }
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    public void onBindingDied(android.content.ComponentName p0) {}
    public void onNullBinding(android.content.ComponentName p0) {}

    private static abstract class ApiCaller {
        abstract void performApiCall(android.service.quickaccesswallet.IQuickAccessWalletService p0) throws android.os.RemoteException;
        void onApiError() {}
    }

    private static class BaseCallbacks extends android.service.quickaccesswallet.IQuickAccessWalletServiceCallbacks.Stub {
        public void onGetWalletCardsSuccess(android.service.quickaccesswallet.GetWalletCardsResponse p0) {}
        public void onGetWalletCardsFailure(android.service.quickaccesswallet.GetWalletCardsError p0) {}
        public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0) {}
        public void onTargetActivityPendingIntentReceived(android.app.PendingIntent p0) {}
        public void onGestureTargetActivityPendingIntentReceived(android.app.PendingIntent p0) {}
    }
}

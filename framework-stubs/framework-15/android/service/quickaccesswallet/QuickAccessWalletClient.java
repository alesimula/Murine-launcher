package android.service.quickaccesswallet;

public interface QuickAccessWalletClient extends java.io.Closeable {
    @android.annotation.NonNull
    public static android.service.quickaccesswallet.QuickAccessWalletClient create(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    public static android.service.quickaccesswallet.QuickAccessWalletClient create(android.content.Context p0, java.util.concurrent.Executor p1) { return null; }
    public boolean isWalletServiceAvailable();
    public boolean isWalletFeatureAvailable();
    public boolean isWalletFeatureAvailableWhenDeviceLocked();
    public void getWalletCards(android.service.quickaccesswallet.GetWalletCardsRequest p0, android.service.quickaccesswallet.QuickAccessWalletClient.OnWalletCardsRetrievedCallback p1);
    public void getWalletCards(java.util.concurrent.Executor p0, android.service.quickaccesswallet.GetWalletCardsRequest p1, android.service.quickaccesswallet.QuickAccessWalletClient.OnWalletCardsRetrievedCallback p2);
    public void selectWalletCard(android.service.quickaccesswallet.SelectWalletCardRequest p0);
    public void notifyWalletDismissed();
    public void addWalletServiceEventListener(android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p0);
    public void addWalletServiceEventListener(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p1);
    public void removeWalletServiceEventListener(android.service.quickaccesswallet.QuickAccessWalletClient.WalletServiceEventListener p0);
    public void disconnect();
    public void getWalletPendingIntent(java.util.concurrent.Executor p0, android.service.quickaccesswallet.QuickAccessWalletClient.WalletPendingIntentCallback p1);
    @android.annotation.Nullable
    public android.content.Intent createWalletIntent();
    @android.annotation.Nullable
    public android.content.Intent createWalletSettingsIntent();
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getLogo();
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getTileIcon();
    @android.annotation.Nullable
    public java.lang.CharSequence getServiceLabel();
    @android.annotation.Nullable
    public java.lang.CharSequence getShortcutShortLabel();
    @android.annotation.Nullable
    public java.lang.CharSequence getShortcutLongLabel();

    public static interface OnWalletCardsRetrievedCallback {
        public void onWalletCardsRetrieved(android.service.quickaccesswallet.GetWalletCardsResponse p0);
        public void onWalletCardRetrievalError(android.service.quickaccesswallet.GetWalletCardsError p0);
    }

    public static interface WalletPendingIntentCallback {
        public void onWalletPendingIntentRetrieved(android.app.PendingIntent p0);
    }

    public static interface WalletServiceEventListener {
        public void onWalletServiceEvent(android.service.quickaccesswallet.WalletServiceEvent p0);
    }
}

package android.service.quickaccesswallet;

class QuickAccessWalletServiceInfo {
    private static final java.lang.String TAG = "QAWalletSInfo";
    private static final java.lang.String TAG_WALLET_SERVICE = "quickaccesswallet-service";
    private final android.content.pm.ServiceInfo mServiceInfo = null;
    private final android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata mServiceMetadata = null;
    private QuickAccessWalletServiceInfo(android.content.pm.ServiceInfo p0, android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata p1) {}
    static android.service.quickaccesswallet.QuickAccessWalletServiceInfo tryCreate(android.content.Context p0) { return null; }
    private static android.content.ComponentName getDefaultPaymentApp(android.content.Context p0) { return null; }
    private static android.content.pm.ServiceInfo getWalletServiceInfo(android.content.Context p0, java.lang.String p1) { return null; }
    private static android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata parseServiceMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    android.content.ComponentName getComponentName() { return null; }
    java.lang.String getWalletActivity() { return null; }
    java.lang.String getSettingsActivity() { return null; }
    android.graphics.drawable.Drawable getWalletLogo(android.content.Context p0) { return null; }
    java.lang.CharSequence getShortcutShortLabel(android.content.Context p0) { return null; }
    java.lang.CharSequence getShortcutLongLabel(android.content.Context p0) { return null; }
    java.lang.CharSequence getServiceLabel(android.content.Context p0) { return null; }

    private static class ServiceMetadata {
        private final java.lang.String mSettingsActivity = null;
        private final java.lang.String mTargetActivity = null;
        private final java.lang.CharSequence mShortcutShortLabel = null;
        private final java.lang.CharSequence mShortcutLongLabel = null;
        private static android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata empty() { return null; }
        private ServiceMetadata(java.lang.String p0, java.lang.String p1, java.lang.CharSequence p2, java.lang.CharSequence p3) {}
    }
}

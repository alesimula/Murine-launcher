package android.service.quickaccesswallet;

class QuickAccessWalletServiceInfo {
    @android.annotation.Nullable
    static android.service.quickaccesswallet.QuickAccessWalletServiceInfo tryCreate(android.content.Context p0) { return null; }
    static android.service.quickaccesswallet.QuickAccessWalletServiceInfo.ServiceMetadata parseServiceMetadata(android.content.Context p0, android.content.pm.ServiceInfo p1) { return null; }
    @android.annotation.NonNull
    android.content.ComponentName getComponentName() { return null; }
    @android.annotation.Nullable
    java.lang.String getWalletActivity() { return null; }
    @android.annotation.Nullable
    java.lang.String getSettingsActivity() { return null; }
    @android.annotation.NonNull
    android.graphics.drawable.Drawable getWalletLogo(android.content.Context p0) { return null; }
    @android.annotation.Nullable
    android.graphics.drawable.Drawable getTileIcon() { return null; }
    @android.annotation.NonNull
    java.lang.CharSequence getShortcutShortLabel(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    java.lang.CharSequence getShortcutLongLabel(android.content.Context p0) { return null; }
    @android.annotation.NonNull
    java.lang.CharSequence getServiceLabel(android.content.Context p0) { return null; }

    static class ServiceMetadata {
    }

    private static class TileServiceMetadata {
    }
}

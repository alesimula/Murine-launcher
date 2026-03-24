package android.util;

public class IconDrawableFactory {
    protected final android.content.Context mContext = null;
    protected final android.content.pm.PackageManager mPm = null;
    protected final android.os.UserManager mUm = null;
    protected final android.util.LauncherIcons mLauncherIcons = null;
    protected final boolean mEmbedShadow = false;
    public static final int[] CORP_BADGE_COLORS = null;
    private IconDrawableFactory(android.content.Context p0, boolean p1) {}
    protected boolean needsBadging(android.content.pm.ApplicationInfo p0, int p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.graphics.drawable.Drawable getBadgedIcon(android.content.pm.ApplicationInfo p0) { return null; }
    public android.graphics.drawable.Drawable getBadgedIcon(android.content.pm.ApplicationInfo p0, int p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.graphics.drawable.Drawable getBadgedIcon(android.content.pm.PackageItemInfo p0, android.content.pm.ApplicationInfo p1, int p2) { return null; }
    public android.graphics.drawable.Drawable getShadowedIcon(android.graphics.drawable.Drawable p0) { return null; }
    public static int getUserBadgeColor(android.os.UserManager p0, int p1) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static android.util.IconDrawableFactory newInstance(android.content.Context p0) { return null; }
    public static android.util.IconDrawableFactory newInstance(android.content.Context p0, boolean p1) { return null; }
}

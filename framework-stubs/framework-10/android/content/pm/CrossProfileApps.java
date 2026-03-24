package android.content.pm;

public class CrossProfileApps {
    private final android.content.Context mContext = null;
    private final android.content.pm.ICrossProfileApps mService = null;
    private final android.os.UserManager mUserManager = null;
    private final android.content.res.Resources mResources = null;
    public CrossProfileApps(android.content.Context p0, android.content.pm.ICrossProfileApps p1) {}
    public void startMainActivity(android.content.ComponentName p0, android.os.UserHandle p1) {}
    @android.annotation.SystemApi
    public void startActivity(android.content.ComponentName p0, android.os.UserHandle p1) {}
    public java.util.List<android.os.UserHandle> getTargetUserProfiles() { return null; }
    public java.lang.CharSequence getProfileSwitchingLabel(android.os.UserHandle p0) { return null; }
    public android.graphics.drawable.Drawable getProfileSwitchingIconDrawable(android.os.UserHandle p0) { return null; }
    private void verifyCanAccessUser(android.os.UserHandle p0) {}
}

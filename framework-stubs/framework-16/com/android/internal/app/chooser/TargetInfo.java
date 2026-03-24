package com.android.internal.app.chooser;

public interface TargetInfo {
    public android.content.Intent getResolvedIntent();
    public android.content.ComponentName getResolvedComponentName();
    public boolean start(android.app.Activity p0, android.os.Bundle p1);
    public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2);
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2);
    public android.content.pm.ResolveInfo getResolveInfo();
    public java.lang.CharSequence getDisplayLabel();
    public java.lang.CharSequence getExtendedInfo();
    public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0);
    public com.android.internal.app.chooser.TargetInfo cloneFilledIn(android.content.Intent p0, int p1);
    public java.util.List<android.content.Intent> getAllSourceIntents();
    public boolean isSuspended();
    public boolean isPinned();
    public static void prepareIntentForCrossProfileLaunch(android.content.Intent p0, int p1) {}
    public static void refreshIntentCreatorToken(android.content.Intent p0) {}
}

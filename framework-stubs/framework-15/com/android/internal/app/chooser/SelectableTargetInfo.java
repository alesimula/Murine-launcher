package com.android.internal.app.chooser;

public final class SelectableTargetInfo implements com.android.internal.app.chooser.ChooserTargetInfo {
    public SelectableTargetInfo(android.content.Context p0, com.android.internal.app.chooser.DisplayResolveInfo p1, android.service.chooser.ChooserTarget p2, float p3, com.android.internal.app.chooser.SelectableTargetInfo.SelectableTargetInfoCommunicator p4, android.content.pm.ShortcutInfo p5) {}
    public boolean isSuspended() { return false; }
    public com.android.internal.app.chooser.DisplayResolveInfo getDisplayResolveInfo() { return null; }
    public boolean loadIcon() { return false; }
    public float getModifiedScore() { return 0.0f; }
    public android.content.Intent getResolvedIntent() { return null; }
    public android.content.ComponentName getResolvedComponentName() { return null; }
    public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
    public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public java.lang.CharSequence getDisplayLabel() { return null; }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public synchronized android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    public synchronized boolean hasDisplayIcon() { return false; }
    public android.service.chooser.ChooserTarget getChooserTarget() { return null; }
    public com.android.internal.app.chooser.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
    public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    public boolean isPinned() { return false; }

    public static interface SelectableTargetInfoCommunicator {
        public com.android.internal.app.ResolverListAdapter.ActivityInfoPresentationGetter makePresentationGetter(android.content.pm.ActivityInfo p0);
        public android.content.Intent getTargetIntent();
        public android.content.Intent getReferrerFillInIntent();
    }
}

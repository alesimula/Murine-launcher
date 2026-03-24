package com.android.internal.app.chooser;

public abstract class NotSelectableTargetInfo implements com.android.internal.app.chooser.ChooserTargetInfo {
    public NotSelectableTargetInfo() {}
    public android.content.Intent getResolvedIntent() { return null; }
    public android.content.ComponentName getResolvedComponentName() { return null; }
    public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
    public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public java.lang.CharSequence getDisplayLabel() { return null; }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public com.android.internal.app.chooser.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
    public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    public float getModifiedScore() { return 0.0f; }
    public android.service.chooser.ChooserTarget getChooserTarget() { return null; }
    public boolean isSuspended() { return false; }
    public boolean isPinned() { return false; }
}

package com.android.internal.app.chooser;

public class MultiDisplayResolveInfo extends com.android.internal.app.chooser.DisplayResolveInfo {
    java.util.ArrayList<com.android.internal.app.chooser.DisplayResolveInfo> mTargetInfos;
    final com.android.internal.app.chooser.DisplayResolveInfo mBaseInfo = null;
    public MultiDisplayResolveInfo(java.lang.String p0, com.android.internal.app.chooser.DisplayResolveInfo p1) { super((android.content.Intent)null, (android.content.pm.ResolveInfo)null, (android.content.Intent)null, (com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter)null); }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public void addTarget(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
    public java.util.ArrayList<com.android.internal.app.chooser.DisplayResolveInfo> getTargets() { return null; }
    public void setSelected(int p0) {}
    public com.android.internal.app.chooser.DisplayResolveInfo getSelectedTarget() { return null; }
    public boolean hasSelected() { return false; }
    public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
    public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
}

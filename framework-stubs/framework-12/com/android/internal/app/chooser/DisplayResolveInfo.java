package com.android.internal.app.chooser;

public class DisplayResolveInfo implements com.android.internal.app.chooser.TargetInfo, android.os.Parcelable {
    private static final boolean ENABLE_CHOOSER_DELEGATE = false;
    private final android.content.pm.ResolveInfo mResolveInfo = null;
    private java.lang.CharSequence mDisplayLabel;
    private android.graphics.drawable.Drawable mDisplayIcon;
    private java.lang.CharSequence mExtendedInfo;
    private final android.content.Intent mResolvedIntent = null;
    private final java.util.List<android.content.Intent> mSourceIntents = null;
    private boolean mIsSuspended;
    private com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter mResolveInfoPresentationGetter;
    private boolean mPinned;
    public static final android.os.Parcelable.Creator<com.android.internal.app.chooser.DisplayResolveInfo> CREATOR = null;
    public DisplayResolveInfo(android.content.Intent p0, android.content.pm.ResolveInfo p1, android.content.Intent p2, com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter p3) {}
    public DisplayResolveInfo(android.content.Intent p0, android.content.pm.ResolveInfo p1, java.lang.CharSequence p2, java.lang.CharSequence p3, android.content.Intent p4, com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter p5) {}
    private DisplayResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0, android.content.Intent p1, int p2, com.android.internal.app.ResolverListAdapter.ResolveInfoPresentationGetter p3) {}
    DisplayResolveInfo(com.android.internal.app.chooser.DisplayResolveInfo p0) {}
    public android.content.pm.ResolveInfo getResolveInfo() { return null; }
    public java.lang.CharSequence getDisplayLabel() { return null; }
    public boolean hasDisplayLabel() { return false; }
    public void setDisplayLabel(java.lang.CharSequence p0) {}
    public void setExtendedInfo(java.lang.CharSequence p0) {}
    public android.graphics.drawable.Drawable getDisplayIcon(android.content.Context p0) { return null; }
    public com.android.internal.app.chooser.TargetInfo cloneFilledIn(android.content.Intent p0, int p1) { return null; }
    public java.util.List<android.content.Intent> getAllSourceIntents() { return null; }
    public void addAlternateSourceIntent(android.content.Intent p0) {}
    public void setDisplayIcon(android.graphics.drawable.Drawable p0) {}
    public boolean hasDisplayIcon() { return false; }
    public java.lang.CharSequence getExtendedInfo() { return null; }
    public android.content.Intent getResolvedIntent() { return null; }
    public android.content.ComponentName getResolvedComponentName() { return null; }
    public boolean start(android.app.Activity p0, android.os.Bundle p1) { return false; }
    public boolean startAsCaller(com.android.internal.app.ResolverActivity p0, android.os.Bundle p1, int p2) { return false; }
    public boolean startAsUser(android.app.Activity p0, android.os.Bundle p1, android.os.UserHandle p2) { return false; }
    public boolean isSuspended() { return false; }
    public boolean isPinned() { return false; }
    public void setPinned(boolean p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private DisplayResolveInfo(android.os.Parcel p0) {}
}

package android.app.servertransaction;

public class LaunchActivityItem extends android.app.servertransaction.ClientTransactionItem {
    @android.annotation.UnsupportedAppUsage
    private android.content.Intent mIntent;
    private int mIdent;
    @android.annotation.UnsupportedAppUsage
    private android.content.pm.ActivityInfo mInfo;
    private android.content.res.Configuration mCurConfig;
    private android.content.res.Configuration mOverrideConfig;
    private android.content.res.CompatibilityInfo mCompatInfo;
    private java.lang.String mReferrer;
    private com.android.internal.app.IVoiceInteractor mVoiceInteractor;
    private int mProcState;
    private android.os.Bundle mState;
    private android.os.PersistableBundle mPersistentState;
    private java.util.List<android.app.ResultInfo> mPendingResults;
    private java.util.List<com.android.internal.content.ReferrerIntent> mPendingNewIntents;
    private boolean mIsForward;
    private android.app.ProfilerInfo mProfilerInfo;
    private android.os.IBinder mAssistToken;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.LaunchActivityItem> CREATOR = null;
    public void preExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1) {}
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private LaunchActivityItem() { super(); }
    public static android.app.servertransaction.LaunchActivityItem obtain(android.content.Intent p0, int p1, android.content.pm.ActivityInfo p2, android.content.res.Configuration p3, android.content.res.Configuration p4, android.content.res.CompatibilityInfo p5, java.lang.String p6, com.android.internal.app.IVoiceInteractor p7, int p8, android.os.Bundle p9, android.os.PersistableBundle p10, java.util.List<android.app.ResultInfo> p11, java.util.List<com.android.internal.content.ReferrerIntent> p12, boolean p13, android.app.ProfilerInfo p14, android.os.IBinder p15) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private LaunchActivityItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private boolean activityInfoEqual(android.content.pm.ActivityInfo p0) { return false; }
    private static boolean areBundlesEqual(android.os.BaseBundle p0, android.os.BaseBundle p1) { return false; }
    public java.lang.String toString() { return null; }
    private static void setValues(android.app.servertransaction.LaunchActivityItem p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, android.content.res.Configuration p5, android.content.res.CompatibilityInfo p6, java.lang.String p7, com.android.internal.app.IVoiceInteractor p8, int p9, android.os.Bundle p10, android.os.PersistableBundle p11, java.util.List<android.app.ResultInfo> p12, java.util.List<com.android.internal.content.ReferrerIntent> p13, boolean p14, android.app.ProfilerInfo p15, android.os.IBinder p16) {}
}

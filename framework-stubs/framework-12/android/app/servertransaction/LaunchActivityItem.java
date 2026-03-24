package android.app.servertransaction;

public class LaunchActivityItem extends android.app.servertransaction.ClientTransactionItem {
    private android.content.Intent mIntent;
    private int mIdent;
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
    private android.app.ActivityOptions mActivityOptions;
    private boolean mIsForward;
    private android.app.ProfilerInfo mProfilerInfo;
    private android.os.IBinder mAssistToken;
    private android.os.IBinder mShareableActivityToken;
    private boolean mLaunchedFromBubble;
    private android.app.IActivityClientController mActivityClientController;
    private android.view.DisplayAdjustments.FixedRotationAdjustments mFixedRotationAdjustments;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.LaunchActivityItem> CREATOR = null;
    public void preExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1) {}
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private LaunchActivityItem() { super(); }
    public static android.app.servertransaction.LaunchActivityItem obtain(android.content.Intent p0, int p1, android.content.pm.ActivityInfo p2, android.content.res.Configuration p3, android.content.res.Configuration p4, android.content.res.CompatibilityInfo p5, java.lang.String p6, com.android.internal.app.IVoiceInteractor p7, int p8, android.os.Bundle p9, android.os.PersistableBundle p10, java.util.List<android.app.ResultInfo> p11, java.util.List<com.android.internal.content.ReferrerIntent> p12, android.app.ActivityOptions p13, boolean p14, android.app.ProfilerInfo p15, android.os.IBinder p16, android.app.IActivityClientController p17, android.view.DisplayAdjustments.FixedRotationAdjustments p18, android.os.IBinder p19, boolean p20) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private LaunchActivityItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private boolean activityInfoEqual(android.content.pm.ActivityInfo p0) { return false; }
    private static int getRoughBundleHashCode(android.os.BaseBundle p0) { return 0; }
    private static boolean areBundlesEqualRoughly(android.os.BaseBundle p0, android.os.BaseBundle p1) { return false; }
    public java.lang.String toString() { return null; }
    private static void setValues(android.app.servertransaction.LaunchActivityItem p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, android.content.res.Configuration p5, android.content.res.CompatibilityInfo p6, java.lang.String p7, com.android.internal.app.IVoiceInteractor p8, int p9, android.os.Bundle p10, android.os.PersistableBundle p11, java.util.List<android.app.ResultInfo> p12, java.util.List<com.android.internal.content.ReferrerIntent> p13, android.app.ActivityOptions p14, boolean p15, android.app.ProfilerInfo p16, android.os.IBinder p17, android.app.IActivityClientController p18, android.view.DisplayAdjustments.FixedRotationAdjustments p19, android.os.IBinder p20, boolean p21) {}
}

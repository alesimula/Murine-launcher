package android.app.servertransaction;

public class LaunchActivityItem extends android.app.servertransaction.ClientTransactionItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.LaunchActivityItem> CREATOR = null;
    public LaunchActivityItem(android.os.IBinder p0, android.content.Intent p1, int p2, android.content.pm.ActivityInfo p3, android.content.res.Configuration p4, android.content.res.Configuration p5, int p6, java.lang.String p7, com.android.internal.app.IVoiceInteractor p8, int p9, android.os.Bundle p10, android.os.PersistableBundle p11, java.util.List<android.app.ResultInfo> p12, java.util.List<com.android.internal.content.ReferrerIntent> p13, android.app.ActivityOptions.SceneTransitionInfo p14, boolean p15, android.app.ProfilerInfo p16, android.os.IBinder p17, android.app.IActivityClientController p18, android.os.IBinder p19, boolean p20, android.os.IBinder p21, android.os.IBinder p22, android.window.ActivityWindowInfo p23) { super(); }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    @android.annotation.NonNull
    public android.os.IBinder getActivityToken() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

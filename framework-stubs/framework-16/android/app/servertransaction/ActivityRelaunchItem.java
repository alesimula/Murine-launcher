package android.app.servertransaction;

public class ActivityRelaunchItem extends android.app.servertransaction.ActivityTransactionItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ActivityRelaunchItem> CREATOR = null;
    public ActivityRelaunchItem(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1, java.util.List<com.android.internal.content.ReferrerIntent> p2, int p3, android.util.MergedConfiguration p4, boolean p5, android.window.ActivityWindowInfo p6) { super((android.os.IBinder)null); }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

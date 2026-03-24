package android.app.servertransaction;

public class StartActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.StartActivityItem> CREATOR = null;
    public StartActivityItem(android.os.IBinder p0, android.app.ActivityOptions.SceneTransitionInfo p1) { super((android.os.IBinder)null); }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getTargetState() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

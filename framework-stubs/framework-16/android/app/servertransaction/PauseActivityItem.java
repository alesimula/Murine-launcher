package android.app.servertransaction;

public class PauseActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.PauseActivityItem> CREATOR = null;
    public PauseActivityItem(android.os.IBinder p0) { super((android.os.IBinder)null); }
    public PauseActivityItem(android.os.IBinder p0, boolean p1, boolean p2, boolean p3, boolean p4) { super((android.os.IBinder)null); }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getTargetState() { return 0; }
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

package android.app.servertransaction;

public class PauseActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.PauseActivityItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getTargetState() { return 0; }
    public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public static android.app.servertransaction.PauseActivityItem obtain(boolean p0, boolean p1, int p2, boolean p3, boolean p4) { return null; }
    public static android.app.servertransaction.PauseActivityItem obtain() { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

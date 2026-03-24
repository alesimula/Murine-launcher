package android.app.servertransaction;

public class StopActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    private static final java.lang.String TAG = "StopActivityItem";
    private boolean mShowWindow;
    private int mConfigChanges;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.StopActivityItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getTargetState() { return 0; }
    private StopActivityItem() { super(); }
    public static android.app.servertransaction.StopActivityItem obtain(boolean p0, int p1) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private StopActivityItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

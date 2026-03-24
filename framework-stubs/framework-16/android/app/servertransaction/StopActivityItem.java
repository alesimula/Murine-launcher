package android.app.servertransaction;

public class StopActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.StopActivityItem> CREATOR = null;
    public StopActivityItem(android.os.IBinder p0) { super((android.os.IBinder)null); }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public int getTargetState() { return 0; }
    public java.lang.String toString() { return null; }
}

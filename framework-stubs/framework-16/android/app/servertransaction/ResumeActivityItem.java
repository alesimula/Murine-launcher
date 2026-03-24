package android.app.servertransaction;

public class ResumeActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ResumeActivityItem> CREATOR = null;
    public ResumeActivityItem(android.os.IBinder p0, boolean p1, boolean p2) { super((android.os.IBinder)null); }
    public ResumeActivityItem(android.os.IBinder p0, int p1, boolean p2, boolean p3) { super((android.os.IBinder)null); }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public int getTargetState() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

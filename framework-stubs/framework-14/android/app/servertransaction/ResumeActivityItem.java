package android.app.servertransaction;

public class ResumeActivityItem extends android.app.servertransaction.ActivityLifecycleItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ResumeActivityItem> CREATOR = null;
    public void preExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1) {}
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public int getTargetState() { return 0; }
    public static android.app.servertransaction.ResumeActivityItem obtain(int p0, boolean p1, boolean p2) { return null; }
    public static android.app.servertransaction.ResumeActivityItem obtain(boolean p0, boolean p1) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

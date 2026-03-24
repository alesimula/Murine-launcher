package android.app.servertransaction;

public abstract class ActivityTransactionItem extends android.app.servertransaction.ClientTransactionItem {
    ActivityTransactionItem() { super(); }
    public final void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public abstract void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2);
    @android.annotation.NonNull
    final android.app.ActivityThread.ActivityClientRecord getActivityClientRecord(android.app.ClientTransactionHandler p0) { return null; }
    @android.annotation.NonNull
    public android.os.IBinder getActivityToken() { return null; }
    void setActivityToken(android.os.IBinder p0) {}
    ActivityTransactionItem(android.os.Parcel p0) { super(); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void recycle() {}
    void dump(java.lang.String p0, java.io.PrintWriter p1, android.app.ClientTransactionHandler p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

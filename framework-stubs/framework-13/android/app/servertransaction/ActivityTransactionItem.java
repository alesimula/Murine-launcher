package android.app.servertransaction;

public abstract class ActivityTransactionItem extends android.app.servertransaction.ClientTransactionItem {
    public ActivityTransactionItem() { super(); }
    public final void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public abstract void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2);
    android.app.ActivityThread.ActivityClientRecord getActivityClientRecord(android.app.ClientTransactionHandler p0, android.os.IBinder p1) { return null; }
}

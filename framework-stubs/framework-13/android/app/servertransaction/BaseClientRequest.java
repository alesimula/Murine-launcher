package android.app.servertransaction;

public interface BaseClientRequest extends android.app.servertransaction.ObjectPoolItem {
    default public void preExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1) {}
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2);
    default public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
}

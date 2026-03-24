package android.app.servertransaction;

public interface BaseClientRequest extends android.app.servertransaction.ObjectPoolItem {
    default public void preExecute(android.app.ClientTransactionHandler p0) {}
    public void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1);
    default public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
}

package android.app.servertransaction;

public class TransactionExecutor {
    private static final boolean DEBUG_RESOLVER = false;
    private static final java.lang.String TAG = "TransactionExecutor";
    private android.app.ClientTransactionHandler mTransactionHandler;
    private android.app.servertransaction.PendingTransactionActions mPendingActions;
    private android.app.servertransaction.TransactionExecutorHelper mHelper;
    public TransactionExecutor(android.app.ClientTransactionHandler p0) {}
    public void execute(android.app.servertransaction.ClientTransaction p0) {}
    public void executeCallbacks(android.app.servertransaction.ClientTransaction p0) {}
    private void executeLifecycleState(android.app.servertransaction.ClientTransaction p0) {}
    public void cycleToPath(android.app.ActivityThread.ActivityClientRecord p0, int p1, android.app.servertransaction.ClientTransaction p2) {}
    private void cycleToPath(android.app.ActivityThread.ActivityClientRecord p0, int p1, boolean p2, android.app.servertransaction.ClientTransaction p3) {}
    private void performLifecycleSequence(android.app.ActivityThread.ActivityClientRecord p0, android.util.IntArray p1, android.app.servertransaction.ClientTransaction p2) {}
}

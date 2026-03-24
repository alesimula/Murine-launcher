package android.app.servertransaction;

public abstract class WindowStateTransactionItem extends android.app.servertransaction.ClientTransactionItem {
    public WindowStateTransactionItem(android.view.IWindow p0) { super(); }
    public final void execute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public abstract void execute(android.app.ClientTransactionHandler p0, android.view.IWindow p1, android.app.servertransaction.PendingTransactionActions p2);
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    WindowStateTransactionItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static interface TransactionListener {
        public void onExecutingWindowStateTransactionItem();
    }
}

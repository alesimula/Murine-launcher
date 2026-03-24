package android.app.servertransaction;

public final class PipStateTransactionItem extends android.app.servertransaction.ActivityTransactionItem {
    private android.app.PictureInPictureUiState mPipState;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.PipStateTransactionItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private PipStateTransactionItem() { super(); }
    public static android.app.servertransaction.PipStateTransactionItem obtain(android.app.PictureInPictureUiState p0) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PipStateTransactionItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
}

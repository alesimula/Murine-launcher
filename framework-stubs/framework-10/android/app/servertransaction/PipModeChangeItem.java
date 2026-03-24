package android.app.servertransaction;

public class PipModeChangeItem extends android.app.servertransaction.ClientTransactionItem {
    private boolean mIsInPipMode;
    private android.content.res.Configuration mOverrideConfig;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.PipModeChangeItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private PipModeChangeItem() { super(); }
    public static android.app.servertransaction.PipModeChangeItem obtain(boolean p0, android.content.res.Configuration p1) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private PipModeChangeItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

package android.app.servertransaction;

public class TopResumedActivityChangeItem extends android.app.servertransaction.ClientTransactionItem {
    private boolean mOnTop;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.TopResumedActivityChangeItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private TopResumedActivityChangeItem() { super(); }
    public static android.app.servertransaction.TopResumedActivityChangeItem obtain(boolean p0) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private TopResumedActivityChangeItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

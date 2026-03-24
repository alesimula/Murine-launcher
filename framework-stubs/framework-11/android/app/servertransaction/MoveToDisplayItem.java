package android.app.servertransaction;

public class MoveToDisplayItem extends android.app.servertransaction.ClientTransactionItem {
    private int mTargetDisplayId;
    private android.content.res.Configuration mConfiguration;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.MoveToDisplayItem> CREATOR = null;
    public void preExecute(android.app.ClientTransactionHandler p0, android.os.IBinder p1) {}
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private MoveToDisplayItem() { super(); }
    public static android.app.servertransaction.MoveToDisplayItem obtain(int p0, android.content.res.Configuration p1) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private MoveToDisplayItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

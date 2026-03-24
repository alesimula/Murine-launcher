package android.app.servertransaction;

public class FixedRotationAdjustmentsItem extends android.app.servertransaction.ClientTransactionItem {
    private android.os.IBinder mToken;
    private android.view.DisplayAdjustments.FixedRotationAdjustments mFixedRotationAdjustments;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.FixedRotationAdjustmentsItem> CREATOR = null;
    private FixedRotationAdjustmentsItem() { super(); }
    public static android.app.servertransaction.FixedRotationAdjustmentsItem obtain(android.os.IBinder p0, android.view.DisplayAdjustments.FixedRotationAdjustments p1) { return null; }
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    private FixedRotationAdjustmentsItem(android.os.Parcel p0) { super(); }
}

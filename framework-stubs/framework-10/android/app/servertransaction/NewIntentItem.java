package android.app.servertransaction;

public class NewIntentItem extends android.app.servertransaction.ClientTransactionItem {
    @android.annotation.UnsupportedAppUsage
    private java.util.List<com.android.internal.content.ReferrerIntent> mIntents;
    private boolean mResume;
    public static final android.os.Parcelable.Creator<android.app.servertransaction.NewIntentItem> CREATOR = null;
    public int getPostExecutionState() { return 0; }
    public void execute(android.app.ClientTransactionHandler p0, android.os.IBinder p1, android.app.servertransaction.PendingTransactionActions p2) {}
    private NewIntentItem() { super(); }
    public static android.app.servertransaction.NewIntentItem obtain(java.util.List<com.android.internal.content.ReferrerIntent> p0, boolean p1) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private NewIntentItem(android.os.Parcel p0) { super(); }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

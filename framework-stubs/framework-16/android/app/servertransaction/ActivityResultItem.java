package android.app.servertransaction;

public class ActivityResultItem extends android.app.servertransaction.ActivityTransactionItem {
    public static final long CALL_ACTIVITY_RESULT_BEFORE_RESUME = 78294732L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ActivityResultItem> CREATOR = null;
    public ActivityResultItem(android.os.IBinder p0, java.util.List<android.app.ResultInfo> p1) { super((android.os.IBinder)null); }
    public int getPostExecutionState() { return 0; }
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

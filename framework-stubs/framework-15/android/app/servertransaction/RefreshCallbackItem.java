package android.app.servertransaction;

public class RefreshCallbackItem extends android.app.servertransaction.ActivityTransactionItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.RefreshCallbackItem> CREATOR = null;
    public void execute(android.app.ClientTransactionHandler p0, android.app.ActivityThread.ActivityClientRecord p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void postExecute(android.app.ClientTransactionHandler p0, android.app.servertransaction.PendingTransactionActions p1) {}
    public int getPostExecutionState() { return 0; }
    boolean shouldHaveDefinedPreExecutionState() { return false; }
    public void recycle() {}
    @android.annotation.NonNull
    public static android.app.servertransaction.RefreshCallbackItem obtain(android.os.IBinder p0, int p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

package android.app.servertransaction;

public abstract class ClientTransactionItem implements android.app.servertransaction.BaseClientRequest, android.os.Parcelable {
    public ClientTransactionItem() {}
    public int getPostExecutionState() { return 0; }
    boolean shouldHaveDefinedPreExecutionState() { return false; }
    @android.annotation.Nullable
    public android.os.IBinder getActivityToken() { return null; }
    public boolean isActivityLifecycleItem() { return false; }
    void dump(java.lang.String p0, java.io.PrintWriter p1, android.app.ClientTransactionHandler p2) {}
    public int describeContents() { return 0; }
}

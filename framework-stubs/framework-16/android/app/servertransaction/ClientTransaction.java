package android.app.servertransaction;

public class ClientTransaction implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ClientTransaction> CREATOR = null;
    public ClientTransaction() {}
    public ClientTransaction(android.app.IApplicationThread p0) {}
    public android.app.IApplicationThread getClient() { return null; }
    public void addTransactionItem(android.app.servertransaction.ClientTransactionItem p0) {}
    @android.annotation.NonNull
    public java.util.List<android.app.servertransaction.ClientTransactionItem> getTransactionItems() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.util.List<android.app.servertransaction.ClientTransactionItem> getCallbacks() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.os.IBinder getActivityToken() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.app.servertransaction.ActivityLifecycleItem getLifecycleStateRequest() { return null; }
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    @android.annotation.Nullable
    public android.os.RemoteException schedule() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    void dump(java.lang.String p0, java.io.PrintWriter p1, android.app.ClientTransactionHandler p2) {}
}

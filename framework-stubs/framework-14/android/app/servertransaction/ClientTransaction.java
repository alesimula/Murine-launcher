package android.app.servertransaction;

public class ClientTransaction implements android.os.Parcelable, android.app.servertransaction.ObjectPoolItem {
    public static final android.os.Parcelable.Creator<android.app.servertransaction.ClientTransaction> CREATOR = null;
    public android.app.IApplicationThread getClient() { return null; }
    public void addCallback(android.app.servertransaction.ClientTransactionItem p0) {}
    public java.util.List<android.app.servertransaction.ClientTransactionItem> getCallbacks() { return null; }
    public android.os.IBinder getActivityToken() { return null; }
    public android.app.servertransaction.ActivityLifecycleItem getLifecycleStateRequest() { return null; }
    public void setLifecycleStateRequest(android.app.servertransaction.ActivityLifecycleItem p0) {}
    public void preExecute(android.app.ClientTransactionHandler p0) {}
    public void schedule() throws android.os.RemoteException {}
    public static android.app.servertransaction.ClientTransaction obtain(android.app.IApplicationThread p0, android.os.IBinder p1) { return null; }
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
}

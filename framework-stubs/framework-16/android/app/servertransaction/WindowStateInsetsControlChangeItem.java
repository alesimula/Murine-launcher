package android.app.servertransaction;

public class WindowStateInsetsControlChangeItem extends android.app.servertransaction.WindowStateTransactionItem {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.servertransaction.WindowStateInsetsControlChangeItem> CREATOR = null;
    public WindowStateInsetsControlChangeItem(android.view.IWindow p0, android.view.InsetsState p1, android.view.InsetsSourceControl.Array p2) { super((android.view.IWindow)null); }
    public WindowStateInsetsControlChangeItem(android.view.IWindow p0, android.view.InsetsState p1, android.view.InsetsSourceControl.Array p2, boolean p3) { super((android.view.IWindow)null); }
    public void execute(android.app.ClientTransactionHandler p0, android.view.IWindow p1, android.app.servertransaction.PendingTransactionActions p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}

package android.content;

public class SyncActivityTooManyDeletes extends android.app.Activity implements android.widget.AdapterView.OnItemClickListener {
    private long mNumDeletes;
    private android.accounts.Account mAccount;
    private java.lang.String mAuthority;
    private java.lang.String mProvider;
    public SyncActivityTooManyDeletes() { super(); }
    protected void onCreate(android.os.Bundle p0) {}
    public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}
    private void startSyncReallyDelete() {}
    private void startSyncUndoDeletes() {}
}

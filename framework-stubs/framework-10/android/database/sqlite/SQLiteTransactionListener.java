package android.database.sqlite;

public interface SQLiteTransactionListener {
    public void onBegin();
    public void onCommit();
    public void onRollback();
}

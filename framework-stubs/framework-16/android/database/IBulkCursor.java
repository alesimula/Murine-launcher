package android.database;

public interface IBulkCursor extends android.os.IInterface {
    public static final java.lang.String descriptor = "android.content.IBulkCursor";
    public static final int GET_CURSOR_WINDOW_TRANSACTION = 1;
    public static final int DEACTIVATE_TRANSACTION = 2;
    public static final int REQUERY_TRANSACTION = 3;
    public static final int ON_MOVE_TRANSACTION = 4;
    public static final int GET_EXTRAS_TRANSACTION = 5;
    public static final int RESPOND_TRANSACTION = 6;
    public static final int CLOSE_TRANSACTION = 7;
    public android.database.CursorWindow getWindow(int p0) throws android.os.RemoteException;
    public void onMove(int p0) throws android.os.RemoteException;
    public void deactivate() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public int requery(android.database.IContentObserver p0) throws android.os.RemoteException;
    public android.os.Bundle getExtras() throws android.os.RemoteException;
    public android.os.Bundle respond(android.os.Bundle p0) throws android.os.RemoteException;
}

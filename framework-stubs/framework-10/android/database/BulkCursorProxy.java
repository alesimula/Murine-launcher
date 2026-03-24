package android.database;

final class BulkCursorProxy implements android.database.IBulkCursor {
    @android.annotation.UnsupportedAppUsage
    private android.os.IBinder mRemote;
    private android.os.Bundle mExtras;
    public BulkCursorProxy(android.os.IBinder p0) {}
    public android.os.IBinder asBinder() { return null; }
    public android.database.CursorWindow getWindow(int p0) throws android.os.RemoteException { return null; }
    public void onMove(int p0) throws android.os.RemoteException {}
    public void deactivate() throws android.os.RemoteException {}
    public void close() throws android.os.RemoteException {}
    public int requery(android.database.IContentObserver p0) throws android.os.RemoteException { return 0; }
    public android.os.Bundle getExtras() throws android.os.RemoteException { return null; }
    public android.os.Bundle respond(android.os.Bundle p0) throws android.os.RemoteException { return null; }
}

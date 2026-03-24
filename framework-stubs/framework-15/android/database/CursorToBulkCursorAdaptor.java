package android.database;

public final class CursorToBulkCursorAdaptor extends android.database.BulkCursorNative implements android.os.IBinder.DeathRecipient {
    public CursorToBulkCursorAdaptor(android.database.Cursor p0, android.database.IContentObserver p1, java.lang.String p2) { super(); }
    public void binderDied() {}
    public android.database.BulkCursorDescriptor getBulkCursorDescriptor() { return null; }
    public android.database.CursorWindow getWindow(int p0) { return null; }
    public void onMove(int p0) {}
    public void deactivate() {}
    public void close() {}
    public int requery(android.database.IContentObserver p0) { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public android.os.Bundle respond(android.os.Bundle p0) { return null; }

    private static final class ContentObserverProxy extends android.database.ContentObserver {
        protected android.database.IContentObserver mRemote;
        public ContentObserverProxy(android.database.IContentObserver p0, android.os.IBinder.DeathRecipient p1) { super((android.os.Handler)null); }
        public boolean unlinkToDeath(android.os.IBinder.DeathRecipient p0) { return false; }
        public boolean deliverSelfNotifications() { return false; }
        public void onChange(boolean p0, java.util.Collection<android.net.Uri> p1, int p2, int p3) {}
    }
}

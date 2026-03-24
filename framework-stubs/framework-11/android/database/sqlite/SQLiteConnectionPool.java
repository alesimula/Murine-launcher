package android.database.sqlite;

public final class SQLiteConnectionPool implements java.io.Closeable {
    private static final java.lang.String TAG = "SQLiteConnectionPool";
    private static final long CONNECTION_POOL_BUSY_MILLIS = 30000L;
    private final java.lang.Object mLock = null;
    private final java.util.concurrent.atomic.AtomicBoolean mConnectionLeaked = null;
    private final android.database.sqlite.SQLiteDatabaseConfiguration mConfiguration = null;
    private int mMaxConnectionPoolSize;
    private boolean mIsOpen;
    private int mNextConnectionId;
    private android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterPool;
    private android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterQueue;
    private final java.util.ArrayList<android.database.sqlite.SQLiteConnection> mAvailableNonPrimaryConnections = null;
    private android.database.sqlite.SQLiteConnection mAvailablePrimaryConnection;
    private android.database.sqlite.SQLiteConnectionPool.IdleConnectionHandler mIdleConnectionHandler;
    private final java.util.concurrent.atomic.AtomicLong mTotalExecutionTimeCounter = null;
    private final java.util.WeakHashMap<android.database.sqlite.SQLiteConnection, android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus> mAcquiredConnections = null;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    private SQLiteConnectionPool(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public static android.database.sqlite.SQLiteConnectionPool open(android.database.sqlite.SQLiteDatabaseConfiguration p0) { return null; }
    private void open() {}
    public void close() {}
    private void dispose(boolean p0) {}
    public void reconfigure(android.database.sqlite.SQLiteDatabaseConfiguration p0) {}
    public android.database.sqlite.SQLiteConnection acquireConnection(java.lang.String p0, int p1, android.os.CancellationSignal p2) { return null; }
    public void releaseConnection(android.database.sqlite.SQLiteConnection p0) {}
    private boolean recycleConnectionLocked(android.database.sqlite.SQLiteConnection p0, android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus p1) { return false; }
    public boolean shouldYieldConnection(android.database.sqlite.SQLiteConnection p0, int p1) { return false; }
    public void collectDbStats(java.util.ArrayList<android.database.sqlite.SQLiteDebug.DbStats> p0) {}
    private android.database.sqlite.SQLiteConnection openConnectionLocked(android.database.sqlite.SQLiteDatabaseConfiguration p0, boolean p1) { return null; }
    void onConnectionLeaked() {}
    void onStatementExecuted(long p0) {}
    private void closeAvailableConnectionsAndLogExceptionsLocked() {}
    private boolean closeAvailableConnectionLocked(int p0) { return false; }
    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {}
    void closeAvailableNonPrimaryConnectionsAndLogExceptions() {}
    private void closeExcessConnectionsAndLogExceptionsLocked() {}
    private void closeConnectionAndLogExceptionsLocked(android.database.sqlite.SQLiteConnection p0) {}
    private void discardAcquiredConnectionsLocked() {}
    private void reconfigureAllConnectionsLocked() {}
    private void markAcquiredConnectionsLocked(android.database.sqlite.SQLiteConnectionPool.AcquiredConnectionStatus p0) {}
    private android.database.sqlite.SQLiteConnection waitForConnection(java.lang.String p0, int p1, android.os.CancellationSignal p2) { return null; }
    private void cancelConnectionWaiterLocked(android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter p0) {}
    private void logConnectionPoolBusyLocked(long p0, int p1) {}
    private void wakeConnectionWaitersLocked() {}
    private android.database.sqlite.SQLiteConnection tryAcquirePrimaryConnectionLocked(int p0) { return null; }
    private android.database.sqlite.SQLiteConnection tryAcquireNonPrimaryConnectionLocked(java.lang.String p0, int p1) { return null; }
    private void finishAcquireConnectionLocked(android.database.sqlite.SQLiteConnection p0, int p1) {}
    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean p0, int p1) { return false; }
    private static int getPriority(int p0) { return 0; }
    private void setMaxConnectionPoolSizeLocked() {}
    public void setupIdleConnectionHandler(android.os.Looper p0, long p1) {}
    void disableIdleConnectionHandler() {}
    private void throwIfClosedLocked() {}
    private android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked(java.lang.Thread p0, long p1, int p2, boolean p3, java.lang.String p4, int p5) { return null; }
    private void recycleConnectionWaiterLocked(android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter p0) {}
    public void dump(android.util.Printer p0, boolean p1, android.util.ArraySet<java.lang.String> p2) {}
    public java.lang.String toString() { return null; }
    public java.lang.String getPath() { return null; }

    static enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD;
        private AcquiredConnectionStatus() {}
    }

    private static final class ConnectionWaiter {
        public android.database.sqlite.SQLiteConnectionPool.ConnectionWaiter mNext;
        public java.lang.Thread mThread;
        public long mStartTime;
        public int mPriority;
        public boolean mWantPrimaryConnection;
        public java.lang.String mSql;
        public int mConnectionFlags;
        public android.database.sqlite.SQLiteConnection mAssignedConnection;
        public java.lang.RuntimeException mException;
        public int mNonce;
        private ConnectionWaiter() {}
    }

    private class IdleConnectionHandler extends android.os.Handler {
        private final long mTimeout = 0L;
        IdleConnectionHandler(android.database.sqlite.SQLiteConnectionPool p0, android.os.Looper p1, long p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
        void connectionReleased(android.database.sqlite.SQLiteConnection p0) {}
        void connectionAcquired(android.database.sqlite.SQLiteConnection p0) {}
        void connectionClosed(android.database.sqlite.SQLiteConnection p0) {}
    }
}

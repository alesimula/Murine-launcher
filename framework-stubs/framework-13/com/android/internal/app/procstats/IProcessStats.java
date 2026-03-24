package com.android.internal.app.procstats;

public interface IProcessStats extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.app.procstats.IProcessStats";
    public byte[] getCurrentStats(java.util.List<android.os.ParcelFileDescriptor> p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getStatsOverTime(long p0) throws android.os.RemoteException;
    public int getCurrentMemoryState() throws android.os.RemoteException;
    public long getCommittedStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException;
    public long getCommittedStatsMerged(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3, com.android.internal.app.procstats.ProcessStats p4) throws android.os.RemoteException;
    public long getMinAssociationDumpDuration() throws android.os.RemoteException;

    public static class Default implements com.android.internal.app.procstats.IProcessStats {
        public Default() {}
        public byte[] getCurrentStats(java.util.List<android.os.ParcelFileDescriptor> p0) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor getStatsOverTime(long p0) throws android.os.RemoteException { return null; }
        public int getCurrentMemoryState() throws android.os.RemoteException { return 0; }
        public long getCommittedStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
        public long getCommittedStatsMerged(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3, com.android.internal.app.procstats.ProcessStats p4) throws android.os.RemoteException { return 0L; }
        public long getMinAssociationDumpDuration() throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.app.procstats.IProcessStats {
        static final int TRANSACTION_getCurrentStats = 1;
        static final int TRANSACTION_getStatsOverTime = 2;
        static final int TRANSACTION_getCurrentMemoryState = 3;
        static final int TRANSACTION_getCommittedStats = 4;
        static final int TRANSACTION_getCommittedStatsMerged = 5;
        static final int TRANSACTION_getMinAssociationDumpDuration = 6;
        public Stub() { super(); }
        public static com.android.internal.app.procstats.IProcessStats asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.app.procstats.IProcessStats {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public byte[] getCurrentStats(java.util.List<android.os.ParcelFileDescriptor> p0) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor getStatsOverTime(long p0) throws android.os.RemoteException { return null; }
            public int getCurrentMemoryState() throws android.os.RemoteException { return 0; }
            public long getCommittedStats(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3) throws android.os.RemoteException { return 0L; }
            public long getCommittedStatsMerged(long p0, int p1, boolean p2, java.util.List<android.os.ParcelFileDescriptor> p3, com.android.internal.app.procstats.ProcessStats p4) throws android.os.RemoteException { return 0L; }
            public long getMinAssociationDumpDuration() throws android.os.RemoteException { return 0L; }
        }
    }
}

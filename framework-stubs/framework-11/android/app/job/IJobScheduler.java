package android.app.job;

public interface IJobScheduler extends android.os.IInterface {
    public int schedule(android.app.job.JobInfo p0) throws android.os.RemoteException;
    public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException;
    public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public void cancel(int p0) throws android.os.RemoteException;
    public void cancelAll() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllPendingJobs() throws android.os.RemoteException;
    public android.app.job.JobInfo getPendingJob(int p0) throws android.os.RemoteException;
    public java.util.List<android.app.job.JobInfo> getStartedJobs() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllJobSnapshots() throws android.os.RemoteException;

    public static class Default implements android.app.job.IJobScheduler {
        public Default() {}
        public int schedule(android.app.job.JobInfo p0) throws android.os.RemoteException { return 0; }
        public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException { return 0; }
        public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public void cancel(int p0) throws android.os.RemoteException {}
        public void cancelAll() throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getAllPendingJobs() throws android.os.RemoteException { return null; }
        public android.app.job.JobInfo getPendingJob(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.job.JobInfo> getStartedJobs() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAllJobSnapshots() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.job.IJobScheduler {
        private static final java.lang.String DESCRIPTOR = "android.app.job.IJobScheduler";
        static final int TRANSACTION_schedule = 1;
        static final int TRANSACTION_enqueue = 2;
        static final int TRANSACTION_scheduleAsPackage = 3;
        static final int TRANSACTION_cancel = 4;
        static final int TRANSACTION_cancelAll = 5;
        static final int TRANSACTION_getAllPendingJobs = 6;
        static final int TRANSACTION_getPendingJob = 7;
        static final int TRANSACTION_getStartedJobs = 8;
        static final int TRANSACTION_getAllJobSnapshots = 9;
        public Stub() { super(); }
        public static android.app.job.IJobScheduler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.job.IJobScheduler p0) { return false; }
        public static android.app.job.IJobScheduler getDefaultImpl() { return null; }

        private static class Proxy implements android.app.job.IJobScheduler {
            private android.os.IBinder mRemote;
            public static android.app.job.IJobScheduler sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int schedule(android.app.job.JobInfo p0) throws android.os.RemoteException { return 0; }
            public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) throws android.os.RemoteException { return 0; }
            public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public void cancel(int p0) throws android.os.RemoteException {}
            public void cancelAll() throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getAllPendingJobs() throws android.os.RemoteException { return null; }
            public android.app.job.JobInfo getPendingJob(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.job.JobInfo> getStartedJobs() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAllJobSnapshots() throws android.os.RemoteException { return null; }
        }
    }
}

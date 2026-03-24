package android.app.job;

public interface IJobScheduler extends android.os.IInterface {
    public int schedule(java.lang.String p0, android.app.job.JobInfo p1) throws android.os.RemoteException;
    public int enqueue(java.lang.String p0, android.app.job.JobInfo p1, android.app.job.JobWorkItem p2) throws android.os.RemoteException;
    public int scheduleAsPackage(java.lang.String p0, android.app.job.JobInfo p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException;
    public void cancel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void cancelAll() throws android.os.RemoteException;
    public void cancelAllInNamespace(java.lang.String p0) throws android.os.RemoteException;
    public java.util.Map<java.lang.String, android.content.pm.ParceledListSlice<android.app.job.JobInfo>> getAllPendingJobs() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice<android.app.job.JobInfo> getAllPendingJobsInNamespace(java.lang.String p0) throws android.os.RemoteException;
    public android.app.job.JobInfo getPendingJob(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int getPendingJobReason(java.lang.String p0, int p1) throws android.os.RemoteException;
    public int[] getPendingJobReasons(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.app.job.PendingJobReasonsInfo> getPendingJobReasonsHistory(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean canRunUserInitiatedJobs(java.lang.String p0) throws android.os.RemoteException;
    public boolean hasRunUserInitiatedJobsPermission(java.lang.String p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.app.job.JobInfo> getStartedJobs() throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllJobSnapshots() throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.MANAGE_ACTIVITY_TASKS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    public void notePendingUserRequestedAppStop(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.app.job.IJobScheduler {
        public Default() {}
        public int schedule(java.lang.String p0, android.app.job.JobInfo p1) throws android.os.RemoteException { return 0; }
        public int enqueue(java.lang.String p0, android.app.job.JobInfo p1, android.app.job.JobWorkItem p2) throws android.os.RemoteException { return 0; }
        public int scheduleAsPackage(java.lang.String p0, android.app.job.JobInfo p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
        public void cancel(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void cancelAll() throws android.os.RemoteException {}
        public void cancelAllInNamespace(java.lang.String p0) throws android.os.RemoteException {}
        public java.util.Map<java.lang.String, android.content.pm.ParceledListSlice<android.app.job.JobInfo>> getAllPendingJobs() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice<android.app.job.JobInfo> getAllPendingJobsInNamespace(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.app.job.JobInfo getPendingJob(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public int getPendingJobReason(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
        public int[] getPendingJobReasons(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public java.util.List<android.app.job.PendingJobReasonsInfo> getPendingJobReasonsHistory(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public boolean canRunUserInitiatedJobs(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean hasRunUserInitiatedJobsPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.app.job.JobInfo> getStartedJobs() throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAllJobSnapshots() throws android.os.RemoteException { return null; }
        public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) throws android.os.RemoteException {}
        public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) throws android.os.RemoteException {}
        public void notePendingUserRequestedAppStop(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.job.IJobScheduler {
        public static final java.lang.String DESCRIPTOR = "android.app.job.IJobScheduler";
        static final int TRANSACTION_schedule = 1;
        static final int TRANSACTION_enqueue = 2;
        static final int TRANSACTION_scheduleAsPackage = 3;
        static final int TRANSACTION_cancel = 4;
        static final int TRANSACTION_cancelAll = 5;
        static final int TRANSACTION_cancelAllInNamespace = 6;
        static final int TRANSACTION_getAllPendingJobs = 7;
        static final int TRANSACTION_getAllPendingJobsInNamespace = 8;
        static final int TRANSACTION_getPendingJob = 9;
        static final int TRANSACTION_getPendingJobReason = 10;
        static final int TRANSACTION_getPendingJobReasons = 11;
        static final int TRANSACTION_getPendingJobReasonsHistory = 12;
        static final int TRANSACTION_canRunUserInitiatedJobs = 13;
        static final int TRANSACTION_hasRunUserInitiatedJobsPermission = 14;
        static final int TRANSACTION_getStartedJobs = 15;
        static final int TRANSACTION_getAllJobSnapshots = 16;
        static final int TRANSACTION_registerUserVisibleJobObserver = 17;
        static final java.lang.String[] PERMISSIONS_registerUserVisibleJobObserver = null;
        static final int TRANSACTION_unregisterUserVisibleJobObserver = 18;
        static final java.lang.String[] PERMISSIONS_unregisterUserVisibleJobObserver = null;
        static final int TRANSACTION_notePendingUserRequestedAppStop = 19;
        static final java.lang.String[] PERMISSIONS_notePendingUserRequestedAppStop = null;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.app.job.IJobScheduler asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void registerUserVisibleJobObserver_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterUserVisibleJobObserver_enforcePermission() throws java.lang.SecurityException {}
        protected void notePendingUserRequestedAppStop_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.job.IJobScheduler {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int schedule(java.lang.String p0, android.app.job.JobInfo p1) throws android.os.RemoteException { return 0; }
            public int enqueue(java.lang.String p0, android.app.job.JobInfo p1, android.app.job.JobWorkItem p2) throws android.os.RemoteException { return 0; }
            public int scheduleAsPackage(java.lang.String p0, android.app.job.JobInfo p1, java.lang.String p2, int p3, java.lang.String p4) throws android.os.RemoteException { return 0; }
            public void cancel(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void cancelAll() throws android.os.RemoteException {}
            public void cancelAllInNamespace(java.lang.String p0) throws android.os.RemoteException {}
            public java.util.Map<java.lang.String, android.content.pm.ParceledListSlice<android.app.job.JobInfo>> getAllPendingJobs() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice<android.app.job.JobInfo> getAllPendingJobsInNamespace(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.app.job.JobInfo getPendingJob(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public int getPendingJobReason(java.lang.String p0, int p1) throws android.os.RemoteException { return 0; }
            public int[] getPendingJobReasons(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public java.util.List<android.app.job.PendingJobReasonsInfo> getPendingJobReasonsHistory(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public boolean canRunUserInitiatedJobs(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean hasRunUserInitiatedJobsPermission(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.app.job.JobInfo> getStartedJobs() throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAllJobSnapshots() throws android.os.RemoteException { return null; }
            public void registerUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) throws android.os.RemoteException {}
            public void unregisterUserVisibleJobObserver(android.app.job.IUserVisibleJobObserver p0) throws android.os.RemoteException {}
            public void notePendingUserRequestedAppStop(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}

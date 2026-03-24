package android.app.job;

public interface IJobService extends android.os.IInterface {
    public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException;
    public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException;

    public static class Default implements android.app.job.IJobService {
        public Default() {}
        public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.job.IJobService {
        public static final java.lang.String DESCRIPTOR = "android.app.job.IJobService";
        static final int TRANSACTION_startJob = 1;
        static final int TRANSACTION_stopJob = 2;
        public Stub() { super(); }
        public static android.app.job.IJobService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.job.IJobService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
            public void stopJob(android.app.job.JobParameters p0) throws android.os.RemoteException {}
        }
    }
}

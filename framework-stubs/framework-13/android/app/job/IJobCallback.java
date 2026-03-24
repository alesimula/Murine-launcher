package android.app.job;

public interface IJobCallback extends android.os.IInterface {
    public void acknowledgeStartMessage(int p0, boolean p1) throws android.os.RemoteException;
    public void acknowledgeStopMessage(int p0, boolean p1) throws android.os.RemoteException;
    public android.app.job.JobWorkItem dequeueWork(int p0) throws android.os.RemoteException;
    public boolean completeWork(int p0, int p1) throws android.os.RemoteException;
    public void jobFinished(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.app.job.IJobCallback {
        public Default() {}
        public void acknowledgeStartMessage(int p0, boolean p1) throws android.os.RemoteException {}
        public void acknowledgeStopMessage(int p0, boolean p1) throws android.os.RemoteException {}
        public android.app.job.JobWorkItem dequeueWork(int p0) throws android.os.RemoteException { return null; }
        public boolean completeWork(int p0, int p1) throws android.os.RemoteException { return false; }
        public void jobFinished(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.job.IJobCallback {
        public static final java.lang.String DESCRIPTOR = "android.app.job.IJobCallback";
        static final int TRANSACTION_acknowledgeStartMessage = 1;
        static final int TRANSACTION_acknowledgeStopMessage = 2;
        static final int TRANSACTION_dequeueWork = 3;
        static final int TRANSACTION_completeWork = 4;
        static final int TRANSACTION_jobFinished = 5;
        public Stub() { super(); }
        public static android.app.job.IJobCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.job.IJobCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acknowledgeStartMessage(int p0, boolean p1) throws android.os.RemoteException {}
            public void acknowledgeStopMessage(int p0, boolean p1) throws android.os.RemoteException {}
            public android.app.job.JobWorkItem dequeueWork(int p0) throws android.os.RemoteException { return null; }
            public boolean completeWork(int p0, int p1) throws android.os.RemoteException { return false; }
            public void jobFinished(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}

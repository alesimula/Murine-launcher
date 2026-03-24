package android.hardware.power;

public interface IPowerHintSession extends android.os.IInterface {
    public static final int VERSION = 5;
    public static final java.lang.String HASH = "d111735ed2b89b6c32443aac9b162b1afbbea3f2";
    public static final java.lang.String DESCRIPTOR = null;
    public void updateTargetWorkDuration(long p0) throws android.os.RemoteException;
    public void reportActualWorkDuration(android.hardware.power.WorkDuration[] p0) throws android.os.RemoteException;
    public void pause() throws android.os.RemoteException;
    public void resume() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void sendHint(int p0) throws android.os.RemoteException;
    public void setThreads(int[] p0) throws android.os.RemoteException;
    public void setMode(int p0, boolean p1) throws android.os.RemoteException;
    public android.hardware.power.SessionConfig getSessionConfig() throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.power.IPowerHintSession {
        public Default() {}
        public void updateTargetWorkDuration(long p0) throws android.os.RemoteException {}
        public void reportActualWorkDuration(android.hardware.power.WorkDuration[] p0) throws android.os.RemoteException {}
        public void pause() throws android.os.RemoteException {}
        public void resume() throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void sendHint(int p0) throws android.os.RemoteException {}
        public void setThreads(int[] p0) throws android.os.RemoteException {}
        public void setMode(int p0, boolean p1) throws android.os.RemoteException {}
        public android.hardware.power.SessionConfig getSessionConfig() throws android.os.RemoteException { return null; }
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.power.IPowerHintSession {
        static final int TRANSACTION_updateTargetWorkDuration = 1;
        static final int TRANSACTION_reportActualWorkDuration = 2;
        static final int TRANSACTION_pause = 3;
        static final int TRANSACTION_resume = 4;
        static final int TRANSACTION_close = 5;
        static final int TRANSACTION_sendHint = 6;
        static final int TRANSACTION_setThreads = 7;
        static final int TRANSACTION_setMode = 8;
        static final int TRANSACTION_getSessionConfig = 9;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.power.IPowerHintSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.power.IPowerHintSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateTargetWorkDuration(long p0) throws android.os.RemoteException {}
            public void reportActualWorkDuration(android.hardware.power.WorkDuration[] p0) throws android.os.RemoteException {}
            public void pause() throws android.os.RemoteException {}
            public void resume() throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void sendHint(int p0) throws android.os.RemoteException {}
            public void setThreads(int[] p0) throws android.os.RemoteException {}
            public void setMode(int p0, boolean p1) throws android.os.RemoteException {}
            public android.hardware.power.SessionConfig getSessionConfig() throws android.os.RemoteException { return null; }
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

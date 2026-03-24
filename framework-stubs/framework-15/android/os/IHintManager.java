package android.os;

public interface IHintManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IHintManager";
    public android.os.IHintSession createHintSessionWithConfig(android.os.IBinder p0, int[] p1, long p2, int p3, android.hardware.power.SessionConfig p4) throws android.os.RemoteException;
    public long getHintSessionPreferredRate() throws android.os.RemoteException;
    public void setHintSessionThreads(android.os.IHintSession p0, int[] p1) throws android.os.RemoteException;
    public int[] getHintSessionThreadIds(android.os.IHintSession p0) throws android.os.RemoteException;
    public android.hardware.power.ChannelConfig getSessionChannel(android.os.IBinder p0) throws android.os.RemoteException;
    public void closeSessionChannel() throws android.os.RemoteException;

    public static class Default implements android.os.IHintManager {
        public Default() {}
        public android.os.IHintSession createHintSessionWithConfig(android.os.IBinder p0, int[] p1, long p2, int p3, android.hardware.power.SessionConfig p4) throws android.os.RemoteException { return null; }
        public long getHintSessionPreferredRate() throws android.os.RemoteException { return 0L; }
        public void setHintSessionThreads(android.os.IHintSession p0, int[] p1) throws android.os.RemoteException {}
        public int[] getHintSessionThreadIds(android.os.IHintSession p0) throws android.os.RemoteException { return null; }
        public android.hardware.power.ChannelConfig getSessionChannel(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void closeSessionChannel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IHintManager {
        static final int TRANSACTION_createHintSessionWithConfig = 1;
        static final int TRANSACTION_getHintSessionPreferredRate = 2;
        static final int TRANSACTION_setHintSessionThreads = 3;
        static final int TRANSACTION_getHintSessionThreadIds = 4;
        static final int TRANSACTION_getSessionChannel = 5;
        static final int TRANSACTION_closeSessionChannel = 6;
        public Stub() { super(); }
        public static android.os.IHintManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IHintManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IHintSession createHintSessionWithConfig(android.os.IBinder p0, int[] p1, long p2, int p3, android.hardware.power.SessionConfig p4) throws android.os.RemoteException { return null; }
            public long getHintSessionPreferredRate() throws android.os.RemoteException { return 0L; }
            public void setHintSessionThreads(android.os.IHintSession p0, int[] p1) throws android.os.RemoteException {}
            public int[] getHintSessionThreadIds(android.os.IHintSession p0) throws android.os.RemoteException { return null; }
            public android.hardware.power.ChannelConfig getSessionChannel(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void closeSessionChannel() throws android.os.RemoteException {}
        }
    }
}

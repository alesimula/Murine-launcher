package android.speech;

public interface IRecognitionServiceManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionServiceManager";
    public void createSession(android.content.ComponentName p0, android.os.IBinder p1, boolean p2, android.speech.IRecognitionServiceManagerCallback p3) throws android.os.RemoteException;
    public void setTemporaryComponent(android.content.ComponentName p0) throws android.os.RemoteException;

    public static class Default implements android.speech.IRecognitionServiceManager {
        public Default() {}
        public void createSession(android.content.ComponentName p0, android.os.IBinder p1, boolean p2, android.speech.IRecognitionServiceManagerCallback p3) throws android.os.RemoteException {}
        public void setTemporaryComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionServiceManager {
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_setTemporaryComponent = 2;
        public Stub() { super(); }
        public static android.speech.IRecognitionServiceManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.speech.IRecognitionServiceManager p0) { return false; }
        public static android.speech.IRecognitionServiceManager getDefaultImpl() { return null; }

        private static class Proxy implements android.speech.IRecognitionServiceManager {
            private android.os.IBinder mRemote;
            public static android.speech.IRecognitionServiceManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createSession(android.content.ComponentName p0, android.os.IBinder p1, boolean p2, android.speech.IRecognitionServiceManagerCallback p3) throws android.os.RemoteException {}
            public void setTemporaryComponent(android.content.ComponentName p0) throws android.os.RemoteException {}
        }
    }
}

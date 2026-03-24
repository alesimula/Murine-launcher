package android.speech;

public interface IRecognitionService extends android.os.IInterface {
    public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void stopListening(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public void cancel(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.speech.IRecognitionService {
        public Default() {}
        public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void stopListening(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public void cancel(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionService {
        private static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionService";
        static final int TRANSACTION_startListening = 1;
        static final int TRANSACTION_stopListening = 2;
        static final int TRANSACTION_cancel = 3;
        public Stub() { super(); }
        public static android.speech.IRecognitionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.speech.IRecognitionService p0) { return false; }
        public static android.speech.IRecognitionService getDefaultImpl() { return null; }

        private static class Proxy implements android.speech.IRecognitionService {
            private android.os.IBinder mRemote;
            public static android.speech.IRecognitionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void stopListening(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
            public void cancel(android.speech.IRecognitionListener p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException {}
        }
    }
}

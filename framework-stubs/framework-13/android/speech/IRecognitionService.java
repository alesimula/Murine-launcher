package android.speech;

public interface IRecognitionService extends android.os.IInterface {
    public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) throws android.os.RemoteException;
    public void stopListening(android.speech.IRecognitionListener p0) throws android.os.RemoteException;
    public void cancel(android.speech.IRecognitionListener p0, boolean p1) throws android.os.RemoteException;
    public void checkRecognitionSupport(android.content.Intent p0, android.speech.IRecognitionSupportCallback p1) throws android.os.RemoteException;
    public void triggerModelDownload(android.content.Intent p0) throws android.os.RemoteException;

    public static class Default implements android.speech.IRecognitionService {
        public Default() {}
        public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
        public void stopListening(android.speech.IRecognitionListener p0) throws android.os.RemoteException {}
        public void cancel(android.speech.IRecognitionListener p0, boolean p1) throws android.os.RemoteException {}
        public void checkRecognitionSupport(android.content.Intent p0, android.speech.IRecognitionSupportCallback p1) throws android.os.RemoteException {}
        public void triggerModelDownload(android.content.Intent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionService {
        public static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionService";
        static final int TRANSACTION_startListening = 1;
        static final int TRANSACTION_stopListening = 2;
        static final int TRANSACTION_cancel = 3;
        static final int TRANSACTION_checkRecognitionSupport = 4;
        static final int TRANSACTION_triggerModelDownload = 5;
        public Stub() { super(); }
        public static android.speech.IRecognitionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.speech.IRecognitionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startListening(android.content.Intent p0, android.speech.IRecognitionListener p1, android.content.AttributionSource p2) throws android.os.RemoteException {}
            public void stopListening(android.speech.IRecognitionListener p0) throws android.os.RemoteException {}
            public void cancel(android.speech.IRecognitionListener p0, boolean p1) throws android.os.RemoteException {}
            public void checkRecognitionSupport(android.content.Intent p0, android.speech.IRecognitionSupportCallback p1) throws android.os.RemoteException {}
            public void triggerModelDownload(android.content.Intent p0) throws android.os.RemoteException {}
        }
    }
}

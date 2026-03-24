package android.speech;

public interface IRecognitionListener extends android.os.IInterface {
    public void onReadyForSpeech(android.os.Bundle p0) throws android.os.RemoteException;
    public void onBeginningOfSpeech() throws android.os.RemoteException;
    public void onRmsChanged(float p0) throws android.os.RemoteException;
    public void onBufferReceived(byte[] p0) throws android.os.RemoteException;
    public void onEndOfSpeech() throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;
    public void onResults(android.os.Bundle p0) throws android.os.RemoteException;
    public void onPartialResults(android.os.Bundle p0) throws android.os.RemoteException;
    public void onSegmentResults(android.os.Bundle p0) throws android.os.RemoteException;
    public void onEndOfSegmentedSession() throws android.os.RemoteException;
    public void onEvent(int p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.speech.IRecognitionListener {
        public Default() {}
        public void onReadyForSpeech(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onBeginningOfSpeech() throws android.os.RemoteException {}
        public void onRmsChanged(float p0) throws android.os.RemoteException {}
        public void onBufferReceived(byte[] p0) throws android.os.RemoteException {}
        public void onEndOfSpeech() throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onResults(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onPartialResults(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onSegmentResults(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onEndOfSegmentedSession() throws android.os.RemoteException {}
        public void onEvent(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.IRecognitionListener {
        public static final java.lang.String DESCRIPTOR = "android.speech.IRecognitionListener";
        static final int TRANSACTION_onReadyForSpeech = 1;
        static final int TRANSACTION_onBeginningOfSpeech = 2;
        static final int TRANSACTION_onRmsChanged = 3;
        static final int TRANSACTION_onBufferReceived = 4;
        static final int TRANSACTION_onEndOfSpeech = 5;
        static final int TRANSACTION_onError = 6;
        static final int TRANSACTION_onResults = 7;
        static final int TRANSACTION_onPartialResults = 8;
        static final int TRANSACTION_onSegmentResults = 9;
        static final int TRANSACTION_onEndOfSegmentedSession = 10;
        static final int TRANSACTION_onEvent = 11;
        public Stub() { super(); }
        public static android.speech.IRecognitionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.speech.IRecognitionListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onReadyForSpeech(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onBeginningOfSpeech() throws android.os.RemoteException {}
            public void onRmsChanged(float p0) throws android.os.RemoteException {}
            public void onBufferReceived(byte[] p0) throws android.os.RemoteException {}
            public void onEndOfSpeech() throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
            public void onResults(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onPartialResults(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onSegmentResults(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onEndOfSegmentedSession() throws android.os.RemoteException {}
            public void onEvent(int p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}

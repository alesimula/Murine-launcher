package android.speech.tts;

public interface ITextToSpeechCallback extends android.os.IInterface {
    public void onStart(java.lang.String p0) throws android.os.RemoteException;
    public void onSuccess(java.lang.String p0) throws android.os.RemoteException;
    public void onStop(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void onError(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void onBeginSynthesis(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void onAudioAvailable(java.lang.String p0, byte[] p1) throws android.os.RemoteException;
    public void onRangeStart(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechCallback {
        private static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechCallback";
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onStop = 3;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onBeginSynthesis = 5;
        static final int TRANSACTION_onAudioAvailable = 6;
        static final int TRANSACTION_onRangeStart = 7;
        public Stub() { super(); }
        public static android.speech.tts.ITextToSpeechCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.speech.tts.ITextToSpeechCallback p0) { return false; }
        public static android.speech.tts.ITextToSpeechCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.speech.tts.ITextToSpeechCallback {
            private android.os.IBinder mRemote;
            public static android.speech.tts.ITextToSpeechCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStart(java.lang.String p0) throws android.os.RemoteException {}
            public void onSuccess(java.lang.String p0) throws android.os.RemoteException {}
            public void onStop(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void onError(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void onBeginSynthesis(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void onAudioAvailable(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
            public void onRangeStart(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.speech.tts.ITextToSpeechCallback {
        public Default() {}
        public void onStart(java.lang.String p0) throws android.os.RemoteException {}
        public void onSuccess(java.lang.String p0) throws android.os.RemoteException {}
        public void onStop(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void onError(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void onBeginSynthesis(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void onAudioAvailable(java.lang.String p0, byte[] p1) throws android.os.RemoteException {}
        public void onRangeStart(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

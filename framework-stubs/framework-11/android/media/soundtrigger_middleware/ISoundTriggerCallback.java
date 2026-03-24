package android.media.soundtrigger_middleware;

public interface ISoundTriggerCallback extends android.os.IInterface {
    public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEvent p1) throws android.os.RemoteException;
    public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEvent p1) throws android.os.RemoteException;
    public void onRecognitionAvailabilityChange(boolean p0) throws android.os.RemoteException;
    public void onModuleDied() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.ISoundTriggerCallback {
        public Default() {}
        public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEvent p1) throws android.os.RemoteException {}
        public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEvent p1) throws android.os.RemoteException {}
        public void onRecognitionAvailabilityChange(boolean p0) throws android.os.RemoteException {}
        public void onModuleDied() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.ISoundTriggerCallback {
        private static final java.lang.String DESCRIPTOR = "android.media.soundtrigger_middleware.ISoundTriggerCallback";
        static final int TRANSACTION_onRecognition = 1;
        static final int TRANSACTION_onPhraseRecognition = 2;
        static final int TRANSACTION_onRecognitionAvailabilityChange = 3;
        static final int TRANSACTION_onModuleDied = 4;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.ISoundTriggerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.media.soundtrigger_middleware.ISoundTriggerCallback p0) { return false; }
        public static android.media.soundtrigger_middleware.ISoundTriggerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.media.soundtrigger_middleware.ISoundTriggerCallback {
            private android.os.IBinder mRemote;
            public static android.media.soundtrigger_middleware.ISoundTriggerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEvent p1) throws android.os.RemoteException {}
            public void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEvent p1) throws android.os.RemoteException {}
            public void onRecognitionAvailabilityChange(boolean p0) throws android.os.RemoteException {}
            public void onModuleDied() throws android.os.RemoteException {}
        }
    }
}

package android.speech.tts;

public interface ITextToSpeechManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechManager";
    public void createSession(java.lang.String p0, android.speech.tts.ITextToSpeechSessionCallback p1) throws android.os.RemoteException;

    public static class Default implements android.speech.tts.ITextToSpeechManager {
        public Default() {}
        public void createSession(java.lang.String p0, android.speech.tts.ITextToSpeechSessionCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechManager {
        static final int TRANSACTION_createSession = 1;
        public Stub() { super(); }
        public static android.speech.tts.ITextToSpeechManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.speech.tts.ITextToSpeechManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createSession(java.lang.String p0, android.speech.tts.ITextToSpeechSessionCallback p1) throws android.os.RemoteException {}
        }
    }
}

package android.speech.tts;

public interface ITextToSpeechSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechSession";
    public void disconnect() throws android.os.RemoteException;

    public static class Default implements android.speech.tts.ITextToSpeechSession {
        public Default() {}
        public void disconnect() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechSession {
        static final int TRANSACTION_disconnect = 1;
        public Stub() { super(); }
        public static android.speech.tts.ITextToSpeechSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.speech.tts.ITextToSpeechSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void disconnect() throws android.os.RemoteException {}
        }
    }
}

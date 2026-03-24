package android.media.soundtrigger_middleware;

public interface IInjectRecognitionEvent extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void triggerRecognitionEvent(byte[] p0, android.media.soundtrigger.PhraseRecognitionExtra[] p1) throws android.os.RemoteException;
    public void triggerAbortRecognition() throws android.os.RemoteException;

    public static class Default implements android.media.soundtrigger_middleware.IInjectRecognitionEvent {
        public Default() {}
        public void triggerRecognitionEvent(byte[] p0, android.media.soundtrigger.PhraseRecognitionExtra[] p1) throws android.os.RemoteException {}
        public void triggerAbortRecognition() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.soundtrigger_middleware.IInjectRecognitionEvent {
        static final int TRANSACTION_triggerRecognitionEvent = 1;
        static final int TRANSACTION_triggerAbortRecognition = 2;
        public Stub() { super(); }
        public static android.media.soundtrigger_middleware.IInjectRecognitionEvent asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.soundtrigger_middleware.IInjectRecognitionEvent {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void triggerRecognitionEvent(byte[] p0, android.media.soundtrigger.PhraseRecognitionExtra[] p1) throws android.os.RemoteException {}
            public void triggerAbortRecognition() throws android.os.RemoteException {}
        }
    }
}

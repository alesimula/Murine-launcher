package android.hardware.soundtrigger3;

public interface ISoundTriggerHwCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "6b24e60ad261e3ff56106efd86ce6aa7ef5621b0";
    public static final java.lang.String DESCRIPTOR = null;
    public void modelUnloaded(int p0) throws android.os.RemoteException;
    public void phraseRecognitionCallback(int p0, android.media.soundtrigger.PhraseRecognitionEvent p1) throws android.os.RemoteException;
    public void recognitionCallback(int p0, android.media.soundtrigger.RecognitionEvent p1) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.hardware.soundtrigger3.ISoundTriggerHwCallback {
        public Default() {}
        public void modelUnloaded(int p0) throws android.os.RemoteException {}
        public void phraseRecognitionCallback(int p0, android.media.soundtrigger.PhraseRecognitionEvent p1) throws android.os.RemoteException {}
        public void recognitionCallback(int p0, android.media.soundtrigger.RecognitionEvent p1) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.soundtrigger3.ISoundTriggerHwCallback {
        static final int TRANSACTION_modelUnloaded = 1;
        static final int TRANSACTION_phraseRecognitionCallback = 2;
        static final int TRANSACTION_recognitionCallback = 3;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.hardware.soundtrigger3.ISoundTriggerHwCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.hardware.soundtrigger3.ISoundTriggerHwCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void modelUnloaded(int p0) throws android.os.RemoteException {}
            public void phraseRecognitionCallback(int p0, android.media.soundtrigger.PhraseRecognitionEvent p1) throws android.os.RemoteException {}
            public void recognitionCallback(int p0, android.media.soundtrigger.RecognitionEvent p1) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

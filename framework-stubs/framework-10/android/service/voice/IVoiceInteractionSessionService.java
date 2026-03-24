package android.service.voice;

public interface IVoiceInteractionSessionService extends android.os.IInterface {
    public void newSession(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionSessionService {
        private static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionSessionService";
        static final int TRANSACTION_newSession = 1;
        public Stub() { super(); }
        public static android.service.voice.IVoiceInteractionSessionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.voice.IVoiceInteractionSessionService p0) { return false; }
        public static android.service.voice.IVoiceInteractionSessionService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.voice.IVoiceInteractionSessionService {
            private android.os.IBinder mRemote;
            public static android.service.voice.IVoiceInteractionSessionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void newSession(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.voice.IVoiceInteractionSessionService {
        public Default() {}
        public void newSession(android.os.IBinder p0, android.os.Bundle p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

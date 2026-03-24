package android.service.voice;

public interface IVoiceInteractionService extends android.os.IInterface {
    public void ready() throws android.os.RemoteException;
    public void soundModelsChanged() throws android.os.RemoteException;
    public void shutdown() throws android.os.RemoteException;
    public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException;
    public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException;

    public static class Default implements android.service.voice.IVoiceInteractionService {
        public Default() {}
        public void ready() throws android.os.RemoteException {}
        public void soundModelsChanged() throws android.os.RemoteException {}
        public void shutdown() throws android.os.RemoteException {}
        public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
        public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.voice.IVoiceInteractionService {
        public static final java.lang.String DESCRIPTOR = "android.service.voice.IVoiceInteractionService";
        static final int TRANSACTION_ready = 1;
        static final int TRANSACTION_soundModelsChanged = 2;
        static final int TRANSACTION_shutdown = 3;
        static final int TRANSACTION_launchVoiceAssistFromKeyguard = 4;
        static final int TRANSACTION_getActiveServiceSupportedActions = 5;
        public Stub() { super(); }
        public static android.service.voice.IVoiceInteractionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.voice.IVoiceInteractionService p0) { return false; }
        public static android.service.voice.IVoiceInteractionService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.voice.IVoiceInteractionService {
            private android.os.IBinder mRemote;
            public static android.service.voice.IVoiceInteractionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void ready() throws android.os.RemoteException {}
            public void soundModelsChanged() throws android.os.RemoteException {}
            public void shutdown() throws android.os.RemoteException {}
            public void launchVoiceAssistFromKeyguard() throws android.os.RemoteException {}
            public void getActiveServiceSupportedActions(java.util.List<java.lang.String> p0, com.android.internal.app.IVoiceActionCheckCallback p1) throws android.os.RemoteException {}
        }
    }
}

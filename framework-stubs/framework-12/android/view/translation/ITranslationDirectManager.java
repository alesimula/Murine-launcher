package android.view.translation;

public interface ITranslationDirectManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.translation.ITranslationDirectManager";
    public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.ICancellationSignal p2, android.service.translation.ITranslationCallback p3) throws android.os.RemoteException;
    public void onFinishTranslationSession(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.translation.ITranslationDirectManager {
        public Default() {}
        public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.ICancellationSignal p2, android.service.translation.ITranslationCallback p3) throws android.os.RemoteException {}
        public void onFinishTranslationSession(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.translation.ITranslationDirectManager {
        static final int TRANSACTION_onTranslationRequest = 1;
        static final int TRANSACTION_onFinishTranslationSession = 2;
        public Stub() { super(); }
        public static android.view.translation.ITranslationDirectManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.translation.ITranslationDirectManager p0) { return false; }
        public static android.view.translation.ITranslationDirectManager getDefaultImpl() { return null; }

        private static class Proxy implements android.view.translation.ITranslationDirectManager {
            private android.os.IBinder mRemote;
            public static android.view.translation.ITranslationDirectManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTranslationRequest(android.view.translation.TranslationRequest p0, int p1, android.os.ICancellationSignal p2, android.service.translation.ITranslationCallback p3) throws android.os.RemoteException {}
            public void onFinishTranslationSession(int p0) throws android.os.RemoteException {}
        }
    }
}

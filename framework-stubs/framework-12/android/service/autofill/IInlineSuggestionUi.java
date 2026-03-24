package android.service.autofill;

public interface IInlineSuggestionUi extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.autofill.IInlineSuggestionUi";
    public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) throws android.os.RemoteException;
    public void releaseSurfaceControlViewHost() throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IInlineSuggestionUi {
        public Default() {}
        public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) throws android.os.RemoteException {}
        public void releaseSurfaceControlViewHost() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IInlineSuggestionUi {
        static final int TRANSACTION_getSurfacePackage = 1;
        static final int TRANSACTION_releaseSurfaceControlViewHost = 2;
        public Stub() { super(); }
        public static android.service.autofill.IInlineSuggestionUi asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.IInlineSuggestionUi p0) { return false; }
        public static android.service.autofill.IInlineSuggestionUi getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.IInlineSuggestionUi {
            private android.os.IBinder mRemote;
            public static android.service.autofill.IInlineSuggestionUi sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getSurfacePackage(android.service.autofill.ISurfacePackageResultCallback p0) throws android.os.RemoteException {}
            public void releaseSurfaceControlViewHost() throws android.os.RemoteException {}
        }
    }
}

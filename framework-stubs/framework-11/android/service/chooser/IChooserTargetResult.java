package android.service.chooser;

public interface IChooserTargetResult extends android.os.IInterface {
    public void sendResult(java.util.List<android.service.chooser.ChooserTarget> p0) throws android.os.RemoteException;

    public static class Default implements android.service.chooser.IChooserTargetResult {
        public Default() {}
        public void sendResult(java.util.List<android.service.chooser.ChooserTarget> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.chooser.IChooserTargetResult {
        private static final java.lang.String DESCRIPTOR = "android.service.chooser.IChooserTargetResult";
        static final int TRANSACTION_sendResult = 1;
        public Stub() { super(); }
        public static android.service.chooser.IChooserTargetResult asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.chooser.IChooserTargetResult p0) { return false; }
        public static android.service.chooser.IChooserTargetResult getDefaultImpl() { return null; }

        private static class Proxy implements android.service.chooser.IChooserTargetResult {
            private android.os.IBinder mRemote;
            public static android.service.chooser.IChooserTargetResult sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendResult(java.util.List<android.service.chooser.ChooserTarget> p0) throws android.os.RemoteException {}
        }
    }
}

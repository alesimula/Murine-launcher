package android.service.chooser;

public interface IChooserController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.chooser.IChooserController";
    public void updateIntent(android.content.Intent p0) throws android.os.RemoteException;
    public void collapse() throws android.os.RemoteException;
    public void setTargetsEnabled(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.service.chooser.IChooserController {
        public Default() {}
        public void updateIntent(android.content.Intent p0) throws android.os.RemoteException {}
        public void collapse() throws android.os.RemoteException {}
        public void setTargetsEnabled(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.chooser.IChooserController {
        static final int TRANSACTION_updateIntent = 1;
        static final int TRANSACTION_collapse = 2;
        static final int TRANSACTION_setTargetsEnabled = 3;
        public Stub() { super(); }
        public static android.service.chooser.IChooserController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.chooser.IChooserController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateIntent(android.content.Intent p0) throws android.os.RemoteException {}
            public void collapse() throws android.os.RemoteException {}
            public void setTargetsEnabled(boolean p0) throws android.os.RemoteException {}
        }
    }
}

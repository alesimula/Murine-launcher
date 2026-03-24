package android.view.accessibility;

public interface IAccessibilityEmbeddedConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IAccessibilityEmbeddedConnection";
    public android.os.IBinder associateEmbeddedHierarchy(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void disassociateEmbeddedHierarchy() throws android.os.RemoteException;
    public void setWindowMatrix(float[] p0) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IAccessibilityEmbeddedConnection {
        public Default() {}
        public android.os.IBinder associateEmbeddedHierarchy(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
        public void disassociateEmbeddedHierarchy() throws android.os.RemoteException {}
        public void setWindowMatrix(float[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IAccessibilityEmbeddedConnection {
        static final int TRANSACTION_associateEmbeddedHierarchy = 1;
        static final int TRANSACTION_disassociateEmbeddedHierarchy = 2;
        static final int TRANSACTION_setWindowMatrix = 3;
        public Stub() { super(); }
        public static android.view.accessibility.IAccessibilityEmbeddedConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.accessibility.IAccessibilityEmbeddedConnection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IBinder associateEmbeddedHierarchy(android.os.IBinder p0, int p1) throws android.os.RemoteException { return null; }
            public void disassociateEmbeddedHierarchy() throws android.os.RemoteException {}
            public void setWindowMatrix(float[] p0) throws android.os.RemoteException {}
        }
    }
}

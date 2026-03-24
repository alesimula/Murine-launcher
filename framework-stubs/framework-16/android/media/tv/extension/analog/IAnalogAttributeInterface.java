package android.media.tv.extension.analog;

public interface IAnalogAttributeInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.analog.IAnalogAttributeInterface";
    public int getVersion() throws android.os.RemoteException;
    public void setColorSystemCapability(java.lang.String[] p0) throws android.os.RemoteException;
    public java.lang.String[] getColorSystemCapability() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.analog.IAnalogAttributeInterface {
        public Default() {}
        public int getVersion() throws android.os.RemoteException { return 0; }
        public void setColorSystemCapability(java.lang.String[] p0) throws android.os.RemoteException {}
        public java.lang.String[] getColorSystemCapability() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.analog.IAnalogAttributeInterface {
        static final int TRANSACTION_getVersion = 1;
        static final int TRANSACTION_setColorSystemCapability = 2;
        static final int TRANSACTION_getColorSystemCapability = 3;
        public Stub() { super(); }
        public static android.media.tv.extension.analog.IAnalogAttributeInterface asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.analog.IAnalogAttributeInterface {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getVersion() throws android.os.RemoteException { return 0; }
            public void setColorSystemCapability(java.lang.String[] p0) throws android.os.RemoteException {}
            public java.lang.String[] getColorSystemCapability() throws android.os.RemoteException { return null; }
        }
    }
}

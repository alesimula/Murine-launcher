package android.content;

public interface IIntentReceiver extends android.os.IInterface {
    public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException;

    public static class Default implements android.content.IIntentReceiver {
        public Default() {}
        public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.IIntentReceiver {
        public static final java.lang.String DESCRIPTOR = "android.content.IIntentReceiver";
        static final int TRANSACTION_performReceive = 1;
        public Stub() { super(); }
        public static android.content.IIntentReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.IIntentReceiver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void performReceive(android.content.Intent p0, int p1, java.lang.String p2, android.os.Bundle p3, boolean p4, boolean p5, int p6) throws android.os.RemoteException {}
        }
    }
}

package android.content;

public interface IIntentSender extends android.os.IInterface {
    public void send(int p0, android.content.Intent p1, java.lang.String p2, android.os.IBinder p3, android.content.IIntentReceiver p4, java.lang.String p5, android.os.Bundle p6) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.IIntentSender {
        private static final java.lang.String DESCRIPTOR = "android.content.IIntentSender";
        static final int TRANSACTION_send = 1;
        public Stub() { super(); }
        public static android.content.IIntentSender asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.IIntentSender p0) { return false; }
        public static android.content.IIntentSender getDefaultImpl() { return null; }

        private static class Proxy implements android.content.IIntentSender {
            private android.os.IBinder mRemote;
            public static android.content.IIntentSender sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void send(int p0, android.content.Intent p1, java.lang.String p2, android.os.IBinder p3, android.content.IIntentReceiver p4, java.lang.String p5, android.os.Bundle p6) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.IIntentSender {
        public Default() {}
        public void send(int p0, android.content.Intent p1, java.lang.String p2, android.os.IBinder p3, android.content.IIntentReceiver p4, java.lang.String p5, android.os.Bundle p6) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

package android.view;

public interface IDisplayChangeWindowController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IDisplayChangeWindowController";
    public void onDisplayChange(int p0, int p1, int p2, android.window.DisplayAreaInfo p3, android.view.IDisplayChangeWindowCallback p4) throws android.os.RemoteException;

    public static class Default implements android.view.IDisplayChangeWindowController {
        public Default() {}
        public void onDisplayChange(int p0, int p1, int p2, android.window.DisplayAreaInfo p3, android.view.IDisplayChangeWindowCallback p4) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDisplayChangeWindowController {
        static final int TRANSACTION_onDisplayChange = 1;
        public Stub() { super(); }
        public static android.view.IDisplayChangeWindowController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.IDisplayChangeWindowController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDisplayChange(int p0, int p1, int p2, android.window.DisplayAreaInfo p3, android.view.IDisplayChangeWindowCallback p4) throws android.os.RemoteException {}
        }
    }
}

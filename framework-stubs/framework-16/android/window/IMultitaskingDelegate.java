package android.window;

public interface IMultitaskingDelegate extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IMultitaskingDelegate";
    @android.annotation.RequiresPermission("android.permission.REQUEST_SYSTEM_MULTITASKING_CONTROLS")
    public void createBubble(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REQUEST_SYSTEM_MULTITASKING_CONTROLS")
    public void updateBubbleState(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REQUEST_SYSTEM_MULTITASKING_CONTROLS")
    public void updateBubbleMessage(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REQUEST_SYSTEM_MULTITASKING_CONTROLS")
    public void removeBubble(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.window.IMultitaskingDelegate {
        public Default() {}
        public void createBubble(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException {}
        public void updateBubbleState(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void updateBubbleMessage(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeBubble(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IMultitaskingDelegate {
        static final int TRANSACTION_createBubble = 1;
        static final int TRANSACTION_updateBubbleState = 2;
        static final int TRANSACTION_updateBubbleMessage = 3;
        static final int TRANSACTION_removeBubble = 4;
        public Stub() { super(); }
        public static android.window.IMultitaskingDelegate asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IMultitaskingDelegate {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void createBubble(android.os.IBinder p0, android.content.Intent p1, boolean p2) throws android.os.RemoteException {}
            public void updateBubbleState(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void updateBubbleMessage(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeBubble(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}

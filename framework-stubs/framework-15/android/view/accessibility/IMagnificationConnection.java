package android.view.accessibility;

public interface IMagnificationConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IMagnificationConnection";
    public void enableWindowMagnification(int p0, float p1, float p2, float p3, float p4, float p5, android.view.accessibility.IRemoteMagnificationAnimationCallback p6) throws android.os.RemoteException;
    public void setScaleForWindowMagnification(int p0, float p1) throws android.os.RemoteException;
    public void disableWindowMagnification(int p0, android.view.accessibility.IRemoteMagnificationAnimationCallback p1) throws android.os.RemoteException;
    public void moveWindowMagnifier(int p0, float p1, float p2) throws android.os.RemoteException;
    public void moveWindowMagnifierToPosition(int p0, float p1, float p2, android.view.accessibility.IRemoteMagnificationAnimationCallback p3) throws android.os.RemoteException;
    public void showMagnificationButton(int p0, int p1) throws android.os.RemoteException;
    public void removeMagnificationButton(int p0) throws android.os.RemoteException;
    public void removeMagnificationSettingsPanel(int p0) throws android.os.RemoteException;
    public void setConnectionCallback(android.view.accessibility.IMagnificationConnectionCallback p0) throws android.os.RemoteException;
    public void onUserMagnificationScaleChanged(int p0, int p1, float p2) throws android.os.RemoteException;
    public void onFullscreenMagnificationActivationChanged(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IMagnificationConnection {
        public Default() {}
        public void enableWindowMagnification(int p0, float p1, float p2, float p3, float p4, float p5, android.view.accessibility.IRemoteMagnificationAnimationCallback p6) throws android.os.RemoteException {}
        public void setScaleForWindowMagnification(int p0, float p1) throws android.os.RemoteException {}
        public void disableWindowMagnification(int p0, android.view.accessibility.IRemoteMagnificationAnimationCallback p1) throws android.os.RemoteException {}
        public void moveWindowMagnifier(int p0, float p1, float p2) throws android.os.RemoteException {}
        public void moveWindowMagnifierToPosition(int p0, float p1, float p2, android.view.accessibility.IRemoteMagnificationAnimationCallback p3) throws android.os.RemoteException {}
        public void showMagnificationButton(int p0, int p1) throws android.os.RemoteException {}
        public void removeMagnificationButton(int p0) throws android.os.RemoteException {}
        public void removeMagnificationSettingsPanel(int p0) throws android.os.RemoteException {}
        public void setConnectionCallback(android.view.accessibility.IMagnificationConnectionCallback p0) throws android.os.RemoteException {}
        public void onUserMagnificationScaleChanged(int p0, int p1, float p2) throws android.os.RemoteException {}
        public void onFullscreenMagnificationActivationChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IMagnificationConnection {
        static final int TRANSACTION_enableWindowMagnification = 1;
        static final int TRANSACTION_setScaleForWindowMagnification = 2;
        static final int TRANSACTION_disableWindowMagnification = 3;
        static final int TRANSACTION_moveWindowMagnifier = 4;
        static final int TRANSACTION_moveWindowMagnifierToPosition = 5;
        static final int TRANSACTION_showMagnificationButton = 6;
        static final int TRANSACTION_removeMagnificationButton = 7;
        static final int TRANSACTION_removeMagnificationSettingsPanel = 8;
        static final int TRANSACTION_setConnectionCallback = 9;
        static final int TRANSACTION_onUserMagnificationScaleChanged = 10;
        static final int TRANSACTION_onFullscreenMagnificationActivationChanged = 11;
        public Stub() { super(); }
        public static android.view.accessibility.IMagnificationConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.accessibility.IMagnificationConnection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void enableWindowMagnification(int p0, float p1, float p2, float p3, float p4, float p5, android.view.accessibility.IRemoteMagnificationAnimationCallback p6) throws android.os.RemoteException {}
            public void setScaleForWindowMagnification(int p0, float p1) throws android.os.RemoteException {}
            public void disableWindowMagnification(int p0, android.view.accessibility.IRemoteMagnificationAnimationCallback p1) throws android.os.RemoteException {}
            public void moveWindowMagnifier(int p0, float p1, float p2) throws android.os.RemoteException {}
            public void moveWindowMagnifierToPosition(int p0, float p1, float p2, android.view.accessibility.IRemoteMagnificationAnimationCallback p3) throws android.os.RemoteException {}
            public void showMagnificationButton(int p0, int p1) throws android.os.RemoteException {}
            public void removeMagnificationButton(int p0) throws android.os.RemoteException {}
            public void removeMagnificationSettingsPanel(int p0) throws android.os.RemoteException {}
            public void setConnectionCallback(android.view.accessibility.IMagnificationConnectionCallback p0) throws android.os.RemoteException {}
            public void onUserMagnificationScaleChanged(int p0, int p1, float p2) throws android.os.RemoteException {}
            public void onFullscreenMagnificationActivationChanged(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}

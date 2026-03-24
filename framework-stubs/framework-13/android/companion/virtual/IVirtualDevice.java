package android.companion.virtual;

public interface IVirtualDevice extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDevice";
    public int getAssociationId() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException;
    public void onAudioSessionEnded() throws android.os.RemoteException;
    public void createVirtualKeyboard(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException;
    public void createVirtualMouse(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException;
    public void createVirtualTouchscreen(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4, android.graphics.Point p5) throws android.os.RemoteException;
    public void unregisterInputDevice(android.os.IBinder p0) throws android.os.RemoteException;
    public boolean sendKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException;
    public boolean sendButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseButtonEvent p1) throws android.os.RemoteException;
    public boolean sendRelativeEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseRelativeEvent p1) throws android.os.RemoteException;
    public boolean sendScrollEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseScrollEvent p1) throws android.os.RemoteException;
    public boolean sendTouchEvent(android.os.IBinder p0, android.hardware.input.VirtualTouchEvent p1) throws android.os.RemoteException;
    public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public android.graphics.PointF getCursorPosition(android.os.IBinder p0) throws android.os.RemoteException;
    public void setShowPointerIcon(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDevice {
        public Default() {}
        public int getAssociationId() throws android.os.RemoteException { return 0; }
        public void close() throws android.os.RemoteException {}
        public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException {}
        public void onAudioSessionEnded() throws android.os.RemoteException {}
        public void createVirtualKeyboard(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException {}
        public void createVirtualMouse(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException {}
        public void createVirtualTouchscreen(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4, android.graphics.Point p5) throws android.os.RemoteException {}
        public void unregisterInputDevice(android.os.IBinder p0) throws android.os.RemoteException {}
        public boolean sendKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseButtonEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendRelativeEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseRelativeEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendScrollEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseScrollEvent p1) throws android.os.RemoteException { return false; }
        public boolean sendTouchEvent(android.os.IBinder p0, android.hardware.input.VirtualTouchEvent p1) throws android.os.RemoteException { return false; }
        public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public android.graphics.PointF getCursorPosition(android.os.IBinder p0) throws android.os.RemoteException { return null; }
        public void setShowPointerIcon(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDevice {
        static final int TRANSACTION_getAssociationId = 1;
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_onAudioSessionStarting = 3;
        static final int TRANSACTION_onAudioSessionEnded = 4;
        static final int TRANSACTION_createVirtualKeyboard = 5;
        static final int TRANSACTION_createVirtualMouse = 6;
        static final int TRANSACTION_createVirtualTouchscreen = 7;
        static final int TRANSACTION_unregisterInputDevice = 8;
        static final int TRANSACTION_sendKeyEvent = 9;
        static final int TRANSACTION_sendButtonEvent = 10;
        static final int TRANSACTION_sendRelativeEvent = 11;
        static final int TRANSACTION_sendScrollEvent = 12;
        static final int TRANSACTION_sendTouchEvent = 13;
        static final int TRANSACTION_launchPendingIntent = 14;
        static final int TRANSACTION_getCursorPosition = 15;
        static final int TRANSACTION_setShowPointerIcon = 16;
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDevice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.IVirtualDevice {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getAssociationId() throws android.os.RemoteException { return 0; }
            public void close() throws android.os.RemoteException {}
            public void onAudioSessionStarting(int p0, android.companion.virtual.audio.IAudioRoutingCallback p1, android.companion.virtual.audio.IAudioConfigChangedCallback p2) throws android.os.RemoteException {}
            public void onAudioSessionEnded() throws android.os.RemoteException {}
            public void createVirtualKeyboard(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException {}
            public void createVirtualMouse(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException {}
            public void createVirtualTouchscreen(int p0, java.lang.String p1, int p2, int p3, android.os.IBinder p4, android.graphics.Point p5) throws android.os.RemoteException {}
            public void unregisterInputDevice(android.os.IBinder p0) throws android.os.RemoteException {}
            public boolean sendKeyEvent(android.os.IBinder p0, android.hardware.input.VirtualKeyEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendButtonEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseButtonEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendRelativeEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseRelativeEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendScrollEvent(android.os.IBinder p0, android.hardware.input.VirtualMouseScrollEvent p1) throws android.os.RemoteException { return false; }
            public boolean sendTouchEvent(android.os.IBinder p0, android.hardware.input.VirtualTouchEvent p1) throws android.os.RemoteException { return false; }
            public void launchPendingIntent(int p0, android.app.PendingIntent p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public android.graphics.PointF getCursorPosition(android.os.IBinder p0) throws android.os.RemoteException { return null; }
            public void setShowPointerIcon(boolean p0) throws android.os.RemoteException {}
        }
    }
}

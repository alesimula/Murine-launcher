package android.hardware.input;

public interface IVirtualInputDevice extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.input.IVirtualInputDevice";
    public void close() throws android.os.RemoteException;
    public int getInputDeviceId() throws android.os.RemoteException;
    public int getAssociatedDisplayId() throws android.os.RemoteException;
    public boolean sendDpadKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException;
    public boolean sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException;
    public boolean sendMouseButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) throws android.os.RemoteException;
    public boolean sendMouseRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) throws android.os.RemoteException;
    public boolean sendMouseScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) throws android.os.RemoteException;
    public boolean sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) throws android.os.RemoteException;
    public boolean sendStylusMotionEvent(android.hardware.input.VirtualStylusMotionEvent p0) throws android.os.RemoteException;
    public boolean sendStylusButtonEvent(android.hardware.input.VirtualStylusButtonEvent p0) throws android.os.RemoteException;
    public boolean sendRotaryEncoderScrollEvent(android.hardware.input.VirtualRotaryEncoderScrollEvent p0) throws android.os.RemoteException;
    public android.graphics.PointF getCursorPosition() throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IVirtualInputDevice {
        public Default() {}
        public void close() throws android.os.RemoteException {}
        public int getInputDeviceId() throws android.os.RemoteException { return 0; }
        public int getAssociatedDisplayId() throws android.os.RemoteException { return 0; }
        public boolean sendDpadKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendMouseButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendMouseRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendMouseScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendStylusMotionEvent(android.hardware.input.VirtualStylusMotionEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendStylusButtonEvent(android.hardware.input.VirtualStylusButtonEvent p0) throws android.os.RemoteException { return false; }
        public boolean sendRotaryEncoderScrollEvent(android.hardware.input.VirtualRotaryEncoderScrollEvent p0) throws android.os.RemoteException { return false; }
        public android.graphics.PointF getCursorPosition() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IVirtualInputDevice {
        static final int TRANSACTION_close = 1;
        static final int TRANSACTION_getInputDeviceId = 2;
        static final int TRANSACTION_getAssociatedDisplayId = 3;
        static final int TRANSACTION_sendDpadKeyEvent = 4;
        static final int TRANSACTION_sendKeyEvent = 5;
        static final int TRANSACTION_sendMouseButtonEvent = 6;
        static final int TRANSACTION_sendMouseRelativeEvent = 7;
        static final int TRANSACTION_sendMouseScrollEvent = 8;
        static final int TRANSACTION_sendTouchEvent = 9;
        static final int TRANSACTION_sendStylusMotionEvent = 10;
        static final int TRANSACTION_sendStylusButtonEvent = 11;
        static final int TRANSACTION_sendRotaryEncoderScrollEvent = 12;
        static final int TRANSACTION_getCursorPosition = 13;
        public Stub() { super(); }
        public static android.hardware.input.IVirtualInputDevice asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.input.IVirtualInputDevice {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void close() throws android.os.RemoteException {}
            public int getInputDeviceId() throws android.os.RemoteException { return 0; }
            public int getAssociatedDisplayId() throws android.os.RemoteException { return 0; }
            public boolean sendDpadKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendKeyEvent(android.hardware.input.VirtualKeyEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendMouseButtonEvent(android.hardware.input.VirtualMouseButtonEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendMouseRelativeEvent(android.hardware.input.VirtualMouseRelativeEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendMouseScrollEvent(android.hardware.input.VirtualMouseScrollEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendTouchEvent(android.hardware.input.VirtualTouchEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendStylusMotionEvent(android.hardware.input.VirtualStylusMotionEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendStylusButtonEvent(android.hardware.input.VirtualStylusButtonEvent p0) throws android.os.RemoteException { return false; }
            public boolean sendRotaryEncoderScrollEvent(android.hardware.input.VirtualRotaryEncoderScrollEvent p0) throws android.os.RemoteException { return false; }
            public android.graphics.PointF getCursorPosition() throws android.os.RemoteException { return null; }
        }
    }
}

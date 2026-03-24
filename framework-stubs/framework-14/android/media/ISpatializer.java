package android.media;

public interface ISpatializer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;
    public void release() throws android.os.RemoteException;
    public byte[] getSupportedLevels() throws android.os.RemoteException;
    public void setLevel(byte p0) throws android.os.RemoteException;
    public byte getLevel() throws android.os.RemoteException;
    public boolean isHeadTrackingSupported() throws android.os.RemoteException;
    public byte[] getSupportedHeadTrackingModes() throws android.os.RemoteException;
    public void setDesiredHeadTrackingMode(byte p0) throws android.os.RemoteException;
    public byte getActualHeadTrackingMode() throws android.os.RemoteException;
    public void recenterHeadTracker() throws android.os.RemoteException;
    public void setGlobalTransform(float[] p0) throws android.os.RemoteException;
    public void setHeadSensor(int p0) throws android.os.RemoteException;
    public void setScreenSensor(int p0) throws android.os.RemoteException;
    public void setDisplayOrientation(float p0) throws android.os.RemoteException;
    public void setHingeAngle(float p0) throws android.os.RemoteException;
    public void setFoldState(boolean p0) throws android.os.RemoteException;
    public byte[] getSupportedModes() throws android.os.RemoteException;
    public void registerHeadTrackingCallback(android.media.ISpatializerHeadTrackingCallback p0) throws android.os.RemoteException;
    public void setParameter(int p0, byte[] p1) throws android.os.RemoteException;
    public void getParameter(int p0, byte[] p1) throws android.os.RemoteException;
    public int getOutput() throws android.os.RemoteException;

    public static class Default implements android.media.ISpatializer {
        public Default() {}
        public void release() throws android.os.RemoteException {}
        public byte[] getSupportedLevels() throws android.os.RemoteException { return null; }
        public void setLevel(byte p0) throws android.os.RemoteException {}
        public byte getLevel() throws android.os.RemoteException { return 0; }
        public boolean isHeadTrackingSupported() throws android.os.RemoteException { return false; }
        public byte[] getSupportedHeadTrackingModes() throws android.os.RemoteException { return null; }
        public void setDesiredHeadTrackingMode(byte p0) throws android.os.RemoteException {}
        public byte getActualHeadTrackingMode() throws android.os.RemoteException { return 0; }
        public void recenterHeadTracker() throws android.os.RemoteException {}
        public void setGlobalTransform(float[] p0) throws android.os.RemoteException {}
        public void setHeadSensor(int p0) throws android.os.RemoteException {}
        public void setScreenSensor(int p0) throws android.os.RemoteException {}
        public void setDisplayOrientation(float p0) throws android.os.RemoteException {}
        public void setHingeAngle(float p0) throws android.os.RemoteException {}
        public void setFoldState(boolean p0) throws android.os.RemoteException {}
        public byte[] getSupportedModes() throws android.os.RemoteException { return null; }
        public void registerHeadTrackingCallback(android.media.ISpatializerHeadTrackingCallback p0) throws android.os.RemoteException {}
        public void setParameter(int p0, byte[] p1) throws android.os.RemoteException {}
        public void getParameter(int p0, byte[] p1) throws android.os.RemoteException {}
        public int getOutput() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.ISpatializer {
        static final int TRANSACTION_release = 1;
        static final int TRANSACTION_getSupportedLevels = 2;
        static final int TRANSACTION_setLevel = 3;
        static final int TRANSACTION_getLevel = 4;
        static final int TRANSACTION_isHeadTrackingSupported = 5;
        static final int TRANSACTION_getSupportedHeadTrackingModes = 6;
        static final int TRANSACTION_setDesiredHeadTrackingMode = 7;
        static final int TRANSACTION_getActualHeadTrackingMode = 8;
        static final int TRANSACTION_recenterHeadTracker = 9;
        static final int TRANSACTION_setGlobalTransform = 10;
        static final int TRANSACTION_setHeadSensor = 11;
        static final int TRANSACTION_setScreenSensor = 12;
        static final int TRANSACTION_setDisplayOrientation = 13;
        static final int TRANSACTION_setHingeAngle = 14;
        static final int TRANSACTION_setFoldState = 15;
        static final int TRANSACTION_getSupportedModes = 16;
        static final int TRANSACTION_registerHeadTrackingCallback = 17;
        static final int TRANSACTION_setParameter = 18;
        static final int TRANSACTION_getParameter = 19;
        static final int TRANSACTION_getOutput = 20;
        public Stub() { super(); }
        public static android.media.ISpatializer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.media.ISpatializer {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void release() throws android.os.RemoteException {}
            public byte[] getSupportedLevels() throws android.os.RemoteException { return null; }
            public void setLevel(byte p0) throws android.os.RemoteException {}
            public byte getLevel() throws android.os.RemoteException { return 0; }
            public boolean isHeadTrackingSupported() throws android.os.RemoteException { return false; }
            public byte[] getSupportedHeadTrackingModes() throws android.os.RemoteException { return null; }
            public void setDesiredHeadTrackingMode(byte p0) throws android.os.RemoteException {}
            public byte getActualHeadTrackingMode() throws android.os.RemoteException { return 0; }
            public void recenterHeadTracker() throws android.os.RemoteException {}
            public void setGlobalTransform(float[] p0) throws android.os.RemoteException {}
            public void setHeadSensor(int p0) throws android.os.RemoteException {}
            public void setScreenSensor(int p0) throws android.os.RemoteException {}
            public void setDisplayOrientation(float p0) throws android.os.RemoteException {}
            public void setHingeAngle(float p0) throws android.os.RemoteException {}
            public void setFoldState(boolean p0) throws android.os.RemoteException {}
            public byte[] getSupportedModes() throws android.os.RemoteException { return null; }
            public void registerHeadTrackingCallback(android.media.ISpatializerHeadTrackingCallback p0) throws android.os.RemoteException {}
            public void setParameter(int p0, byte[] p1) throws android.os.RemoteException {}
            public void getParameter(int p0, byte[] p1) throws android.os.RemoteException {}
            public int getOutput() throws android.os.RemoteException { return 0; }
        }
    }
}

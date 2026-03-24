package android.hardware.display;

public interface IColorDisplayManager extends android.os.IInterface {
    public boolean isDeviceColorManaged() throws android.os.RemoteException;
    public boolean setSaturationLevel(int p0) throws android.os.RemoteException;
    public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isSaturationActivated() throws android.os.RemoteException;
    public int getTransformCapabilities() throws android.os.RemoteException;
    public boolean isNightDisplayActivated() throws android.os.RemoteException;
    public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException;
    public int getNightDisplayColorTemperature() throws android.os.RemoteException;
    public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException;
    public int getNightDisplayAutoMode() throws android.os.RemoteException;
    public int getNightDisplayAutoModeRaw() throws android.os.RemoteException;
    public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException;
    public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException;
    public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException;
    public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException;
    public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException;
    public int getColorMode() throws android.os.RemoteException;
    public void setColorMode(int p0) throws android.os.RemoteException;
    public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException;
    public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IColorDisplayManager {
        private static final java.lang.String DESCRIPTOR = "android.hardware.display.IColorDisplayManager";
        static final int TRANSACTION_isDeviceColorManaged = 1;
        static final int TRANSACTION_setSaturationLevel = 2;
        static final int TRANSACTION_setAppSaturationLevel = 3;
        static final int TRANSACTION_isSaturationActivated = 4;
        static final int TRANSACTION_getTransformCapabilities = 5;
        static final int TRANSACTION_isNightDisplayActivated = 6;
        static final int TRANSACTION_setNightDisplayActivated = 7;
        static final int TRANSACTION_getNightDisplayColorTemperature = 8;
        static final int TRANSACTION_setNightDisplayColorTemperature = 9;
        static final int TRANSACTION_getNightDisplayAutoMode = 10;
        static final int TRANSACTION_getNightDisplayAutoModeRaw = 11;
        static final int TRANSACTION_setNightDisplayAutoMode = 12;
        static final int TRANSACTION_getNightDisplayCustomStartTime = 13;
        static final int TRANSACTION_setNightDisplayCustomStartTime = 14;
        static final int TRANSACTION_getNightDisplayCustomEndTime = 15;
        static final int TRANSACTION_setNightDisplayCustomEndTime = 16;
        static final int TRANSACTION_getColorMode = 17;
        static final int TRANSACTION_setColorMode = 18;
        static final int TRANSACTION_isDisplayWhiteBalanceEnabled = 19;
        static final int TRANSACTION_setDisplayWhiteBalanceEnabled = 20;
        public Stub() { super(); }
        public static android.hardware.display.IColorDisplayManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.display.IColorDisplayManager p0) { return false; }
        public static android.hardware.display.IColorDisplayManager getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.display.IColorDisplayManager {
            private android.os.IBinder mRemote;
            public static android.hardware.display.IColorDisplayManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isDeviceColorManaged() throws android.os.RemoteException { return false; }
            public boolean setSaturationLevel(int p0) throws android.os.RemoteException { return false; }
            public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public boolean isSaturationActivated() throws android.os.RemoteException { return false; }
            public int getTransformCapabilities() throws android.os.RemoteException { return 0; }
            public boolean isNightDisplayActivated() throws android.os.RemoteException { return false; }
            public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException { return false; }
            public int getNightDisplayColorTemperature() throws android.os.RemoteException { return 0; }
            public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException { return false; }
            public int getNightDisplayAutoMode() throws android.os.RemoteException { return 0; }
            public int getNightDisplayAutoModeRaw() throws android.os.RemoteException { return 0; }
            public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException { return false; }
            public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException { return null; }
            public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
            public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException { return null; }
            public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
            public int getColorMode() throws android.os.RemoteException { return 0; }
            public void setColorMode(int p0) throws android.os.RemoteException {}
            public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException { return false; }
            public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException { return false; }
        }
    }

    public static class Default implements android.hardware.display.IColorDisplayManager {
        public Default() {}
        public boolean isDeviceColorManaged() throws android.os.RemoteException { return false; }
        public boolean setSaturationLevel(int p0) throws android.os.RemoteException { return false; }
        public boolean setAppSaturationLevel(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public boolean isSaturationActivated() throws android.os.RemoteException { return false; }
        public int getTransformCapabilities() throws android.os.RemoteException { return 0; }
        public boolean isNightDisplayActivated() throws android.os.RemoteException { return false; }
        public boolean setNightDisplayActivated(boolean p0) throws android.os.RemoteException { return false; }
        public int getNightDisplayColorTemperature() throws android.os.RemoteException { return 0; }
        public boolean setNightDisplayColorTemperature(int p0) throws android.os.RemoteException { return false; }
        public int getNightDisplayAutoMode() throws android.os.RemoteException { return 0; }
        public int getNightDisplayAutoModeRaw() throws android.os.RemoteException { return 0; }
        public boolean setNightDisplayAutoMode(int p0) throws android.os.RemoteException { return false; }
        public android.hardware.display.Time getNightDisplayCustomStartTime() throws android.os.RemoteException { return null; }
        public boolean setNightDisplayCustomStartTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
        public android.hardware.display.Time getNightDisplayCustomEndTime() throws android.os.RemoteException { return null; }
        public boolean setNightDisplayCustomEndTime(android.hardware.display.Time p0) throws android.os.RemoteException { return false; }
        public int getColorMode() throws android.os.RemoteException { return 0; }
        public void setColorMode(int p0) throws android.os.RemoteException {}
        public boolean isDisplayWhiteBalanceEnabled() throws android.os.RemoteException { return false; }
        public boolean setDisplayWhiteBalanceEnabled(boolean p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }
}

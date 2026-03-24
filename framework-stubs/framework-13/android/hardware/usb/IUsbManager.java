package android.hardware.usb;

public interface IUsbManager extends android.os.IInterface {
    public void getDeviceList(android.os.Bundle p0) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openDevice(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public android.hardware.usb.UsbAccessory getCurrentAccessory() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException;
    public void setDevicePackage(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setAccessoryPackage(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void addDevicePackagesToPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void addAccessoryPackagesToPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void removeDevicePackagesFromPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void removeAccessoryPackagesFromPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException;
    public void setDevicePersistentPermission(android.hardware.usb.UsbDevice p0, int p1, android.os.UserHandle p2, boolean p3) throws android.os.RemoteException;
    public void setAccessoryPersistentPermission(android.hardware.usb.UsbAccessory p0, int p1, android.os.UserHandle p2, boolean p3) throws android.os.RemoteException;
    public boolean hasDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException;
    public void requestDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public void requestAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException;
    public void grantDevicePermission(android.hardware.usb.UsbDevice p0, int p1) throws android.os.RemoteException;
    public void grantAccessoryPermission(android.hardware.usb.UsbAccessory p0, int p1) throws android.os.RemoteException;
    public boolean hasDefaults(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void clearDefaults(java.lang.String p0, int p1) throws android.os.RemoteException;
    public boolean isFunctionEnabled(java.lang.String p0) throws android.os.RemoteException;
    public void setCurrentFunctions(long p0) throws android.os.RemoteException;
    public void setCurrentFunction(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public long getCurrentFunctions() throws android.os.RemoteException;
    public int getCurrentUsbSpeed() throws android.os.RemoteException;
    public int getGadgetHalVersion() throws android.os.RemoteException;
    public void setScreenUnlockedFunctions(long p0) throws android.os.RemoteException;
    public long getScreenUnlockedFunctions() throws android.os.RemoteException;
    public void resetUsbGadget() throws android.os.RemoteException;
    public void resetUsbPort(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException;
    public boolean enableUsbData(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException;
    public void enableUsbDataWhileDocked(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException;
    public int getUsbHalVersion() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getControlFd(long p0) throws android.os.RemoteException;
    public java.util.List<android.hardware.usb.ParcelableUsbPort> getPorts() throws android.os.RemoteException;
    public android.hardware.usb.UsbPortStatus getPortStatus(java.lang.String p0) throws android.os.RemoteException;
    public void setPortRoles(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public void enableLimitPowerTransfer(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException;
    public void enableContaminantDetection(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.usb.IUsbManager {
        public Default() {}
        public void getDeviceList(android.os.Bundle p0) throws android.os.RemoteException {}
        public android.os.ParcelFileDescriptor openDevice(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.hardware.usb.UsbAccessory getCurrentAccessory() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException { return null; }
        public void setDevicePackage(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setAccessoryPackage(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void addDevicePackagesToPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void addAccessoryPackagesToPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void removeDevicePackagesFromPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void removeAccessoryPackagesFromPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
        public void setDevicePersistentPermission(android.hardware.usb.UsbDevice p0, int p1, android.os.UserHandle p2, boolean p3) throws android.os.RemoteException {}
        public void setAccessoryPersistentPermission(android.hardware.usb.UsbAccessory p0, int p1, android.os.UserHandle p2, boolean p3) throws android.os.RemoteException {}
        public boolean hasDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException { return false; }
        public void requestDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
        public void requestAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
        public void grantDevicePermission(android.hardware.usb.UsbDevice p0, int p1) throws android.os.RemoteException {}
        public void grantAccessoryPermission(android.hardware.usb.UsbAccessory p0, int p1) throws android.os.RemoteException {}
        public boolean hasDefaults(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
        public void clearDefaults(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public boolean isFunctionEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void setCurrentFunctions(long p0) throws android.os.RemoteException {}
        public void setCurrentFunction(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public long getCurrentFunctions() throws android.os.RemoteException { return 0L; }
        public int getCurrentUsbSpeed() throws android.os.RemoteException { return 0; }
        public int getGadgetHalVersion() throws android.os.RemoteException { return 0; }
        public void setScreenUnlockedFunctions(long p0) throws android.os.RemoteException {}
        public long getScreenUnlockedFunctions() throws android.os.RemoteException { return 0L; }
        public void resetUsbGadget() throws android.os.RemoteException {}
        public void resetUsbPort(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
        public boolean enableUsbData(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException { return false; }
        public void enableUsbDataWhileDocked(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
        public int getUsbHalVersion() throws android.os.RemoteException { return 0; }
        public android.os.ParcelFileDescriptor getControlFd(long p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.hardware.usb.ParcelableUsbPort> getPorts() throws android.os.RemoteException { return null; }
        public android.hardware.usb.UsbPortStatus getPortStatus(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void setPortRoles(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
        public void enableLimitPowerTransfer(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException {}
        public void enableContaminantDetection(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
        public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.usb.IUsbManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.usb.IUsbManager";
        static final int TRANSACTION_getDeviceList = 1;
        static final int TRANSACTION_openDevice = 2;
        static final int TRANSACTION_getCurrentAccessory = 3;
        static final int TRANSACTION_openAccessory = 4;
        static final int TRANSACTION_setDevicePackage = 5;
        static final int TRANSACTION_setAccessoryPackage = 6;
        static final int TRANSACTION_addDevicePackagesToPreferenceDenied = 7;
        static final int TRANSACTION_addAccessoryPackagesToPreferenceDenied = 8;
        static final int TRANSACTION_removeDevicePackagesFromPreferenceDenied = 9;
        static final int TRANSACTION_removeAccessoryPackagesFromPreferenceDenied = 10;
        static final int TRANSACTION_setDevicePersistentPermission = 11;
        static final int TRANSACTION_setAccessoryPersistentPermission = 12;
        static final int TRANSACTION_hasDevicePermission = 13;
        static final int TRANSACTION_hasAccessoryPermission = 14;
        static final int TRANSACTION_requestDevicePermission = 15;
        static final int TRANSACTION_requestAccessoryPermission = 16;
        static final int TRANSACTION_grantDevicePermission = 17;
        static final int TRANSACTION_grantAccessoryPermission = 18;
        static final int TRANSACTION_hasDefaults = 19;
        static final int TRANSACTION_clearDefaults = 20;
        static final int TRANSACTION_isFunctionEnabled = 21;
        static final int TRANSACTION_setCurrentFunctions = 22;
        static final int TRANSACTION_setCurrentFunction = 23;
        static final int TRANSACTION_getCurrentFunctions = 24;
        static final int TRANSACTION_getCurrentUsbSpeed = 25;
        static final int TRANSACTION_getGadgetHalVersion = 26;
        static final int TRANSACTION_setScreenUnlockedFunctions = 27;
        static final int TRANSACTION_getScreenUnlockedFunctions = 28;
        static final int TRANSACTION_resetUsbGadget = 29;
        static final int TRANSACTION_resetUsbPort = 30;
        static final int TRANSACTION_enableUsbData = 31;
        static final int TRANSACTION_enableUsbDataWhileDocked = 32;
        static final int TRANSACTION_getUsbHalVersion = 33;
        static final int TRANSACTION_getControlFd = 34;
        static final int TRANSACTION_getPorts = 35;
        static final int TRANSACTION_getPortStatus = 36;
        static final int TRANSACTION_setPortRoles = 37;
        static final int TRANSACTION_enableLimitPowerTransfer = 38;
        static final int TRANSACTION_enableContaminantDetection = 39;
        static final int TRANSACTION_setUsbDeviceConnectionHandler = 40;
        public Stub() { super(); }
        public static android.hardware.usb.IUsbManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.usb.IUsbManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getDeviceList(android.os.Bundle p0) throws android.os.RemoteException {}
            public android.os.ParcelFileDescriptor openDevice(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.hardware.usb.UsbAccessory getCurrentAccessory() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openAccessory(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException { return null; }
            public void setDevicePackage(android.hardware.usb.UsbDevice p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setAccessoryPackage(android.hardware.usb.UsbAccessory p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void addDevicePackagesToPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void addAccessoryPackagesToPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void removeDevicePackagesFromPreferenceDenied(android.hardware.usb.UsbDevice p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void removeAccessoryPackagesFromPreferenceDenied(android.hardware.usb.UsbAccessory p0, java.lang.String[] p1, android.os.UserHandle p2) throws android.os.RemoteException {}
            public void setDevicePersistentPermission(android.hardware.usb.UsbDevice p0, int p1, android.os.UserHandle p2, boolean p3) throws android.os.RemoteException {}
            public void setAccessoryPersistentPermission(android.hardware.usb.UsbAccessory p0, int p1, android.os.UserHandle p2, boolean p3) throws android.os.RemoteException {}
            public boolean hasDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean hasAccessoryPermission(android.hardware.usb.UsbAccessory p0) throws android.os.RemoteException { return false; }
            public void requestDevicePermission(android.hardware.usb.UsbDevice p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
            public void requestAccessoryPermission(android.hardware.usb.UsbAccessory p0, java.lang.String p1, android.app.PendingIntent p2) throws android.os.RemoteException {}
            public void grantDevicePermission(android.hardware.usb.UsbDevice p0, int p1) throws android.os.RemoteException {}
            public void grantAccessoryPermission(android.hardware.usb.UsbAccessory p0, int p1) throws android.os.RemoteException {}
            public boolean hasDefaults(java.lang.String p0, int p1) throws android.os.RemoteException { return false; }
            public void clearDefaults(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public boolean isFunctionEnabled(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void setCurrentFunctions(long p0) throws android.os.RemoteException {}
            public void setCurrentFunction(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public long getCurrentFunctions() throws android.os.RemoteException { return 0L; }
            public int getCurrentUsbSpeed() throws android.os.RemoteException { return 0; }
            public int getGadgetHalVersion() throws android.os.RemoteException { return 0; }
            public void setScreenUnlockedFunctions(long p0) throws android.os.RemoteException {}
            public long getScreenUnlockedFunctions() throws android.os.RemoteException { return 0L; }
            public void resetUsbGadget() throws android.os.RemoteException {}
            public void resetUsbPort(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
            public boolean enableUsbData(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException { return false; }
            public void enableUsbDataWhileDocked(java.lang.String p0, int p1, android.hardware.usb.IUsbOperationInternal p2) throws android.os.RemoteException {}
            public int getUsbHalVersion() throws android.os.RemoteException { return 0; }
            public android.os.ParcelFileDescriptor getControlFd(long p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.hardware.usb.ParcelableUsbPort> getPorts() throws android.os.RemoteException { return null; }
            public android.hardware.usb.UsbPortStatus getPortStatus(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void setPortRoles(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
            public void enableLimitPowerTransfer(java.lang.String p0, boolean p1, int p2, android.hardware.usb.IUsbOperationInternal p3) throws android.os.RemoteException {}
            public void enableContaminantDetection(java.lang.String p0, boolean p1) throws android.os.RemoteException {}
            public void setUsbDeviceConnectionHandler(android.content.ComponentName p0) throws android.os.RemoteException {}
        }
    }
}

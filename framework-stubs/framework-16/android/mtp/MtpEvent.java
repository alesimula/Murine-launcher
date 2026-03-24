package android.mtp;

public class MtpEvent {
    public static final int EVENT_UNDEFINED = 16384;
    public static final int EVENT_CANCEL_TRANSACTION = 16385;
    public static final int EVENT_OBJECT_ADDED = 16386;
    public static final int EVENT_OBJECT_REMOVED = 16387;
    public static final int EVENT_STORE_ADDED = 16388;
    public static final int EVENT_STORE_REMOVED = 16389;
    public static final int EVENT_DEVICE_PROP_CHANGED = 16390;
    public static final int EVENT_OBJECT_INFO_CHANGED = 16391;
    public static final int EVENT_DEVICE_INFO_CHANGED = 16392;
    public static final int EVENT_REQUEST_OBJECT_TRANSFER = 16393;
    public static final int EVENT_STORE_FULL = 16394;
    public static final int EVENT_DEVICE_RESET = 16395;
    public static final int EVENT_STORAGE_INFO_CHANGED = 16396;
    public static final int EVENT_CAPTURE_COMPLETE = 16397;
    public static final int EVENT_UNREPORTED_STATUS = 16398;
    public static final int EVENT_OBJECT_PROP_CHANGED = 51201;
    public static final int EVENT_OBJECT_PROP_DESC_CHANGED = 51202;
    public static final int EVENT_OBJECT_REFERENCES_CHANGED = 51203;
    public int getEventCode() { return 0; }
    public int getParameter1() { return 0; }
    public int getParameter2() { return 0; }
    public int getParameter3() { return 0; }
    public int getObjectHandle() { return 0; }
    public int getStorageId() { return 0; }
    public int getDevicePropCode() { return 0; }
    public int getTransactionId() { return 0; }
    public int getObjectPropCode() { return 0; }
    public int getObjectFormatCode() { return 0; }

    private static class IllegalParameterAccess extends java.lang.UnsupportedOperationException {
        public IllegalParameterAccess(java.lang.String p0, int p1) { super(); }
    }
}

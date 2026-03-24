package android.service;

public final class ServiceProtoEnums {
    public static final int USB_ENDPOINT_TYPE_XFER_CONTROL = 0;
    public static final int USB_ENDPOINT_TYPE_XFER_ISOC = 1;
    public static final int USB_ENDPOINT_TYPE_XFER_BULK = 2;
    public static final int USB_ENDPOINT_TYPE_XFER_INT = 3;
    public static final int USB_ENDPOINT_DIR_OUT = 0;
    public static final int USB_ENDPOINT_DIR_IN = 128;
    public static final int USB_CONNECTION_RECORD_MODE_CONNECT = 0;
    public static final int USB_CONNECTION_RECORD_MODE_CONNECT_BADPARSE = 1;
    public static final int USB_CONNECTION_RECORD_MODE_CONNECT_BADDEVICE = 2;
    public static final int USB_CONNECTION_RECORD_MODE_DISCONNECT = -1;
    public static final int CONTAMINANT_STATUS_UNKNOWN = 0;
    public static final int CONTAMINANT_STATUS_NOT_SUPPORTED = 1;
    public static final int CONTAMINANT_STATUS_DISABLED = 2;
    public static final int CONTAMINANT_STATUS_NOT_DETECTED = 3;
    public static final int CONTAMINANT_STATUS_DETECTED = 4;
    public static final int COMPLIANCE_WARNING_UNSPECIFIED = 0;
    public static final int COMPLIANCE_WARNING_DEBUG_ACCESSORY = 1;
    public static final int COMPLIANCE_WARNING_BC_1_2 = 2;
    public static final int COMPLIANCE_WARNING_MISSING_RP = 3;
    public static final int COMPLIANCE_WARNING_OTHER = 4;
    public static final int COMPLIANCE_WARNING_INPUT_POWER_LIMITED = 5;
    public static final int COMPLIANCE_WARNING_MISSING_DATA_LINES = 6;
    public static final int COMPLIANCE_WARNING_ENUMERATION_FAIL = 7;
    public static final int COMPLIANCE_WARNING_FLAKY_CONNECTION = 8;
    public static final int COMPLIANCE_WARNING_UNRELIABLE_IO = 9;
    public ServiceProtoEnums() {}
}

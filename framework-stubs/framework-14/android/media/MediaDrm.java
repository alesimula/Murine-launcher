package android.media;

public final class MediaDrm implements java.lang.AutoCloseable {
    public static final int CERTIFICATE_TYPE_NONE = 0;
    public static final int CERTIFICATE_TYPE_X509 = 1;
    public static final int EVENT_PROVISION_REQUIRED = 1;
    public static final int EVENT_KEY_REQUIRED = 2;
    public static final int EVENT_KEY_EXPIRED = 3;
    public static final int EVENT_VENDOR_DEFINED = 4;
    public static final int EVENT_SESSION_RECLAIMED = 5;
    public static final int KEY_TYPE_STREAMING = 1;
    public static final int KEY_TYPE_OFFLINE = 2;
    public static final int KEY_TYPE_RELEASE = 3;
    public static final int OFFLINE_LICENSE_STATE_UNKNOWN = 0;
    public static final int OFFLINE_LICENSE_STATE_USABLE = 1;
    public static final int OFFLINE_LICENSE_STATE_RELEASED = 2;
    public static final int HDCP_LEVEL_UNKNOWN = 0;
    public static final int HDCP_NONE = 1;
    public static final int HDCP_V1 = 2;
    public static final int HDCP_V2 = 3;
    public static final int HDCP_V2_1 = 4;
    public static final int HDCP_V2_2 = 5;
    public static final int HDCP_V2_3 = 6;
    public static final int HDCP_NO_DIGITAL_OUTPUT = 2147483647;
    public static final int SECURITY_LEVEL_UNKNOWN = 0;
    public static final int SECURITY_LEVEL_SW_SECURE_CRYPTO = 1;
    public static final int SECURITY_LEVEL_SW_SECURE_DECODE = 2;
    public static final int SECURITY_LEVEL_HW_SECURE_CRYPTO = 3;
    public static final int SECURITY_LEVEL_HW_SECURE_DECODE = 4;
    public static final int SECURITY_LEVEL_HW_SECURE_ALL = 5;
    public static final int SECURITY_LEVEL_MAX = 6;
    public static final java.lang.String PROPERTY_VENDOR = "vendor";
    public static final java.lang.String PROPERTY_VERSION = "version";
    public static final java.lang.String PROPERTY_DESCRIPTION = "description";
    public static final java.lang.String PROPERTY_ALGORITHMS = "algorithms";
    public static final java.lang.String PROPERTY_DEVICE_UNIQUE_ID = "deviceUniqueId";
    public static final boolean isCryptoSchemeSupported(java.util.UUID p0) { return false; }
    public static final boolean isCryptoSchemeSupported(java.util.UUID p0, java.lang.String p1) { return false; }
    public static final boolean isCryptoSchemeSupported(java.util.UUID p0, java.lang.String p1, int p2) { return false; }
    public static final java.util.List<java.util.UUID> getSupportedCryptoSchemes() { return null; }
    public MediaDrm(java.util.UUID p0) throws android.media.UnsupportedSchemeException {}
    public void setOnExpirationUpdateListener(android.media.MediaDrm.OnExpirationUpdateListener p0, android.os.Handler p1) {}
    public void setOnExpirationUpdateListener(java.util.concurrent.Executor p0, android.media.MediaDrm.OnExpirationUpdateListener p1) {}
    public void clearOnExpirationUpdateListener() {}
    public void setOnKeyStatusChangeListener(android.media.MediaDrm.OnKeyStatusChangeListener p0, android.os.Handler p1) {}
    public void setOnKeyStatusChangeListener(java.util.concurrent.Executor p0, android.media.MediaDrm.OnKeyStatusChangeListener p1) {}
    public void clearOnKeyStatusChangeListener() {}
    public void setOnSessionLostStateListener(android.media.MediaDrm.OnSessionLostStateListener p0, android.os.Handler p1) {}
    public void setOnSessionLostStateListener(java.util.concurrent.Executor p0, android.media.MediaDrm.OnSessionLostStateListener p1) {}
    public void clearOnSessionLostStateListener() {}
    public void setOnEventListener(android.media.MediaDrm.OnEventListener p0) {}
    public void setOnEventListener(android.media.MediaDrm.OnEventListener p0, android.os.Handler p1) {}
    public void setOnEventListener(java.util.concurrent.Executor p0, android.media.MediaDrm.OnEventListener p1) {}
    public void clearOnEventListener() {}
    public byte[] openSession() throws android.media.NotProvisionedException, android.media.ResourceBusyException { return null; }
    public byte[] openSession(int p0) throws android.media.NotProvisionedException, android.media.ResourceBusyException { return null; }
    public void closeSession(byte[] p0) {}
    public android.media.MediaDrm.KeyRequest getKeyRequest(byte[] p0, byte[] p1, java.lang.String p2, int p3, java.util.HashMap<java.lang.String, java.lang.String> p4) throws android.media.NotProvisionedException { return null; }
    public native byte[] provideKeyResponse(byte[] p0, byte[] p1) throws android.media.NotProvisionedException, android.media.DeniedByServerException;
    public native void restoreKeys(byte[] p0, byte[] p1);
    public native void removeKeys(byte[] p0);
    public native java.util.HashMap<java.lang.String, java.lang.String> queryKeyStatus(byte[] p0);
    public android.media.MediaDrm.ProvisionRequest getProvisionRequest() { return null; }
    public void provideProvisionResponse(byte[] p0) throws android.media.DeniedByServerException {}
    public native java.util.List<byte[]> getOfflineLicenseKeySetIds();
    public native void removeOfflineLicense(byte[] p0);
    public native int getOfflineLicenseState(byte[] p0);
    public native java.util.List<byte[]> getSecureStops();
    public native java.util.List<byte[]> getSecureStopIds();
    public native byte[] getSecureStop(byte[] p0);
    public native void releaseSecureStops(byte[] p0);
    public native void removeSecureStop(byte[] p0);
    public native void removeAllSecureStops();
    public void releaseAllSecureStops() {}
    public native int getConnectedHdcpLevel();
    public native int getMaxHdcpLevel();
    public native int getOpenSessionCount();
    public native int getMaxSessionCount();
    public static final int getMaxSecurityLevel() { return 0; }
    public native int getSecurityLevel(byte[] p0);
    public native java.lang.String getPropertyString(java.lang.String p0);
    public native void setPropertyString(java.lang.String p0, java.lang.String p1);
    public native byte[] getPropertyByteArray(java.lang.String p0);
    public native void setPropertyByteArray(java.lang.String p0, byte[] p1);
    public android.os.PersistableBundle getMetrics() { return null; }
    public android.media.MediaDrm.CryptoSession getCryptoSession(byte[] p0, java.lang.String p1, java.lang.String p2) { return null; }
    public android.media.MediaDrm.CertificateRequest getCertificateRequest(int p0, java.lang.String p1) { return null; }
    public android.media.MediaDrm.Certificate provideCertificateResponse(byte[] p0) throws android.media.DeniedByServerException { return null; }
    public byte[] signRSA(byte[] p0, java.lang.String p1, byte[] p2, byte[] p3) { return null; }
    public boolean requiresSecureDecoder(java.lang.String p0) { return false; }
    public native boolean requiresSecureDecoder(java.lang.String p0, int p1);
    protected void finalize() throws java.lang.Throwable {}
    public void close() {}
    @java.lang.Deprecated
    public void release() {}
    public final native void native_release();
    public android.media.MediaDrm.PlaybackComponent getPlaybackComponent(byte[] p0) { return null; }
    public native java.util.List<android.media.MediaDrm.LogMessage> getLogMessages();

    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HdcpLevel {
    }

    public static interface OnExpirationUpdateListener {
        public void onExpirationUpdate(android.media.MediaDrm p0, byte[] p1, long p2);
    }

    public static final class LogMessage {
        public final long getTimestampMillis() { return 0L; }
        public final int getPriority() { return 0; }
        public final java.lang.String getMessage() { return null; }
        public java.lang.String toString() { return null; }
    }

    public static interface OnSessionLostStateListener {
        public void onSessionLostState(android.media.MediaDrm p0, byte[] p1);
    }

    @java.lang.Deprecated
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityLevel {
    }

    public static final class SessionException extends java.lang.RuntimeException implements android.media.MediaDrmThrowable {
        public static final int ERROR_UNKNOWN = 0;
        public static final int ERROR_RESOURCE_CONTENTION = 1;
        public SessionException(int p0, java.lang.String p1) { super(); }
        public SessionException(java.lang.String p0, int p1, int p2, int p3, int p4) { super(); }
        public int getErrorCode() { return 0; }
        public int getVendorError() { return 0; }
        public int getOemError() { return 0; }
        public int getErrorContext() { return 0; }
        public boolean isTransient() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SessionErrorCode {
        }
    }

    public static interface OnEventListener {
        public void onEvent(android.media.MediaDrm p0, byte[] p1, int p2, int p3, byte[] p4);
    }

    public static final class KeyStatus {
        public static final int STATUS_USABLE = 0;
        public static final int STATUS_EXPIRED = 1;
        public static final int STATUS_OUTPUT_NOT_ALLOWED = 2;
        public static final int STATUS_PENDING = 3;
        public static final int STATUS_INTERNAL_ERROR = 4;
        public static final int STATUS_USABLE_IN_FUTURE = 5;
        KeyStatus(byte[] p0, int p1) {}
        public int getStatusCode() { return 0; }
        public byte[] getKeyId() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface KeyStatusCode {
        }
    }

    public static final class ErrorCodes {
        public static final int ERROR_UNKNOWN = 0;
        public static final int ERROR_NO_KEY = 1;
        public static final int ERROR_KEY_EXPIRED = 2;
        public static final int ERROR_RESOURCE_BUSY = 3;
        public static final int ERROR_INSUFFICIENT_OUTPUT_PROTECTION = 4;
        public static final int ERROR_SESSION_NOT_OPENED = 5;
        public static final int ERROR_UNSUPPORTED_OPERATION = 6;
        public static final int ERROR_INSUFFICIENT_SECURITY = 7;
        public static final int ERROR_FRAME_TOO_LARGE = 8;
        public static final int ERROR_LOST_STATE = 9;
        public static final int ERROR_CERTIFICATE_MALFORMED = 10;
        public static final int ERROR_CERTIFICATE_MISSING = 11;
        public static final int ERROR_CRYPTO_LIBRARY = 12;
        public static final int ERROR_GENERIC_OEM = 13;
        public static final int ERROR_GENERIC_PLUGIN = 14;
        public static final int ERROR_INIT_DATA = 15;
        public static final int ERROR_KEY_NOT_LOADED = 16;
        public static final int ERROR_LICENSE_PARSE = 17;
        public static final int ERROR_LICENSE_POLICY = 18;
        public static final int ERROR_LICENSE_RELEASE = 19;
        public static final int ERROR_LICENSE_REQUEST_REJECTED = 20;
        public static final int ERROR_LICENSE_RESTORE = 21;
        public static final int ERROR_LICENSE_STATE = 22;
        public static final int ERROR_MEDIA_FRAMEWORK = 23;
        public static final int ERROR_PROVISIONING_CERTIFICATE = 24;
        public static final int ERROR_PROVISIONING_CONFIG = 25;
        public static final int ERROR_PROVISIONING_PARSE = 26;
        public static final int ERROR_PROVISIONING_REQUEST_REJECTED = 27;
        public static final int ERROR_PROVISIONING_RETRY = 28;
        public static final int ERROR_RESOURCE_CONTENTION = 29;
        public static final int ERROR_SECURE_STOP_RELEASE = 30;
        public static final int ERROR_STORAGE_READ = 31;
        public static final int ERROR_STORAGE_WRITE = 32;
        public static final int ERROR_ZERO_SUBSAMPLES = 33;
    }

    public static final class KeyRequest {
        public static final int REQUEST_TYPE_INITIAL = 0;
        public static final int REQUEST_TYPE_RENEWAL = 1;
        public static final int REQUEST_TYPE_RELEASE = 2;
        public static final int REQUEST_TYPE_NONE = 3;
        public static final int REQUEST_TYPE_UPDATE = 4;
        KeyRequest() {}
        public byte[] getData() { return null; }
        public java.lang.String getDefaultUrl() { return null; }
        public int getRequestType() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RequestType {
        }
    }

    public static final class ProvisionRequest {
        ProvisionRequest() {}
        public byte[] getData() { return null; }
        public java.lang.String getDefaultUrl() { return null; }
    }

    public static final class MetricsConstants {
        public static final java.lang.String OPEN_SESSION_OK_COUNT = "drm.mediadrm.open_session.ok.count";
        public static final java.lang.String OPEN_SESSION_ERROR_COUNT = "drm.mediadrm.open_session.error.count";
        public static final java.lang.String OPEN_SESSION_ERROR_LIST = "drm.mediadrm.open_session.error.list";
        public static final java.lang.String CLOSE_SESSION_OK_COUNT = "drm.mediadrm.close_session.ok.count";
        public static final java.lang.String CLOSE_SESSION_ERROR_COUNT = "drm.mediadrm.close_session.error.count";
        public static final java.lang.String CLOSE_SESSION_ERROR_LIST = "drm.mediadrm.close_session.error.list";
        public static final java.lang.String SESSION_START_TIMES_MS = "drm.mediadrm.session_start_times_ms";
        public static final java.lang.String SESSION_END_TIMES_MS = "drm.mediadrm.session_end_times_ms";
        public static final java.lang.String GET_KEY_REQUEST_OK_COUNT = "drm.mediadrm.get_key_request.ok.count";
        public static final java.lang.String GET_KEY_REQUEST_ERROR_COUNT = "drm.mediadrm.get_key_request.error.count";
        public static final java.lang.String GET_KEY_REQUEST_ERROR_LIST = "drm.mediadrm.get_key_request.error.list";
        public static final java.lang.String GET_KEY_REQUEST_OK_TIME_MICROS = "drm.mediadrm.get_key_request.ok.average_time_micros";
        public static final java.lang.String PROVIDE_KEY_RESPONSE_OK_COUNT = "drm.mediadrm.provide_key_response.ok.count";
        public static final java.lang.String PROVIDE_KEY_RESPONSE_ERROR_COUNT = "drm.mediadrm.provide_key_response.error.count";
        public static final java.lang.String PROVIDE_KEY_RESPONSE_ERROR_LIST = "drm.mediadrm.provide_key_response.error.list";
        public static final java.lang.String PROVIDE_KEY_RESPONSE_OK_TIME_MICROS = "drm.mediadrm.provide_key_response.ok.average_time_micros";
        public static final java.lang.String GET_PROVISION_REQUEST_OK_COUNT = "drm.mediadrm.get_provision_request.ok.count";
        public static final java.lang.String GET_PROVISION_REQUEST_ERROR_COUNT = "drm.mediadrm.get_provision_request.error.count";
        public static final java.lang.String GET_PROVISION_REQUEST_ERROR_LIST = "drm.mediadrm.get_provision_request.error.list";
        public static final java.lang.String PROVIDE_PROVISION_RESPONSE_OK_COUNT = "drm.mediadrm.provide_provision_response.ok.count";
        public static final java.lang.String PROVIDE_PROVISION_RESPONSE_ERROR_COUNT = "drm.mediadrm.provide_provision_response.error.count";
        public static final java.lang.String PROVIDE_PROVISION_RESPONSE_ERROR_LIST = "drm.mediadrm.provide_provision_response.error.list";
        public static final java.lang.String GET_DEVICE_UNIQUE_ID_OK_COUNT = "drm.mediadrm.get_device_unique_id.ok.count";
        public static final java.lang.String GET_DEVICE_UNIQUE_ID_ERROR_COUNT = "drm.mediadrm.get_device_unique_id.error.count";
        public static final java.lang.String GET_DEVICE_UNIQUE_ID_ERROR_LIST = "drm.mediadrm.get_device_unique_id.error.list";
        public static final java.lang.String KEY_STATUS_EXPIRED_COUNT = "drm.mediadrm.key_status.EXPIRED.count";
        public static final java.lang.String KEY_STATUS_INTERNAL_ERROR_COUNT = "drm.mediadrm.key_status.INTERNAL_ERROR.count";
        public static final java.lang.String KEY_STATUS_OUTPUT_NOT_ALLOWED_COUNT = "drm.mediadrm.key_status_change.OUTPUT_NOT_ALLOWED.count";
        public static final java.lang.String KEY_STATUS_PENDING_COUNT = "drm.mediadrm.key_status_change.PENDING.count";
        public static final java.lang.String KEY_STATUS_USABLE_COUNT = "drm.mediadrm.key_status_change.USABLE.count";
        public static final java.lang.String EVENT_PROVISION_REQUIRED_COUNT = "drm.mediadrm.event.PROVISION_REQUIRED.count";
        public static final java.lang.String EVENT_KEY_NEEDED_COUNT = "drm.mediadrm.event.KEY_NEEDED.count";
        public static final java.lang.String EVENT_KEY_EXPIRED_COUNT = "drm.mediadrm.event.KEY_EXPIRED.count";
        public static final java.lang.String EVENT_VENDOR_DEFINED_COUNT = "drm.mediadrm.event.VENDOR_DEFINED.count";
        public static final java.lang.String EVENT_SESSION_RECLAIMED_COUNT = "drm.mediadrm.event.SESSION_RECLAIMED.count";
    }

    public final class CryptoSession {
        CryptoSession(android.media.MediaDrm p0, byte[] p1, java.lang.String p2, java.lang.String p3) {}
        public byte[] encrypt(byte[] p0, byte[] p1, byte[] p2) { return null; }
        public byte[] decrypt(byte[] p0, byte[] p1, byte[] p2) { return null; }
        public byte[] sign(byte[] p0, byte[] p1) { return null; }
        public boolean verify(byte[] p0, byte[] p1, byte[] p2) { return false; }
    }

    public final class PlaybackComponent {
        public PlaybackComponent(android.media.MediaDrm p0, byte[] p1) {}
        public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
        public android.media.metrics.LogSessionId getLogSessionId() { return null; }
    }

    public static interface OnKeyStatusChangeListener {
        public void onKeyStatusChange(android.media.MediaDrm p0, byte[] p1, java.util.List<android.media.MediaDrm.KeyStatus> p2, boolean p3);
    }

    public static final class MediaDrmStateException extends java.lang.IllegalStateException implements android.media.MediaDrmThrowable {
        public MediaDrmStateException(int p0, java.lang.String p1) { super(); }
        public MediaDrmStateException(java.lang.String p0, int p1, int p2, int p3, int p4) { super(); }
        public int getErrorCode() { return 0; }
        public int getVendorError() { return 0; }
        public int getOemError() { return 0; }
        public int getErrorContext() { return 0; }
        public boolean isTransient() { return false; }
        public java.lang.String getDiagnosticInfo() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ArrayProperty {
    }

    public static final class Certificate {
        Certificate() {}
        public byte[] getWrappedPrivateKey() { return null; }
        public byte[] getContent() { return null; }
    }

    public static final class CertificateRequest {
        CertificateRequest(byte[] p0, java.lang.String p1) {}
        public byte[] getData() { return null; }
        public java.lang.String getDefaultUrl() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CertificateType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DrmEvent {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyType {
    }

    private static class ListenerArgs {
        public ListenerArgs(int p0, int p1, byte[] p2, byte[] p3, long p4, java.util.List<android.media.MediaDrm.KeyStatus> p5, boolean p6) {}
    }

    private static class ListenerWithExecutor {
        public ListenerWithExecutor(java.util.concurrent.Executor p0, java.util.function.Consumer<android.media.MediaDrm.ListenerArgs> p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MediaDrmErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OfflineLicenseState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StringProperty {
    }
}

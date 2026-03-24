package android.os;

@android.annotation.SystemApi
public class UpdateEngine {
    public UpdateEngine() {}
    public boolean bind(android.os.UpdateEngineCallback p0, android.os.Handler p1) { return false; }
    public boolean bind(android.os.UpdateEngineCallback p0) { return false; }
    public void applyPayload(java.lang.String p0, long p1, long p2, java.lang.String[] p3) {}
    public void applyPayload(android.content.res.AssetFileDescriptor p0, java.lang.String[] p1) {}
    public void cancel() {}
    public void suspend() {}
    public void resume() {}
    public void resetStatus() {}
    public void setShouldSwitchSlotOnReboot(java.lang.String p0) {}
    public void resetShouldSwitchSlotOnReboot() {}
    public boolean unbind() { return false; }
    public boolean verifyPayloadMetadata(java.lang.String p0) { return false; }
    public android.os.UpdateEngine.AllocateSpaceResult allocateSpace(java.lang.String p0, java.lang.String[] p1) { return null; }
    @android.os.UpdateEngine.ErrorCode
    public int cleanupAppliedPayload() { return 0; }

    public static final class AllocateSpaceResult {
        @android.os.UpdateEngine.ErrorCode
        public int getErrorCode() { return 0; }
        public long getFreeSpaceRequired() { return 0L; }
    }

    private static class CleanupAppliedPayloadCallback extends android.os.IUpdateEngineCallback.Stub {
        public void onStatusUpdate(int p0, float p1) {}
        public void onPayloadApplicationComplete(int p0) {}
    }

    public static @interface ErrorCode {
    }

    public static final class ErrorCodeConstants {
        public static final int SUCCESS = 0;
        public static final int ERROR = 1;
        public static final int FILESYSTEM_COPIER_ERROR = 4;
        public static final int POST_INSTALL_RUNNER_ERROR = 5;
        public static final int PAYLOAD_MISMATCHED_TYPE_ERROR = 6;
        public static final int INSTALL_DEVICE_OPEN_ERROR = 7;
        public static final int KERNEL_DEVICE_OPEN_ERROR = 8;
        public static final int DOWNLOAD_TRANSFER_ERROR = 9;
        public static final int PAYLOAD_HASH_MISMATCH_ERROR = 10;
        public static final int PAYLOAD_SIZE_MISMATCH_ERROR = 11;
        public static final int DOWNLOAD_PAYLOAD_VERIFICATION_ERROR = 12;
        public static final int PAYLOAD_TIMESTAMP_ERROR = 51;
        public static final int UPDATED_BUT_NOT_ACTIVE = 52;
        public static final int NOT_ENOUGH_SPACE = 60;
        public static final int DEVICE_CORRUPTED = 61;
        public ErrorCodeConstants() {}
    }

    public static final class UpdateStatusConstants {
        public static final int IDLE = 0;
        public static final int CHECKING_FOR_UPDATE = 1;
        public static final int UPDATE_AVAILABLE = 2;
        public static final int DOWNLOADING = 3;
        public static final int VERIFYING = 4;
        public static final int FINALIZING = 5;
        public static final int UPDATED_NEED_REBOOT = 6;
        public static final int REPORTING_ERROR_EVENT = 7;
        public static final int ATTEMPTING_ROLLBACK = 8;
        public static final int DISABLED = 9;
        public UpdateStatusConstants() {}
    }
}

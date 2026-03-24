package android.app;

public class RemoteServiceException extends android.util.AndroidRuntimeException {
    public RemoteServiceException(java.lang.String p0) { super(); }
    public RemoteServiceException(java.lang.String p0, java.lang.Throwable p1) { super(); }

    public static class BadForegroundServiceNotificationException extends android.app.RemoteServiceException {
        public static final int TYPE_ID = 3;
        public BadForegroundServiceNotificationException(java.lang.String p0) { super((java.lang.String)null); }
    }

    public static class CannotDeliverBroadcastException extends android.app.RemoteServiceException {
        public static final int TYPE_ID = 2;
        public CannotDeliverBroadcastException(java.lang.String p0) { super((java.lang.String)null); }
    }

    public static class CannotPostForegroundServiceNotificationException extends android.app.RemoteServiceException {
        public static final int TYPE_ID = 2;
        public CannotPostForegroundServiceNotificationException(java.lang.String p0) { super((java.lang.String)null); }
    }

    public static class CrashedByAdbException extends android.app.RemoteServiceException {
        public static final int TYPE_ID = 5;
        public CrashedByAdbException(java.lang.String p0) { super((java.lang.String)null); }
    }

    public static class ForegroundServiceDidNotStartInTimeException extends android.app.RemoteServiceException {
        public static final int TYPE_ID = 1;
        public ForegroundServiceDidNotStartInTimeException(java.lang.String p0, java.lang.Throwable p1) { super((java.lang.String)null); }
        public static android.os.Bundle createExtrasForService(android.content.ComponentName p0) { return null; }
        public static java.lang.String getServiceClassNameFromExtras(android.os.Bundle p0) { return null; }
    }

    public static class MissingRequestPasswordComplexityPermissionException extends android.app.RemoteServiceException {
        public static final int TYPE_ID = 4;
        public MissingRequestPasswordComplexityPermissionException(java.lang.String p0) { super((java.lang.String)null); }
    }
}

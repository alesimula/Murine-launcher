package android.service.tracing;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public class TraceReportService extends android.app.Service {
    public static final int MSG_REPORT_TRACE = 1;
    public TraceReportService() { super(); }
    public void onReportTrace(android.service.tracing.TraceReportService.TraceParams p0) {}
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }

    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public static final class TraceParams {
        @android.annotation.NonNull
        public android.os.ParcelFileDescriptor getFd() { return null; }
        @android.annotation.NonNull
        public java.util.UUID getUuid() { return null; }
    }
}

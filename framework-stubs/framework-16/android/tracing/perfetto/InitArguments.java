package android.tracing.perfetto;

public class InitArguments {
    public final int backends = 0;
    public final int shmemSizeHintKb = 0;
    public static final int PERFETTO_BACKEND_IN_PROCESS = 1;
    public static final int PERFETTO_BACKEND_SYSTEM = 2;
    public static android.tracing.perfetto.InitArguments DEFAULTS;
    public static android.tracing.perfetto.InitArguments TESTING;
    public InitArguments(int p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PerfettoBackend {
    }
}

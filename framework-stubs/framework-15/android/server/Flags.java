package android.server;

public final class Flags {
    public static final java.lang.String FLAG_REMOVE_TEXT_SERVICE = "android.server.remove_text_service";
    public static final java.lang.String FLAG_TELEMETRY_APIS_SERVICE = "android.server.telemetry_apis_service";
    public Flags() {}
    public static boolean removeTextService() { return false; }
    public static boolean telemetryApisService() { return false; }
}

package com.android.server;

public class AppWidgetBackupBridge {
    private static com.android.server.WidgetBackupProvider sAppWidgetService;
    public AppWidgetBackupBridge() {}
    public static void register(com.android.server.WidgetBackupProvider p0) {}
    public static java.util.List<java.lang.String> getWidgetParticipants(int p0) { return null; }
    public static byte[] getWidgetState(java.lang.String p0, int p1) { return null; }
    public static void systemRestoreStarting(int p0) {}
    public static void restoreWidgetState(java.lang.String p0, byte[] p1, int p2) {}
    public static void systemRestoreFinished(int p0) {}
}

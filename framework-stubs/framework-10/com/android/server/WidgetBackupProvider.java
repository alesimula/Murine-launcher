package com.android.server;

public interface WidgetBackupProvider {
    public java.util.List<java.lang.String> getWidgetParticipants(int p0);
    public byte[] getWidgetState(java.lang.String p0, int p1);
    public void restoreStarting(int p0);
    public void restoreWidgetState(java.lang.String p0, byte[] p1, int p2);
    public void restoreFinished(int p0);
}

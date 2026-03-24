package android.telecom;

public interface CallControlCallback {
    public void onSetActive(java.util.function.Consumer<java.lang.Boolean> p0);
    public void onSetInactive(java.util.function.Consumer<java.lang.Boolean> p0);
    public void onAnswer(int p0, java.util.function.Consumer<java.lang.Boolean> p1);
    public void onDisconnect(android.telecom.DisconnectCause p0, java.util.function.Consumer<java.lang.Boolean> p1);
    public void onCallStreamingStarted(java.util.function.Consumer<java.lang.Boolean> p0);
}

package android.location;

class GnssNavigationMessageCallbackTransport extends android.location.LocalListenerHelper<android.location.GnssNavigationMessage.Callback> {
    private final android.location.ILocationManager mLocationManager = null;
    private final android.location.IGnssNavigationMessageListener mListenerTransport = null;
    public GnssNavigationMessageCallbackTransport(android.content.Context p0, android.location.ILocationManager p1) { super(null, null); }
    protected boolean registerWithServer() throws android.os.RemoteException { return false; }
    protected void unregisterFromServer() throws android.os.RemoteException {}

    private class ListenerTransport extends android.location.IGnssNavigationMessageListener.Stub {
        private ListenerTransport(android.location.GnssNavigationMessageCallbackTransport p0) { super(); }
        public void onGnssNavigationMessageReceived(android.location.GnssNavigationMessage p0) {}
        public void onStatusChanged(int p0) {}
    }
}

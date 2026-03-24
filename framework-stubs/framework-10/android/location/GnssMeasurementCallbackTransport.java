package android.location;

class GnssMeasurementCallbackTransport extends android.location.LocalListenerHelper<android.location.GnssMeasurementsEvent.Callback> {
    private static final java.lang.String TAG = "GnssMeasCbTransport";
    private final android.location.ILocationManager mLocationManager = null;
    private final android.location.IGnssMeasurementsListener mListenerTransport = null;
    public GnssMeasurementCallbackTransport(android.content.Context p0, android.location.ILocationManager p1) { super(null, null); }
    protected boolean registerWithServer() throws android.os.RemoteException { return false; }
    protected void unregisterFromServer() throws android.os.RemoteException {}
    protected void injectGnssMeasurementCorrections(android.location.GnssMeasurementCorrections p0) throws android.os.RemoteException {}
    protected long getGnssCapabilities() throws android.os.RemoteException { return 0L; }

    private class ListenerTransport extends android.location.IGnssMeasurementsListener.Stub {
        private ListenerTransport(android.location.GnssMeasurementCallbackTransport p0) { super(); }
        public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent p0) {}
        public void onStatusChanged(int p0) {}
    }
}

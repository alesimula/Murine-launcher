package android.location;

class BatchedLocationCallbackTransport extends android.location.LocalListenerHelper<android.location.BatchedLocationCallback> {
    private final android.location.ILocationManager mLocationManager = null;
    private final android.location.IBatchedLocationCallback mCallbackTransport = null;
    public BatchedLocationCallbackTransport(android.content.Context p0, android.location.ILocationManager p1) { super(null, null); }
    protected boolean registerWithServer() throws android.os.RemoteException { return false; }
    protected void unregisterFromServer() throws android.os.RemoteException {}

    private class CallbackTransport extends android.location.IBatchedLocationCallback.Stub {
        private CallbackTransport(android.location.BatchedLocationCallbackTransport p0) { super(); }
        public void onLocationBatch(java.util.List<android.location.Location> p0) {}
    }
}

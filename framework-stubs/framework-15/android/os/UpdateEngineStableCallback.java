package android.os;

public abstract class UpdateEngineStableCallback {
    public UpdateEngineStableCallback() {}
    public abstract void onStatusUpdate(int p0, float p1);
    public abstract void onPayloadApplicationComplete(int p0);
}

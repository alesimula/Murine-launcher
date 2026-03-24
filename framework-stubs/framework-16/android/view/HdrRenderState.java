package android.view;

class HdrRenderState implements java.util.function.Consumer<android.view.Display> {
    HdrRenderState(android.view.ViewRootImpl p0) {}
    public void accept(android.view.Display p0) {}
    boolean isHdrEnabled() { return false; }
    void stopListening() {}
    void startListening() {}
    boolean updateForFrame(long p0) { return false; }
    float getDesiredHdrSdrRatio() { return 0.0f; }
    float getRenderHdrSdrRatio() { return 0.0f; }
    void forceUpdateHdrSdrRatio() {}
    void setDesiredHdrSdrRatio(boolean p0, float p1) {}
}

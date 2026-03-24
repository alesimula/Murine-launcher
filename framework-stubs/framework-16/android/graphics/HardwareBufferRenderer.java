package android.graphics;

public class HardwareBufferRenderer implements java.lang.AutoCloseable {
    public HardwareBufferRenderer(android.hardware.HardwareBuffer p0) {}
    public void setContentRoot(android.graphics.RenderNode p0) {}
    @android.annotation.NonNull
    public android.graphics.HardwareBufferRenderer.RenderRequest obtainRenderRequest() { return null; }
    public boolean isClosed() { return false; }
    public void close() {}
    public void setLightSourceGeometry(float p0, float p1, float p2, float p3) {}
    public void setLightSourceAlpha(float p0, float p1) {}
    static native int nRender(long p0, int p1, int p2, int p3, long p4, java.util.function.Consumer<android.graphics.HardwareBufferRenderer.RenderResult> p5);

    private static class HardwareBufferRendererHolder {
    }

    public final class RenderRequest {
        public void draw(java.util.concurrent.Executor p0, java.util.function.Consumer<android.graphics.HardwareBufferRenderer.RenderResult> p1) {}
        @android.annotation.NonNull
        public android.graphics.HardwareBufferRenderer.RenderRequest setColorSpace(android.graphics.ColorSpace p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.HardwareBufferRenderer.RenderRequest setBufferTransform(int p0) { return null; }
    }

    public static final class RenderResult {
        public static final int SUCCESS = 0;
        public static final int ERROR_UNKNOWN = 1;
        @android.annotation.NonNull
        public android.hardware.SyncFence getFence() { return null; }
        public int getStatus() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface RenderResultStatus {
        }
    }
}

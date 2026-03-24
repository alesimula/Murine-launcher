package android.graphics;

public class Picture {
    public Picture() {}
    public Picture(android.graphics.Picture p0) {}
    public Picture(long p0) {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.NonNull
    public android.graphics.Canvas beginRecording(int p0, int p1) { return null; }
    public void endRecording() {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public boolean requiresHardwareAcceleration() { return false; }
    public void draw(android.graphics.Canvas p0) {}
    @java.lang.Deprecated
    public static android.graphics.Picture createFromStream(java.io.InputStream p0) { return null; }
    @java.lang.Deprecated
    public void writeToStream(java.io.OutputStream p0) {}

    private static class PictureCanvas extends android.graphics.Canvas {
        boolean mUsesHwFeature;
        public PictureCanvas(android.graphics.Picture p0, long p1) { super(); }
        public void setBitmap(android.graphics.Bitmap p0) {}
        public void drawPicture(android.graphics.Picture p0) {}
        protected boolean onHwFeatureInSwMode() { return false; }
    }
}

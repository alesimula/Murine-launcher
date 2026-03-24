package android.opengl;

public class ETC1Util {
    public ETC1Util() {}
    public static void loadTexture(int p0, int p1, int p2, int p3, int p4, java.io.InputStream p5) throws java.io.IOException {}
    public static void loadTexture(int p0, int p1, int p2, int p3, int p4, android.opengl.ETC1Util.ETC1Texture p5) {}
    public static boolean isETC1Supported() { return false; }
    public static android.opengl.ETC1Util.ETC1Texture createTexture(java.io.InputStream p0) throws java.io.IOException { return null; }
    public static android.opengl.ETC1Util.ETC1Texture compressTexture(java.nio.Buffer p0, int p1, int p2, int p3, int p4) { return null; }
    public static void writeTexture(android.opengl.ETC1Util.ETC1Texture p0, java.io.OutputStream p1) throws java.io.IOException {}

    public static class ETC1Texture {
        private int mWidth;
        private int mHeight;
        private java.nio.ByteBuffer mData;
        public ETC1Texture(int p0, int p1, java.nio.ByteBuffer p2) {}
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public java.nio.ByteBuffer getData() { return null; }
    }
}

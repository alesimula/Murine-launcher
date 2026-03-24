package android.graphics;

public class BitmapFactory {
    public BitmapFactory() {}
    public static android.graphics.Bitmap decodeFile(java.lang.String p0, android.graphics.BitmapFactory.Options p1) { return null; }
    public static android.graphics.Bitmap decodeFile(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public static android.graphics.Bitmap decodeResourceStream(android.content.res.Resources p0, android.util.TypedValue p1, java.io.InputStream p2, android.graphics.Rect p3, android.graphics.BitmapFactory.Options p4) { return null; }
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources p0, int p1, android.graphics.BitmapFactory.Options p2) { return null; }
    public static android.graphics.Bitmap decodeResource(android.content.res.Resources p0, int p1) { return null; }
    public static android.graphics.Bitmap decodeByteArray(byte[] p0, int p1, int p2, android.graphics.BitmapFactory.Options p3) { return null; }
    public static android.graphics.Bitmap decodeByteArray(byte[] p0, int p1, int p2) { return null; }
    @android.annotation.Nullable
    public static android.graphics.Bitmap decodeStream(java.io.InputStream p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2) { return null; }
    public static android.graphics.Bitmap decodeStream(java.io.InputStream p0) { return null; }
    public static android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor p0, android.graphics.Rect p1, android.graphics.BitmapFactory.Options p2) { return null; }
    public static android.graphics.Bitmap decodeFileDescriptor(java.io.FileDescriptor p0) { return null; }

    public static class Options {
        public android.graphics.Bitmap inBitmap;
        public boolean inMutable;
        public boolean inJustDecodeBounds;
        public int inSampleSize;
        public android.graphics.Bitmap.Config inPreferredConfig;
        public android.graphics.ColorSpace inPreferredColorSpace;
        public boolean inPremultiplied;
        public boolean inDither;
        public int inDensity;
        public int inTargetDensity;
        public int inScreenDensity;
        public boolean inScaled;
        @java.lang.Deprecated
        public boolean inPurgeable;
        @java.lang.Deprecated
        public boolean inInputShareable;
        @java.lang.Deprecated
        public boolean inPreferQualityOverSpeed;
        public int outWidth;
        public int outHeight;
        public java.lang.String outMimeType;
        public android.graphics.Bitmap.Config outConfig;
        public android.graphics.ColorSpace outColorSpace;
        public byte[] inTempStorage;
        @java.lang.Deprecated
        public boolean mCancel;
        public Options() {}
        @java.lang.Deprecated
        public void requestCancelDecode() {}
        static void validate(android.graphics.BitmapFactory.Options p0) {}
        static long nativeInBitmap(android.graphics.BitmapFactory.Options p0) { return 0L; }
        static long nativeColorSpace(android.graphics.BitmapFactory.Options p0) { return 0L; }
    }
}

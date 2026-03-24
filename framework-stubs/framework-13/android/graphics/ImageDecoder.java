package android.graphics;

public final class ImageDecoder implements java.lang.AutoCloseable {
    @java.lang.Deprecated
    public static final int ERROR_SOURCE_EXCEPTION = 1;
    @java.lang.Deprecated
    public static final int ERROR_SOURCE_INCOMPLETE = 2;
    @java.lang.Deprecated
    public static final int ERROR_SOURCE_ERROR = 3;
    public static final int ALLOCATOR_DEFAULT = 0;
    public static final int ALLOCATOR_SOFTWARE = 1;
    public static final int ALLOCATOR_SHARED_MEMORY = 2;
    public static final int ALLOCATOR_HARDWARE = 3;
    public static final int MEMORY_POLICY_LOW_RAM = 0;
    public static final int MEMORY_POLICY_DEFAULT = 1;
    protected void finalize() throws java.lang.Throwable {}
    public static boolean isMimeTypeSupported(java.lang.String p0) { return false; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.Resources p0, int p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.ContentResolver p0, android.net.Uri p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.ContentResolver p0, android.net.Uri p1, android.content.res.Resources p2) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.AssetManager p0, java.lang.String p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(byte[] p0, int p1, int p2) throws java.lang.ArrayIndexOutOfBoundsException { return null; }
    public static android.graphics.ImageDecoder.Source createSource(byte[] p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(java.nio.ByteBuffer p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.Resources p0, java.io.InputStream p1) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(android.content.res.Resources p0, java.io.InputStream p1, int p2) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(java.io.File p0) { return null; }
    public static android.graphics.ImageDecoder.Source createSource(java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setResize(int p0, int p1) { return null; }
    public void setTargetSize(int p0, int p1) {}
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setResize(int p0) { return null; }
    public void setTargetSampleSize(int p0) {}
    public void setAllocator(int p0) {}
    public int getAllocator() { return 0; }
    public void setUnpremultipliedRequired(boolean p0) {}
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setRequireUnpremultiplied(boolean p0) { return null; }
    public boolean isUnpremultipliedRequired() { return false; }
    @java.lang.Deprecated
    public boolean getRequireUnpremultiplied() { return false; }
    public void setPostProcessor(android.graphics.PostProcessor p0) {}
    public android.graphics.PostProcessor getPostProcessor() { return null; }
    public void setOnPartialImageListener(android.graphics.ImageDecoder.OnPartialImageListener p0) {}
    public android.graphics.ImageDecoder.OnPartialImageListener getOnPartialImageListener() { return null; }
    public void setCrop(android.graphics.Rect p0) {}
    public android.graphics.Rect getCrop() { return null; }
    public void setOutPaddingRect(android.graphics.Rect p0) {}
    public void setMutableRequired(boolean p0) {}
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setMutable(boolean p0) { return null; }
    public boolean isMutableRequired() { return false; }
    @java.lang.Deprecated
    public boolean getMutable() { return false; }
    public void setMemorySizePolicy(int p0) {}
    public int getMemorySizePolicy() { return 0; }
    @java.lang.Deprecated
    public void setConserveMemory(boolean p0) {}
    @java.lang.Deprecated
    public boolean getConserveMemory() { return false; }
    public void setDecodeAsAlphaMaskEnabled(boolean p0) {}
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setDecodeAsAlphaMask(boolean p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setAsAlphaMask(boolean p0) { return null; }
    public boolean isDecodeAsAlphaMaskEnabled() { return false; }
    @java.lang.Deprecated
    public boolean getDecodeAsAlphaMask() { return false; }
    @java.lang.Deprecated
    public boolean getAsAlphaMask() { return false; }
    public void setTargetColorSpace(android.graphics.ColorSpace p0) {}
    public void close() {}
    public static android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Allocator {
    }

    public static class AssetInputStreamSource extends android.graphics.ImageDecoder.Source {
        public AssetInputStreamSource(android.content.res.AssetManager.AssetInputStream p0, android.content.res.Resources p1, android.util.TypedValue p2) { super(); }
        public android.content.res.Resources getResources() { return null; }
        public int getDensity() { return 0; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class AssetSource extends android.graphics.ImageDecoder.Source {
        AssetSource(android.content.res.AssetManager p0, java.lang.String p1) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ByteArraySource extends android.graphics.ImageDecoder.Source {
        ByteArraySource(byte[] p0, int p1, int p2) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ByteBufferSource extends android.graphics.ImageDecoder.Source {
        ByteBufferSource(java.nio.ByteBuffer p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class CallableSource extends android.graphics.ImageDecoder.Source {
        CallableSource(java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class ContentResolverSource extends android.graphics.ImageDecoder.Source {
        ContentResolverSource(android.content.ContentResolver p0, android.net.Uri p1, android.content.res.Resources p2) { super(); }
        android.content.res.Resources getResources() { return null; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    public static final class DecodeException extends java.io.IOException {
        public static final int SOURCE_EXCEPTION = 1;
        public static final int SOURCE_INCOMPLETE = 2;
        public static final int SOURCE_MALFORMED_DATA = 3;
        final int mError = 0;
        final android.graphics.ImageDecoder.Source mSource = null;
        DecodeException(int p0, java.lang.Throwable p1, android.graphics.ImageDecoder.Source p2) { super(); }
        DecodeException(int p0, java.lang.String p1, java.lang.Throwable p2, android.graphics.ImageDecoder.Source p3) { super(); }
        public int getError() { return 0; }
        public android.graphics.ImageDecoder.Source getSource() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Error {
        }
    }

    private static class FileSource extends android.graphics.ImageDecoder.Source {
        FileSource(java.io.File p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    private static final class ImageDecoderSourceTrace implements java.lang.AutoCloseable {
        ImageDecoderSourceTrace(android.graphics.ImageDecoder p0) {}
        public void close() {}
    }

    public static class ImageInfo {
        public android.util.Size getSize() { return null; }
        public java.lang.String getMimeType() { return null; }
        public boolean isAnimated() { return false; }
        public android.graphics.ColorSpace getColorSpace() { return null; }
    }

    @java.lang.Deprecated
    public static class IncompleteException extends java.io.IOException {
        public IncompleteException() { super(); }
    }

    private static class InputStreamSource extends android.graphics.ImageDecoder.Source {
        final android.content.res.Resources mResources = null;
        java.io.InputStream mInputStream;
        final int mInputDensity = 0;
        InputStreamSource(android.content.res.Resources p0, java.io.InputStream p1, int p2) { super(); }
        public android.content.res.Resources getResources() { return null; }
        public int getDensity() { return 0; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MemoryPolicy {
    }

    public static interface OnHeaderDecodedListener {
        public void onHeaderDecoded(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, android.graphics.ImageDecoder.Source p2);
    }

    public static interface OnPartialImageListener {
        public boolean onPartialImage(android.graphics.ImageDecoder.DecodeException p0);
    }

    private static class ResourceSource extends android.graphics.ImageDecoder.Source {
        final android.content.res.Resources mResources = null;
        final int mResId = 0;
        int mResDensity;
        ResourceSource(android.content.res.Resources p0, int p1) { super(); }
        public android.content.res.Resources getResources() { return null; }
        public int getDensity() { return 0; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
        public java.lang.String toString() { return null; }
    }

    public static abstract class Source {
        android.content.res.Resources getResources() { return null; }
        int getDensity() { return 0; }
        final int computeDstDensity() { return 0; }
        abstract android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException;
    }
}

package android.graphics;

public final class ImageDecoder implements java.lang.AutoCloseable {
    public static int sApiLevel;
    @java.lang.Deprecated
    public static final int ERROR_SOURCE_EXCEPTION = 1;
    @java.lang.Deprecated
    public static final int ERROR_SOURCE_INCOMPLETE = 2;
    @java.lang.Deprecated
    public static final int ERROR_SOURCE_ERROR = 3;
    private long mNativePtr;
    private final int mWidth = 0;
    private final int mHeight = 0;
    private final boolean mAnimated = false;
    private final boolean mIsNinePatch = false;
    private int mDesiredWidth;
    private int mDesiredHeight;
    private int mAllocator;
    private boolean mUnpremultipliedRequired;
    private boolean mMutable;
    private boolean mConserveMemory;
    private boolean mDecodeAsAlphaMask;
    private android.graphics.ColorSpace mDesiredColorSpace;
    private android.graphics.Rect mCropRect;
    private android.graphics.Rect mOutPaddingRect;
    private android.graphics.ImageDecoder.Source mSource;
    private android.graphics.PostProcessor mPostProcessor;
    private android.graphics.ImageDecoder.OnPartialImageListener mOnPartialImageListener;
    private java.io.InputStream mInputStream;
    private boolean mOwnsInputStream;
    private byte[] mTempStorage;
    private android.content.res.AssetFileDescriptor mAssetFd;
    private final java.util.concurrent.atomic.AtomicBoolean mClosed = null;
    public static final int ALLOCATOR_DEFAULT = 0;
    public static final int ALLOCATOR_SOFTWARE = 1;
    public static final int ALLOCATOR_SHARED_MEMORY = 2;
    public static final int ALLOCATOR_HARDWARE = 3;
    public static final int MEMORY_POLICY_LOW_RAM = 0;
    public static final int MEMORY_POLICY_DEFAULT = 1;
    private static android.graphics.ImageDecoder createFromFile(java.io.File p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException { return null; }
    private static android.graphics.ImageDecoder createFromStream(java.io.InputStream p0, boolean p1, boolean p2, android.graphics.ImageDecoder.Source p3) throws java.io.IOException { return null; }
    private static android.graphics.ImageDecoder createFromAssetFileDescriptor(android.content.res.AssetFileDescriptor p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException { return null; }
    private static android.graphics.ImageDecoder createFromAsset(android.content.res.AssetManager.AssetInputStream p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException { return null; }
    private ImageDecoder(long p0, int p1, int p2, boolean p3, boolean p4) {}
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
    public android.util.Size getSampledSize(int p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setResize(int p0, int p1) { return null; }
    public void setTargetSize(int p0, int p1) {}
    @java.lang.Deprecated
    public android.graphics.ImageDecoder setResize(int p0) { return null; }
    private int getTargetDimension(int p0, int p1, int p2) { return 0; }
    public void setTargetSampleSize(int p0) {}
    private boolean requestedResize() { return false; }
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
    private void checkState(boolean p0) {}
    private static void checkSubset(int p0, int p1, android.graphics.Rect p2) {}
    private boolean checkForExtended() { return false; }
    private long getColorSpacePtr() { return 0L; }
    private android.graphics.Bitmap decodeBitmapInternal() throws java.io.IOException { return null; }
    private void callHeaderDecoded(android.graphics.ImageDecoder.OnHeaderDecodedListener p0, android.graphics.ImageDecoder.Source p1) {}
    public static android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    private static android.graphics.drawable.Drawable decodeDrawableImpl(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    public static android.graphics.drawable.Drawable decodeDrawable(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    private static android.graphics.Bitmap decodeBitmapImpl(android.graphics.ImageDecoder.Source p0, android.graphics.ImageDecoder.OnHeaderDecodedListener p1) throws java.io.IOException { return null; }
    private int computeDensity(android.graphics.ImageDecoder.Source p0) { return 0; }
    private java.lang.String getMimeType() { return null; }
    private android.graphics.ColorSpace getColorSpace() { return null; }
    public static android.graphics.Bitmap decodeBitmap(android.graphics.ImageDecoder.Source p0) throws java.io.IOException { return null; }
    private int postProcessAndRelease(android.graphics.Canvas p0) { return 0; }
    private void onPartialImage(int p0, java.lang.Throwable p1) throws android.graphics.ImageDecoder.DecodeException {}
    private static native android.graphics.ImageDecoder nCreate(long p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(java.nio.ByteBuffer p0, int p1, int p2, boolean p3, android.graphics.ImageDecoder.Source p4) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(byte[] p0, int p1, int p2, boolean p3, android.graphics.ImageDecoder.Source p4) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(java.io.InputStream p0, byte[] p1, boolean p2, android.graphics.ImageDecoder.Source p3) throws java.io.IOException;
    private static native android.graphics.ImageDecoder nCreate(java.io.FileDescriptor p0, boolean p1, android.graphics.ImageDecoder.Source p2) throws java.io.IOException;
    private static native android.graphics.Bitmap nDecodeBitmap(long p0, android.graphics.ImageDecoder p1, boolean p2, int p3, int p4, android.graphics.Rect p5, boolean p6, int p7, boolean p8, boolean p9, boolean p10, long p11, boolean p12) throws java.io.IOException;
    private static native android.util.Size nGetSampledSize(long p0, int p1);
    private static native void nGetPadding(long p0, android.graphics.Rect p1);
    private static native void nClose(long p0);
    private static native java.lang.String nGetMimeType(long p0);
    private static native android.graphics.ColorSpace nGetColorSpace(long p0);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Allocator {
    }

    public static class AssetInputStreamSource extends android.graphics.ImageDecoder.Source {
        private android.content.res.AssetManager.AssetInputStream mAssetInputStream;
        private final android.content.res.Resources mResources = null;
        private final int mDensity = 0;
        public AssetInputStreamSource(android.content.res.AssetManager.AssetInputStream p0, android.content.res.Resources p1, android.util.TypedValue p2) { super(); }
        public android.content.res.Resources getResources() { return null; }
        public int getDensity() { return 0; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    private static class AssetSource extends android.graphics.ImageDecoder.Source {
        private final android.content.res.AssetManager mAssets = null;
        private final java.lang.String mFileName = null;
        AssetSource(android.content.res.AssetManager p0, java.lang.String p1) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    private static class ByteArraySource extends android.graphics.ImageDecoder.Source {
        private final byte[] mData = null;
        private final int mOffset = 0;
        private final int mLength = 0;
        ByteArraySource(byte[] p0, int p1, int p2) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    private static class ByteBufferSource extends android.graphics.ImageDecoder.Source {
        private final java.nio.ByteBuffer mBuffer = null;
        ByteBufferSource(java.nio.ByteBuffer p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    private static class CallableSource extends android.graphics.ImageDecoder.Source {
        private final java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> mCallable = null;
        CallableSource(java.util.concurrent.Callable<android.content.res.AssetFileDescriptor> p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    private static class ContentResolverSource extends android.graphics.ImageDecoder.Source {
        private final android.content.ContentResolver mResolver = null;
        private final android.net.Uri mUri = null;
        private final android.content.res.Resources mResources = null;
        ContentResolverSource(android.content.ContentResolver p0, android.net.Uri p1, android.content.res.Resources p2) { super(); }
        android.content.res.Resources getResources() { return null; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
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
        private static java.lang.String errorMessage(int p0, java.lang.Throwable p1) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Error {
        }
    }

    private static class FileSource extends android.graphics.ImageDecoder.Source {
        private final java.io.File mFile = null;
        FileSource(java.io.File p0) { super(); }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    public static class ImageInfo {
        private final android.util.Size mSize = null;
        private android.graphics.ImageDecoder mDecoder;
        private ImageInfo(android.graphics.ImageDecoder p0) {}
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
        private java.lang.Object mLock;
        ResourceSource(android.content.res.Resources p0, int p1) { super(); }
        public android.content.res.Resources getResources() { return null; }
        public int getDensity() { return 0; }
        public android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException { return null; }
    }

    public static abstract class Source {
        private Source() {}
        android.content.res.Resources getResources() { return null; }
        int getDensity() { return 0; }
        final int computeDstDensity() { return 0; }
        abstract android.graphics.ImageDecoder createImageDecoder(boolean p0) throws java.io.IOException;
    }
}

package android.graphics.drawable;

public final class Icon implements android.os.Parcelable {
    private static final java.lang.String TAG = "Icon";
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_URI = 4;
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    private static final int VERSION_STREAM_SERIALIZER = 1;
    private final int mType = 0;
    private android.content.res.ColorStateList mTintList;
    static final android.graphics.BlendMode DEFAULT_BLEND_MODE = null;
    private android.graphics.BlendMode mBlendMode;
    private java.lang.Object mObj1;
    private java.lang.String mString1;
    private int mInt1;
    private int mInt2;
    public static final int MIN_ASHMEM_ICON_SIZE = 131072;
    public static final android.os.Parcelable.Creator<android.graphics.drawable.Icon> CREATOR = null;
    @android.graphics.drawable.Icon.IconType
    public int getType() { return 0; }
    public android.graphics.Bitmap getBitmap() { return null; }
    private void setBitmap(android.graphics.Bitmap p0) {}
    public int getDataLength() { return 0; }
    public int getDataOffset() { return 0; }
    public byte[] getDataBytes() { return null; }
    public android.content.res.Resources getResources() { return null; }
    public java.lang.String getResPackage() { return null; }
    public int getResId() { return 0; }
    public java.lang.String getUriString() { return null; }
    public android.net.Uri getUri() { return null; }
    private static final java.lang.String typeToString(int p0) { return null; }
    public void loadDrawableAsync(android.content.Context p0, android.os.Message p1) {}
    public void loadDrawableAsync(android.content.Context p0, android.graphics.drawable.Icon.OnDrawableLoadedListener p1, android.os.Handler p2) {}
    public android.graphics.drawable.Drawable loadDrawable(android.content.Context p0) { return null; }
    private android.graphics.drawable.Drawable loadDrawableInner(android.content.Context p0) { return null; }
    private java.io.InputStream getUriInputStream(android.content.Context p0) { return null; }
    public android.graphics.drawable.Drawable loadDrawableAsUser(android.content.Context p0, int p1) { return null; }
    public void convertToAshmem() {}
    public void writeToStream(java.io.OutputStream p0) throws java.io.IOException {}
    private Icon(int p0) {}
    public static android.graphics.drawable.Icon createFromStream(java.io.InputStream p0) throws java.io.IOException { return null; }
    public boolean sameAs(android.graphics.drawable.Icon p0) { return false; }
    public static android.graphics.drawable.Icon createWithResource(android.content.Context p0, int p1) { return null; }
    public static android.graphics.drawable.Icon createWithResource(android.content.res.Resources p0, int p1) { return null; }
    public static android.graphics.drawable.Icon createWithResource(java.lang.String p0, int p1) { return null; }
    public static android.graphics.drawable.Icon createWithBitmap(android.graphics.Bitmap p0) { return null; }
    public static android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap p0) { return null; }
    public static android.graphics.drawable.Icon createWithData(byte[] p0, int p1, int p2) { return null; }
    public static android.graphics.drawable.Icon createWithContentUri(java.lang.String p0) { return null; }
    public static android.graphics.drawable.Icon createWithContentUri(android.net.Uri p0) { return null; }
    public static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(java.lang.String p0) { return null; }
    public static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(android.net.Uri p0) { return null; }
    public android.graphics.drawable.Icon setTint(int p0) { return null; }
    public android.graphics.drawable.Icon setTintList(android.content.res.ColorStateList p0) { return null; }
    public android.graphics.drawable.Icon setTintMode(android.graphics.PorterDuff.Mode p0) { return null; }
    public android.graphics.drawable.Icon setTintBlendMode(android.graphics.BlendMode p0) { return null; }
    public boolean hasTint() { return false; }
    public static android.graphics.drawable.Icon createWithFilePath(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    private Icon(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.graphics.Bitmap scaleDownIfNecessary(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    public void scaleDownIfNecessary(int p0, int p1) {}

    public static @interface IconType {
    }

    private class LoadDrawableTask implements java.lang.Runnable {
        final android.content.Context mContext = null;
        final android.os.Message mMessage = null;
        public LoadDrawableTask(android.graphics.drawable.Icon p0, android.content.Context p1, android.os.Handler p2, android.graphics.drawable.Icon.OnDrawableLoadedListener p3) {}
        public LoadDrawableTask(android.graphics.drawable.Icon p0, android.content.Context p1, android.os.Message p2) {}
        public void run() {}
        public void runAsync() {}
    }

    public static interface OnDrawableLoadedListener {
        public void onDrawableLoaded(android.graphics.drawable.Drawable p0);
    }
}

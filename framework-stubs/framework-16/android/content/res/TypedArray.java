package android.content.res;

public class TypedArray implements java.lang.AutoCloseable {
    static final int STYLE_NUM_ENTRIES = 7;
    static final int STYLE_TYPE = 0;
    static final int STYLE_DATA = 1;
    static final int STYLE_ASSET_COOKIE = 2;
    static final int STYLE_RESOURCE_ID = 3;
    static final int STYLE_CHANGING_CONFIGURATIONS = 4;
    static final int STYLE_DENSITY = 5;
    static final int STYLE_SOURCE_RESOURCE_ID = 6;
    android.content.res.XmlBlock.Parser mXml;
    android.content.res.Resources.Theme mTheme;
    int[] mData;
    long mDataAddress;
    int[] mIndices;
    long mIndicesAddress;
    int mLength;
    android.util.TypedValue mValue;
    static android.content.res.TypedArray obtain(android.content.res.Resources p0, int p1) { return null; }
    public int length() { return 0; }
    public int getIndexCount() { return 0; }
    public int getIndex(int p0) { return 0; }
    public android.content.res.Resources getResources() { return null; }
    public java.lang.CharSequence getText(int p0) { return null; }
    @android.annotation.Nullable
    public java.lang.String getString(int p0) { return null; }
    public java.lang.String getNonResourceString(int p0) { return null; }
    public java.lang.String getNonConfigurationString(int p0, int p1) { return null; }
    public boolean getBoolean(int p0, boolean p1) { return false; }
    public int getInt(int p0, int p1) { return 0; }
    public float getFloat(int p0, float p1) { return 0.0f; }
    public int getColor(int p0, int p1) { return 0; }
    @android.annotation.Nullable
    public android.content.res.ComplexColor getComplexColor(int p0) { return null; }
    @android.annotation.Nullable
    public android.content.res.ColorStateList getColorStateList(int p0) { return null; }
    public int getInteger(int p0, int p1) { return 0; }
    public float getDimension(int p0, float p1) { return 0.0f; }
    public int getDimensionPixelOffset(int p0, int p1) { return 0; }
    public int getDimensionPixelSize(int p0, int p1) { return 0; }
    public int getLayoutDimension(int p0, java.lang.String p1) { return 0; }
    public int getLayoutDimension(int p0, int p1) { return 0; }
    public float getFraction(int p0, int p1, int p2, float p3) { return 0.0f; }
    public int getResourceId(int p0, int p1) { return 0; }
    public int getThemeAttributeId(int p0, int p1) { return 0; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawable(int p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawableForDensity(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.Typeface getFont(int p0) { return null; }
    public java.lang.CharSequence[] getTextArray(int p0) { return null; }
    public boolean getValue(int p0, android.util.TypedValue p1) { return false; }
    public int getType(int p0) { return 0; }
    public int getSourceResourceId(int p0, int p1) { return 0; }
    public boolean hasValue(int p0) { return false; }
    public boolean hasValueOrEmpty(int p0) { return false; }
    public android.util.TypedValue peekValue(int p0) { return null; }
    public java.lang.String getPositionDescription() { return null; }
    public void recycle() {}
    public void close() {}
    @android.annotation.Nullable
    public int[] extractThemeAttrs() { return null; }
    @android.annotation.Nullable
    public int[] extractThemeAttrs(int[] p0) { return null; }
    public int getChangingConfigurations() { return 0; }
    protected TypedArray(android.content.res.Resources p0) {}
    public java.lang.String toString() { return null; }
}

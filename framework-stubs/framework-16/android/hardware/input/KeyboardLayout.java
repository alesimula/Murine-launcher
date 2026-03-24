package android.hardware.input;

public final class KeyboardLayout implements android.os.Parcelable, java.lang.Comparable<android.hardware.input.KeyboardLayout> {
    public static final java.lang.String LAYOUT_TYPE_UNDEFINED = "undefined";
    public static final java.lang.String LAYOUT_TYPE_QWERTY = "qwerty";
    public static final java.lang.String LAYOUT_TYPE_QWERTZ = "qwertz";
    public static final java.lang.String LAYOUT_TYPE_AZERTY = "azerty";
    public static final java.lang.String LAYOUT_TYPE_DVORAK = "dvorak";
    public static final java.lang.String LAYOUT_TYPE_COLEMAK = "colemak";
    public static final java.lang.String LAYOUT_TYPE_WORKMAN = "workman";
    public static final java.lang.String LAYOUT_TYPE_TURKISH_F = "turkish_f";
    public static final java.lang.String LAYOUT_TYPE_TURKISH_Q = "turkish_q";
    public static final java.lang.String LAYOUT_TYPE_EXTENDED = "extended";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.KeyboardLayout> CREATOR = null;
    public KeyboardLayout(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, android.os.LocaleList p4, int p5, int p6, int p7) {}
    public java.lang.String getDescriptor() { return null; }
    public java.lang.String getLabel() { return null; }
    public java.lang.String getCollection() { return null; }
    public android.os.LocaleList getLocales() { return null; }
    public java.lang.String getLayoutType() { return null; }
    public int getVendorId() { return 0; }
    public int getProductId() { return 0; }
    public boolean isAnsiLayout() { return false; }
    public boolean isJisLayout() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int compareTo(android.hardware.input.KeyboardLayout p0) { return 0; }
    public java.lang.String toString() { return null; }
    public static boolean isLayoutTypeValid(java.lang.String p0) { return false; }

    public static enum LayoutType {
        UNDEFINED,
        QWERTY,
        QWERTZ,
        AZERTY,
        DVORAK,
        COLEMAK,
        WORKMAN,
        TURKISH_Q,
        TURKISH_F,
        EXTENDED;
        public static int getLayoutTypeEnumValue(java.lang.String p0) { return 0; }
        public static java.lang.String getLayoutNameFromValue(int p0) { return null; }
    }
}

package android.hardware.input;

public final class KeyGlyphMap implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.KeyGlyphMap> CREATOR = null;
    public KeyGlyphMap(android.content.ComponentName p0, android.util.SparseIntArray p1, android.util.SparseIntArray p2, int[] p3, java.util.Map<android.hardware.input.KeyGlyphMap.KeyCombination, java.lang.Integer> p4) {}
    public KeyGlyphMap(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int[] getFunctionRowKeys() { return null; }
    public java.util.Map<android.hardware.input.KeyGlyphMap.KeyCombination, java.lang.Integer> getHardwareShortcuts() { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawableForKeycode(android.content.Context p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawableForModifier(android.content.Context p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable getDrawableForModifierState(android.content.Context p0, int p1) { return null; }
    public java.lang.String toString() { return null; }

    public static class KeyCombination implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.input.KeyGlyphMap.KeyCombination> CREATOR = null;
        public KeyCombination(int p0, int p1) {}
        public KeyCombination(android.os.Parcel p0) {}
        public int getModifierState() { return 0; }
        public int getKeycode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}

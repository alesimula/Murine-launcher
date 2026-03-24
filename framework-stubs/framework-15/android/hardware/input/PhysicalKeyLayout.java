package android.hardware.input;

final class PhysicalKeyLayout {
    public PhysicalKeyLayout(android.view.KeyCharacterMap p0, android.hardware.input.KeyboardLayout p1) {}
    public android.hardware.input.PhysicalKeyLayout.LayoutKey[][] getKeys() { return null; }
    @android.annotation.Nullable
    public android.hardware.input.PhysicalKeyLayout.EnterKey getEnterKey() { return null; }
    public static boolean isSpecialKey(android.hardware.input.PhysicalKeyLayout.LayoutKey p0) { return false; }
    public static boolean isKeyPositionUnsure(android.hardware.input.PhysicalKeyLayout.LayoutKey p0) { return false; }

    public static final record EnterKey(int row, int column, float topKeyWeight, float bottomKeyWeight) {
        public EnterKey(int row, int column, float topKeyWeight, float bottomKeyWeight) { this.row = row; this.column = column; this.topKeyWeight = topKeyWeight; this.bottomKeyWeight = bottomKeyWeight; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public int row() { return 0; }
        public int column() { return 0; }
        public float topKeyWeight() { return 0.0f; }
        public float bottomKeyWeight() { return 0.0f; }
    }

    public static class KeyGlyph {
        public KeyGlyph(android.view.KeyCharacterMap p0, int p1) {}
        public java.lang.String getBaseText() { return null; }
        public java.lang.String getShiftText() { return null; }
        public java.lang.String getAltGrText() { return null; }
        public java.lang.String getAltGrShiftText() { return null; }
        public boolean hasBaseText() { return false; }
        public boolean hasValidShiftText() { return false; }
        public boolean hasValidAltGrText() { return false; }
        public boolean hasValidAltGrShiftText() { return false; }
    }

    public static final record LayoutKey(int keyCode, int scanCode, float keyWeight, android.hardware.input.PhysicalKeyLayout.KeyGlyph glyph) {
        public LayoutKey(int keyCode, int scanCode, float keyWeight, android.hardware.input.PhysicalKeyLayout.KeyGlyph glyph) { this.keyCode = keyCode; this.scanCode = scanCode; this.keyWeight = keyWeight; this.glyph = glyph; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public int keyCode() { return 0; }
        public int scanCode() { return 0; }
        public float keyWeight() { return 0.0f; }
        public android.hardware.input.PhysicalKeyLayout.KeyGlyph glyph() { return null; }
    }
}

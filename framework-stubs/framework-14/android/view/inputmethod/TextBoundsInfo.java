package android.view.inputmethod;

public final class TextBoundsInfo implements android.os.Parcelable {
    public static final int FLAG_CHARACTER_WHITESPACE = 1;
    public static final int FLAG_CHARACTER_LINEFEED = 2;
    public static final int FLAG_CHARACTER_PUNCTUATION = 4;
    public static final int FLAG_LINE_IS_RTL = 8;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.TextBoundsInfo> CREATOR = null;
    public void getMatrix(android.graphics.Matrix p0) {}
    public int getStartIndex() { return 0; }
    public int getEndIndex() { return 0; }
    public void getCharacterBounds(int p0, android.graphics.RectF p1) {}
    public int getCharacterFlags(int p0) { return 0; }
    public int getCharacterBidiLevel(int p0) { return 0; }
    public android.text.SegmentFinder getWordSegmentFinder() { return null; }
    public android.text.SegmentFinder getGraphemeSegmentFinder() { return null; }
    public android.text.SegmentFinder getLineSegmentFinder() { return null; }
    public int getOffsetForPosition(float p0, float p1) { return 0; }
    public int[] getRangeForRect(android.graphics.RectF p0, android.text.SegmentFinder p1, android.text.Layout.TextInclusionStrategy p2) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.os.Bundle toBundle() { return null; }
    public static android.view.inputmethod.TextBoundsInfo createFromBundle(android.os.Bundle p0) { return null; }

    public static final class Builder {
        public Builder(int p0, int p1) {}
        public android.view.inputmethod.TextBoundsInfo.Builder clear() { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setMatrix(android.graphics.Matrix p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setStartAndEnd(int p0, int p1) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setCharacterBounds(float[] p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setCharacterFlags(int[] p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setCharacterBidiLevel(int[] p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setGraphemeSegmentFinder(android.text.SegmentFinder p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setWordSegmentFinder(android.text.SegmentFinder p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setLineSegmentFinder(android.text.SegmentFinder p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CharacterFlags {
    }
}

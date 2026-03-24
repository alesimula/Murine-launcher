package android.widget.inline;

public final class InlinePresentationSpec implements android.os.Parcelable {
    private final android.util.Size mMinSize = null;
    private final android.util.Size mMaxSize = null;
    private final android.os.Bundle mStyle = null;
    public static final android.os.Parcelable.Creator<android.widget.inline.InlinePresentationSpec> CREATOR = null;
    private static android.os.Bundle defaultStyle() { return null; }
    private boolean styleEquals(android.os.Bundle p0) { return false; }
    public void filterContentTypes() {}
    InlinePresentationSpec(android.util.Size p0, android.util.Size p1, android.os.Bundle p2) {}
    public android.util.Size getMinSize() { return null; }
    public android.util.Size getMaxSize() { return null; }
    public android.os.Bundle getStyle() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InlinePresentationSpec(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.widget.inline.InlinePresentationSpec.BaseBuilder {
        private android.util.Size mMinSize;
        private android.util.Size mMaxSize;
        private android.os.Bundle mStyle;
        private long mBuilderFieldsSet;
        public Builder(android.util.Size p0, android.util.Size p1) { super(); }
        public android.widget.inline.InlinePresentationSpec.Builder setStyle(android.os.Bundle p0) { return null; }
        public android.widget.inline.InlinePresentationSpec build() { return null; }
        private void checkNotUsed() {}
    }
}

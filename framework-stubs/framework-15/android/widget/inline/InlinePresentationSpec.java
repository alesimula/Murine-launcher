package android.widget.inline;

public final class InlinePresentationSpec implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.widget.inline.InlinePresentationSpec> CREATOR = null;
    public void filterContentTypes() {}
    InlinePresentationSpec(android.util.Size p0, android.util.Size p1, android.os.Bundle p2) {}
    @android.annotation.NonNull
    public android.util.Size getMinSize() { return null; }
    @android.annotation.NonNull
    public android.util.Size getMaxSize() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getStyle() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    InlinePresentationSpec(android.os.Parcel p0) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.widget.inline.InlinePresentationSpec.BaseBuilder {
        public Builder(android.util.Size p0, android.util.Size p1) { super(); }
        @android.annotation.NonNull
        public android.widget.inline.InlinePresentationSpec.Builder setStyle(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.widget.inline.InlinePresentationSpec build() { return null; }
    }
}

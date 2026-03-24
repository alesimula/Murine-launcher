package android.text.style;

public interface AlignmentSpan extends android.text.style.ParagraphStyle {
    public android.text.Layout.Alignment getAlignment();

    public static class Standard implements android.text.style.AlignmentSpan, android.text.ParcelableSpan {
        public Standard(android.text.Layout.Alignment p0) {}
        public Standard(android.os.Parcel p0) {}
        public int getSpanTypeId() { return 0; }
        public int getSpanTypeIdInternal() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public void writeToParcelInternal(android.os.Parcel p0, int p1) {}
        public android.text.Layout.Alignment getAlignment() { return null; }
        public java.lang.String toString() { return null; }
    }
}

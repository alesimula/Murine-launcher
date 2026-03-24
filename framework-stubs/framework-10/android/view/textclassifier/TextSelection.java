package android.view.textclassifier;

public final class TextSelection implements android.os.Parcelable {
    private final int mStartIndex = 0;
    private final int mEndIndex = 0;
    private final android.view.textclassifier.EntityConfidence mEntityConfidence = null;
    private final java.lang.String mId = null;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection> CREATOR = null;
    private TextSelection(int p0, int p1, java.util.Map<java.lang.String, java.lang.Float> p2, java.lang.String p3, android.os.Bundle p4) {}
    public int getSelectionStartIndex() { return 0; }
    public int getSelectionEndIndex() { return 0; }
    public int getEntityCount() { return 0; }
    public java.lang.String getEntity(int p0) { return null; }
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    public java.lang.String getId() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private TextSelection(android.os.Parcel p0) {}

    public static final class Request implements android.os.Parcelable {
        private final java.lang.CharSequence mText = null;
        private final int mStartIndex = 0;
        private final int mEndIndex = 0;
        private final android.os.LocaleList mDefaultLocales = null;
        private final boolean mDarkLaunchAllowed = false;
        private final android.os.Bundle mExtras = null;
        private java.lang.String mCallingPackageName;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection.Request> CREATOR = null;
        private Request(java.lang.CharSequence p0, int p1, int p2, android.os.LocaleList p3, boolean p4, android.os.Bundle p5) {}
        public java.lang.CharSequence getText() { return null; }
        public int getStartIndex() { return 0; }
        public int getEndIndex() { return 0; }
        public boolean isDarkLaunchAllowed() { return false; }
        public android.os.LocaleList getDefaultLocales() { return null; }
        public void setCallingPackageName(java.lang.String p0) {}
        public java.lang.String getCallingPackageName() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private static android.view.textclassifier.TextSelection.Request readFromParcel(android.os.Parcel p0) { return null; }

        public static final class Builder {
            private final java.lang.CharSequence mText = null;
            private final int mStartIndex = 0;
            private final int mEndIndex = 0;
            private android.os.LocaleList mDefaultLocales;
            private boolean mDarkLaunchAllowed;
            private android.os.Bundle mExtras;
            public Builder(java.lang.CharSequence p0, int p1, int p2) {}
            public android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(android.os.LocaleList p0) { return null; }
            public android.view.textclassifier.TextSelection.Request.Builder setDarkLaunchAllowed(boolean p0) { return null; }
            public android.view.textclassifier.TextSelection.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextSelection.Request build() { return null; }
        }
    }

    public static final class Builder {
        private final int mStartIndex = 0;
        private final int mEndIndex = 0;
        private final java.util.Map<java.lang.String, java.lang.Float> mEntityConfidence = null;
        private java.lang.String mId;
        private android.os.Bundle mExtras;
        public Builder(int p0, int p1) {}
        public android.view.textclassifier.TextSelection.Builder setEntityType(java.lang.String p0, float p1) { return null; }
        public android.view.textclassifier.TextSelection.Builder setId(java.lang.String p0) { return null; }
        public android.view.textclassifier.TextSelection.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.TextSelection build() { return null; }
    }
}

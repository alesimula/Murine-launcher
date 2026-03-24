package android.view.textclassifier;

public final class ConversationActions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationActions> CREATOR = null;
    private final java.util.List<android.view.textclassifier.ConversationAction> mConversationActions = null;
    private final java.lang.String mId = null;
    public ConversationActions(java.util.List<android.view.textclassifier.ConversationAction> p0, java.lang.String p1) {}
    private ConversationActions(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.util.List<android.view.textclassifier.ConversationAction> getConversationActions() { return null; }
    public java.lang.String getId() { return null; }

    public static final class Request implements android.os.Parcelable {
        public static final java.lang.String HINT_FOR_IN_APP = "in_app";
        public static final java.lang.String HINT_FOR_NOTIFICATION = "notification";
        private final java.util.List<android.view.textclassifier.ConversationActions.Message> mConversation = null;
        private final android.view.textclassifier.TextClassifier.EntityConfig mTypeConfig = null;
        private final int mMaxSuggestions = 0;
        private final java.util.List<java.lang.String> mHints = null;
        private java.lang.String mCallingPackageName;
        private android.os.Bundle mExtras;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationActions.Request> CREATOR = null;
        private Request(java.util.List<android.view.textclassifier.ConversationActions.Message> p0, android.view.textclassifier.TextClassifier.EntityConfig p1, int p2, java.util.List<java.lang.String> p3, android.os.Bundle p4) {}
        private static android.view.textclassifier.ConversationActions.Request readFromParcel(android.os.Parcel p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public android.view.textclassifier.TextClassifier.EntityConfig getTypeConfig() { return null; }
        public java.util.List<android.view.textclassifier.ConversationActions.Message> getConversation() { return null; }
        public int getMaxSuggestions() { return 0; }
        public java.util.List<java.lang.String> getHints() { return null; }
        public void setCallingPackageName(java.lang.String p0) {}
        public java.lang.String getCallingPackageName() { return null; }
        public android.os.Bundle getExtras() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Hint {
        }

        public static final class Builder {
            private java.util.List<android.view.textclassifier.ConversationActions.Message> mConversation;
            private android.view.textclassifier.TextClassifier.EntityConfig mTypeConfig;
            private int mMaxSuggestions;
            private java.util.List<java.lang.String> mHints;
            private android.os.Bundle mExtras;
            public Builder(java.util.List<android.view.textclassifier.ConversationActions.Message> p0) {}
            public android.view.textclassifier.ConversationActions.Request.Builder setHints(java.util.List<java.lang.String> p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request.Builder setTypeConfig(android.view.textclassifier.TextClassifier.EntityConfig p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request.Builder setMaxSuggestions(int p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request build() { return null; }
        }
    }

    public static final class Message implements android.os.Parcelable {
        public static final android.app.Person PERSON_USER_SELF = null;
        public static final android.app.Person PERSON_USER_OTHERS = null;
        private final android.app.Person mAuthor = null;
        private final java.time.ZonedDateTime mReferenceTime = null;
        private final java.lang.CharSequence mText = null;
        private final android.os.Bundle mExtras = null;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationActions.Message> CREATOR = null;
        private Message(android.app.Person p0, java.time.ZonedDateTime p1, java.lang.CharSequence p2, android.os.Bundle p3) {}
        private Message(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public android.app.Person getAuthor() { return null; }
        public java.time.ZonedDateTime getReferenceTime() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public android.os.Bundle getExtras() { return null; }

        public static final class Builder {
            private android.app.Person mAuthor;
            private java.time.ZonedDateTime mReferenceTime;
            private java.lang.CharSequence mText;
            private android.os.Bundle mExtras;
            public Builder(android.app.Person p0) {}
            public android.view.textclassifier.ConversationActions.Message.Builder setText(java.lang.CharSequence p0) { return null; }
            public android.view.textclassifier.ConversationActions.Message.Builder setReferenceTime(java.time.ZonedDateTime p0) { return null; }
            public android.view.textclassifier.ConversationActions.Message.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.ConversationActions.Message build() { return null; }
        }
    }
}

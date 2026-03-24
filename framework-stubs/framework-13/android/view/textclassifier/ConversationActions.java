package android.view.textclassifier;

public final class ConversationActions implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationActions> CREATOR = null;
    public ConversationActions(java.util.List<android.view.textclassifier.ConversationAction> p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.util.List<android.view.textclassifier.ConversationAction> getConversationActions() { return null; }
    public java.lang.String getId() { return null; }

    public static final class Message implements android.os.Parcelable {
        public static final android.app.Person PERSON_USER_SELF = null;
        public static final android.app.Person PERSON_USER_OTHERS = null;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationActions.Message> CREATOR = null;
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public android.app.Person getAuthor() { return null; }
        public java.time.ZonedDateTime getReferenceTime() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public android.os.Bundle getExtras() { return null; }

        public static final class Builder {
            public Builder(android.app.Person p0) {}
            public android.view.textclassifier.ConversationActions.Message.Builder setText(java.lang.CharSequence p0) { return null; }
            public android.view.textclassifier.ConversationActions.Message.Builder setReferenceTime(java.time.ZonedDateTime p0) { return null; }
            public android.view.textclassifier.ConversationActions.Message.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.ConversationActions.Message build() { return null; }
        }
    }

    public static final class Request implements android.os.Parcelable {
        public static final java.lang.String HINT_FOR_IN_APP = "in_app";
        public static final java.lang.String HINT_FOR_NOTIFICATION = "notification";
        public static final android.os.Parcelable.Creator<android.view.textclassifier.ConversationActions.Request> CREATOR = null;
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
        public android.view.textclassifier.TextClassifier.EntityConfig getTypeConfig() { return null; }
        public java.util.List<android.view.textclassifier.ConversationActions.Message> getConversation() { return null; }
        public int getMaxSuggestions() { return 0; }
        public java.util.List<java.lang.String> getHints() { return null; }
        public java.lang.String getCallingPackageName() { return null; }
        void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public android.os.Bundle getExtras() { return null; }

        public static final class Builder {
            public Builder(java.util.List<android.view.textclassifier.ConversationActions.Message> p0) {}
            public android.view.textclassifier.ConversationActions.Request.Builder setHints(java.util.List<java.lang.String> p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request.Builder setTypeConfig(android.view.textclassifier.TextClassifier.EntityConfig p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request.Builder setMaxSuggestions(int p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.ConversationActions.Request build() { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Hint {
        }
    }
}

package android.view.textclassifier;

public abstract class TextClassifierEvent implements android.os.Parcelable {
    public static final int CATEGORY_SELECTION = 1;
    public static final int CATEGORY_LINKIFY = 2;
    public static final int CATEGORY_CONVERSATION_ACTIONS = 3;
    public static final int CATEGORY_LANGUAGE_DETECTION = 4;
    public static final int TYPE_SELECTION_STARTED = 1;
    public static final int TYPE_SELECTION_MODIFIED = 2;
    public static final int TYPE_SMART_SELECTION_SINGLE = 3;
    public static final int TYPE_SMART_SELECTION_MULTI = 4;
    public static final int TYPE_AUTO_SELECTION = 5;
    public static final int TYPE_ACTIONS_SHOWN = 6;
    public static final int TYPE_LINK_CLICKED = 7;
    public static final int TYPE_OVERTYPE = 8;
    public static final int TYPE_COPY_ACTION = 9;
    public static final int TYPE_PASTE_ACTION = 10;
    public static final int TYPE_CUT_ACTION = 11;
    public static final int TYPE_SHARE_ACTION = 12;
    public static final int TYPE_SMART_ACTION = 13;
    public static final int TYPE_SELECTION_DRAG = 14;
    public static final int TYPE_SELECTION_DESTROYED = 15;
    public static final int TYPE_OTHER_ACTION = 16;
    public static final int TYPE_SELECT_ALL = 17;
    public static final int TYPE_SELECTION_RESET = 18;
    public static final int TYPE_MANUAL_REPLY = 19;
    public static final int TYPE_ACTIONS_GENERATED = 20;
    public static final int TYPE_LINKS_GENERATED = 21;
    public static final int TYPE_READ_CLIPBOARD = 22;
    public android.view.textclassifier.TextClassificationSessionId mHiddenTempSessionId;
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifierEvent> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getEventCategory() { return 0; }
    public int getEventType() { return 0; }
    public java.lang.String[] getEntityTypes() { return null; }
    public android.view.textclassifier.TextClassificationContext getEventContext() { return null; }
    void setEventContext(android.view.textclassifier.TextClassificationContext p0) {}
    public java.lang.String getResultId() { return null; }
    public int getEventIndex() { return 0; }
    public float[] getScores() { return null; }
    public java.lang.String getModelName() { return null; }
    public int[] getActionIndices() { return null; }
    public android.icu.util.ULocale getLocale() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String toString() { return null; }
    void toString(java.lang.StringBuilder p0) {}
    public final android.view.textclassifier.SelectionEvent toSelectionEvent() { return null; }

    public static abstract class Builder<T extends android.view.textclassifier.TextClassifierEvent.Builder<T>> {
        public T setEntityTypes(java.lang.String... p0) { return null; }
        public T setEventContext(android.view.textclassifier.TextClassificationContext p0) { return null; }
        public T setResultId(java.lang.String p0) { return null; }
        public T setEventIndex(int p0) { return null; }
        public T setScores(float... p0) { return null; }
        public T setModelName(java.lang.String p0) { return null; }
        public T setActionIndices(int... p0) { return null; }
        public T setLocale(android.icu.util.ULocale p0) { return null; }
        public T setExtras(android.os.Bundle p0) { return null; }
        abstract T self();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Category {
    }

    public static final class ConversationActionsEvent extends android.view.textclassifier.TextClassifierEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent> CREATOR = null;

        public static final class Builder extends android.view.textclassifier.TextClassifierEvent.Builder<android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder> {
            public Builder(int p0) { super(); }
            android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent.Builder self() { return null; }
            public android.view.textclassifier.TextClassifierEvent.ConversationActionsEvent build() { return null; }
        }
    }

    public static final class LanguageDetectionEvent extends android.view.textclassifier.TextClassifierEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent> CREATOR = null;

        public static final class Builder extends android.view.textclassifier.TextClassifierEvent.Builder<android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder> {
            public Builder(int p0) { super(); }
            android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent.Builder self() { return null; }
            public android.view.textclassifier.TextClassifierEvent.LanguageDetectionEvent build() { return null; }
        }
    }

    public static final class TextLinkifyEvent extends android.view.textclassifier.TextClassifierEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent> CREATOR = null;

        public static final class Builder extends android.view.textclassifier.TextClassifierEvent.Builder<android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder> {
            public Builder(int p0) { super(); }
            android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent.Builder self() { return null; }
            public android.view.textclassifier.TextClassifierEvent.TextLinkifyEvent build() { return null; }
        }
    }

    public static final class TextSelectionEvent extends android.view.textclassifier.TextClassifierEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifierEvent.TextSelectionEvent> CREATOR = null;
        final int mRelativeWordStartIndex = 0;
        final int mRelativeWordEndIndex = 0;
        final int mRelativeSuggestedWordStartIndex = 0;
        final int mRelativeSuggestedWordEndIndex = 0;
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int getRelativeWordStartIndex() { return 0; }
        public int getRelativeWordEndIndex() { return 0; }
        public int getRelativeSuggestedWordStartIndex() { return 0; }
        public int getRelativeSuggestedWordEndIndex() { return 0; }
        void toString(java.lang.StringBuilder p0) {}

        public static final class Builder extends android.view.textclassifier.TextClassifierEvent.Builder<android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder> {
            int mRelativeWordStartIndex;
            int mRelativeWordEndIndex;
            int mRelativeSuggestedWordStartIndex;
            int mRelativeSuggestedWordEndIndex;
            public Builder(int p0) { super(); }
            public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeWordStartIndex(int p0) { return null; }
            public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeWordEndIndex(int p0) { return null; }
            public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeSuggestedWordStartIndex(int p0) { return null; }
            public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder setRelativeSuggestedWordEndIndex(int p0) { return null; }
            android.view.textclassifier.TextClassifierEvent.TextSelectionEvent.Builder self() { return null; }
            public android.view.textclassifier.TextClassifierEvent.TextSelectionEvent build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}

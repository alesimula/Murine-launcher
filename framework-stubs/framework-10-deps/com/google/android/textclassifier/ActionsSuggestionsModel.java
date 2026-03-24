package com.google.android.textclassifier;

public class ActionsSuggestionsModel {
    public ActionsSuggestionsModel(int p0, byte[] p1) {}
    public int getVersion(int p0) { return 0; }
    public java.lang.String getLocales(int p0) { return null; }
    public com.google.android.textclassifier.ActionsSuggestionsModel.ActionSuggestion[] suggestActionsWithIntents(com.google.android.textclassifier.ActionsSuggestionsModel.Conversation p0, com.google.android.textclassifier.ActionsSuggestionsModel.ActionSuggestionOptions p1, java.lang.Object p2, java.lang.String p3, com.google.android.textclassifier.AnnotatorModel p4) { return null; }

    public static class ActionSuggestion {
        public ActionSuggestion() {}
        public java.lang.String getActionType() { return null; }
        public byte[] getSerializedEntityData() { return null; }
        public com.google.android.textclassifier.NamedVariant[] getEntityData() { return null; }
        public float getScore() { return 0.0f; }
        public java.lang.String getResponseText() { return null; }
        public com.google.android.textclassifier.RemoteActionTemplate[] getRemoteActionTemplates() { return null; }
    }

    public static class ConversationMessage {
        public ConversationMessage(int p0, java.lang.String p1, long p2, java.lang.String p3, java.lang.String p4) {}
    }

    public static class Conversation {
        public Conversation(com.google.android.textclassifier.ActionsSuggestionsModel.ConversationMessage[] p0) {}
    }

    public static class ActionSuggestionOptions {
        public ActionSuggestionOptions() {}
    }
}

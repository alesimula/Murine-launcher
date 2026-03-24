package com.google.android.textclassifier;

public class AnnotatorModel {
    public AnnotatorModel(int p0) {}
    public int getVersion(int p0) { return 0; }
    public java.lang.String getLocales(int p0) { return null; }
    public int[] suggestSelection(java.lang.String p0, int p1, int p2, com.google.android.textclassifier.AnnotatorModel.SelectionOptions p3) { return null; }
    public com.google.android.textclassifier.AnnotatorModel.ClassificationResult[] classifyText(java.lang.String p0, int p1, int p2, com.google.android.textclassifier.AnnotatorModel.ClassificationOptions p3, java.lang.Object p4, java.lang.String p5) { return null; }
    public com.google.android.textclassifier.AnnotatorModel.AnnotatedSpan[] annotate(java.lang.String p0, com.google.android.textclassifier.AnnotatorModel.AnnotationOptions p1) { return null; }

    public static class ClassificationResult {
        public ClassificationResult() {}
        public com.google.android.textclassifier.RemoteActionTemplate[] getRemoteActionTemplates() { return null; }
        public java.lang.String getCollection() { return null; }
        public com.google.android.textclassifier.AnnotatorModel.DatetimeResult getDatetimeResult() { return null; }
        public float getScore() { return 0.0f; }
        public byte[] getSerializedEntityData() { return null; }
    }

    public static class DatetimeResult {
        public DatetimeResult() {}
        public long getTimeMsUtc() { return 0L; }
    }

    public static class AnnotatedSpan {
        public AnnotatedSpan() {}
        public com.google.android.textclassifier.AnnotatorModel.ClassificationResult[] getClassification() { return null; }
        public int getStartIndex() { return 0; }
        public int getEndIndex() { return 0; }
    }

    public static class SelectionOptions {
        public SelectionOptions(java.lang.String p0, java.lang.String p1) {}
    }

    public static class ClassificationOptions {
        public ClassificationOptions(long p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    }

    public static class AnnotationOptions {
        public AnnotationOptions(long p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.util.Collection p4, int p5, boolean p6) {}
    }

    public static class AnnotationUsecase {
        public AnnotationUsecase() {}
        public com.google.android.textclassifier.AnnotatorModel.AnnotationUsecase SMART = null;
        public int getValue() { return 0; }
    }
}

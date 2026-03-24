package com.android.internal.widget.remotecompose.core.documentation;

public class DocumentedOperation {
    public static final int LAYOUT = 0;
    public static final int INT = 0;
    public static final int FLOAT = 1;
    public static final int BOOLEAN = 2;
    public static final int BUFFER = 4;
    public static final int UTF8 = 5;
    public static final int BYTE = 6;
    public static final int VALUE = 7;
    public static final int LONG = 8;
    public static final int SHORT = 9;
    public static final int FLOAT_ARRAY = 10;
    public static final int INT_ARRAY = 11;
    @android.annotation.NonNull
    final java.lang.String mCategory = null;
    int mId;
    @android.annotation.NonNull
    final java.lang.String mName = null;
    @android.annotation.NonNull
    java.lang.String mDescription;
    boolean mWIP;
    @android.annotation.Nullable
    java.lang.String mTextExamples;
    @android.annotation.NonNull
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.StringPair> mExamples;
    @android.annotation.NonNull
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.OperationField> mFields;
    @android.annotation.NonNull
    java.lang.String mVarSize;
    int mExamplesWidth;
    int mExamplesHeight;
    @android.annotation.NonNull
    public static java.lang.String getType(int p0) { return null; }
    public DocumentedOperation(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    public DocumentedOperation(java.lang.String p0, int p1, java.lang.String p2) {}
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.OperationField> getFields() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCategory() { return null; }
    public int getId() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public boolean isWIP() { return false; }
    @android.annotation.NonNull
    public java.lang.String getVarSize() { return null; }
    public int getSizeFields() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getDescription() { return null; }
    @android.annotation.Nullable
    public java.lang.String getTextExamples() { return null; }
    @android.annotation.NonNull
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.StringPair> getExamples() { return null; }
    public int getExamplesWidth() { return 0; }
    public int getExamplesHeight() { return 0; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation field(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation field(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation possibleValues(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation description(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation examples(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation exampleImage(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.documentation.DocumentedOperation examplesDimension(int p0, int p1) { return null; }
}

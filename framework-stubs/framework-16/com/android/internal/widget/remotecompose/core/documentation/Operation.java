package com.android.internal.widget.remotecompose.core.documentation;

public class Operation {
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
    java.lang.String mCategory;
    int mId;
    java.lang.String mName;
    java.lang.String mDescription;
    boolean mWIP;
    java.lang.String mTextExamples;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.StringPair> mExamples;
    java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.OperationField> mFields;
    java.lang.String mVarSize;
    int mExamplesWidth;
    int mExamplesHeight;
    public static java.lang.String getType(int p0) { return null; }
    public Operation(java.lang.String p0, int p1, java.lang.String p2, boolean p3) {}
    public Operation(java.lang.String p0, int p1, java.lang.String p2) {}
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.OperationField> getFields() { return null; }
    public java.lang.String getCategory() { return null; }
    public int getId() { return 0; }
    public java.lang.String getName() { return null; }
    public boolean isWIP() { return false; }
    public java.lang.String getVarSize() { return null; }
    public int getSizeFields() { return 0; }
    public java.lang.String getDescription() { return null; }
    public java.lang.String getTextExamples() { return null; }
    public java.util.ArrayList<com.android.internal.widget.remotecompose.core.documentation.StringPair> getExamples() { return null; }
    public int getExamplesWidth() { return 0; }
    public int getExamplesHeight() { return 0; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation field(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation field(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation possibleValues(java.lang.String p0, int p1) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation description(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation examples(java.lang.String p0) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation exampleImage(java.lang.String p0, java.lang.String p1) { return null; }
    public com.android.internal.widget.remotecompose.core.documentation.Operation examplesDimension(int p0, int p1) { return null; }
}

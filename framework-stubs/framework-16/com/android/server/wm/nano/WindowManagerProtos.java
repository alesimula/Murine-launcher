package com.android.server.wm.nano;

public interface WindowManagerProtos {

    public static final class LetterboxProto extends com.android.framework.protobuf.nano.MessageNano {
        public static final int LETTERBOX_HORIZONTAL_REACHABILITY_POSITION_LEFT = 0;
        public static final int LETTERBOX_HORIZONTAL_REACHABILITY_POSITION_CENTER = 1;
        public static final int LETTERBOX_HORIZONTAL_REACHABILITY_POSITION_RIGHT = 2;
        public static final int LETTERBOX_VERTICAL_REACHABILITY_POSITION_TOP = 0;
        public static final int LETTERBOX_VERTICAL_REACHABILITY_POSITION_CENTER = 1;
        public static final int LETTERBOX_VERTICAL_REACHABILITY_POSITION_BOTTOM = 2;
        public int letterboxPositionForHorizontalReachability;
        public int letterboxPositionForVerticalReachability;
        public int letterboxPositionForBookModeReachability;
        public int letterboxPositionForTabletopModeReachability;
        public static com.android.server.wm.nano.WindowManagerProtos.LetterboxProto[] emptyArray() { return null; }
        public LetterboxProto() { super(); }
        public com.android.server.wm.nano.WindowManagerProtos.LetterboxProto clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wm.nano.WindowManagerProtos.LetterboxProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.LetterboxProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.LetterboxProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class TaskSnapshotProto extends com.android.framework.protobuf.nano.MessageNano {
        public int orientation;
        public int insetLeft;
        public int insetTop;
        public int insetRight;
        public int insetBottom;
        public boolean isRealSnapshot;
        public int windowingMode;
        public int systemUiVisibility;
        public boolean isTranslucent;
        public java.lang.String topActivityComponent;
        public float legacyScale;
        public long id;
        public int rotation;
        public int taskWidth;
        public int taskHeight;
        public int appearance;
        public int letterboxInsetLeft;
        public int letterboxInsetTop;
        public int letterboxInsetRight;
        public int letterboxInsetBottom;
        public int uiMode;
        public static com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto[] emptyArray() { return null; }
        public TaskSnapshotProto() { super(); }
        public com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.wm.nano.WindowManagerProtos.TaskSnapshotProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}

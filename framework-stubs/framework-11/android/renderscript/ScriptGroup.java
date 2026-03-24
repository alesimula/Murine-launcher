package android.renderscript;

public final class ScriptGroup extends android.renderscript.BaseObj {
    private static final java.lang.String TAG = "ScriptGroup";
    android.renderscript.ScriptGroup.IO[] mOutputs;
    android.renderscript.ScriptGroup.IO[] mInputs;
    private java.lang.String mName;
    private java.util.List<android.renderscript.ScriptGroup.Closure> mClosures;
    private java.util.List<android.renderscript.ScriptGroup.Input> mInputs2;
    private android.renderscript.ScriptGroup.Future[] mOutputs2;
    ScriptGroup(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    ScriptGroup(android.renderscript.RenderScript p0, java.lang.String p1, java.util.List<android.renderscript.ScriptGroup.Closure> p2, java.util.List<android.renderscript.ScriptGroup.Input> p3, android.renderscript.ScriptGroup.Future[] p4) { super(0L, null); }
    public java.lang.Object[] execute(java.lang.Object... p0) { return null; }
    public void setInput(android.renderscript.Script.KernelID p0, android.renderscript.Allocation p1) {}
    public void setOutput(android.renderscript.Script.KernelID p0, android.renderscript.Allocation p1) {}
    public void execute() {}
    public void destroy() {}

    public static final class Binding {
        private final android.renderscript.Script.FieldID mField = null;
        private final java.lang.Object mValue = null;
        public Binding(android.renderscript.Script.FieldID p0, java.lang.Object p1) {}
        android.renderscript.Script.FieldID getField() { return null; }
        java.lang.Object getValue() { return null; }
    }

    public static final class Builder {
        private android.renderscript.RenderScript mRS;
        private java.util.ArrayList<android.renderscript.ScriptGroup.Node> mNodes;
        private java.util.ArrayList<android.renderscript.ScriptGroup.ConnectLine> mLines;
        private int mKernelCount;
        public Builder(android.renderscript.RenderScript p0) {}
        private void validateCycle(android.renderscript.ScriptGroup.Node p0, android.renderscript.ScriptGroup.Node p1) {}
        private void mergeDAGs(int p0, int p1) {}
        private void validateDAGRecurse(android.renderscript.ScriptGroup.Node p0, int p1) {}
        private void validateDAG() {}
        private android.renderscript.ScriptGroup.Node findNode(android.renderscript.Script p0) { return null; }
        private android.renderscript.ScriptGroup.Node findNode(android.renderscript.Script.KernelID p0) { return null; }
        public android.renderscript.ScriptGroup.Builder addKernel(android.renderscript.Script.KernelID p0) { return null; }
        public android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.FieldID p2) { return null; }
        public android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.KernelID p2) { return null; }
        public android.renderscript.ScriptGroup create() { return null; }
    }

    public static final class Builder2 {
        android.renderscript.RenderScript mRS;
        java.util.List<android.renderscript.ScriptGroup.Closure> mClosures;
        java.util.List<android.renderscript.ScriptGroup.Input> mInputs;
        private static final java.lang.String TAG = "ScriptGroup.Builder2";
        public Builder2(android.renderscript.RenderScript p0) {}
        private android.renderscript.ScriptGroup.Closure addKernelInternal(android.renderscript.Script.KernelID p0, android.renderscript.Type p1, java.lang.Object[] p2, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p3) { return null; }
        private android.renderscript.ScriptGroup.Closure addInvokeInternal(android.renderscript.Script.InvokeID p0, java.lang.Object[] p1, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p2) { return null; }
        public android.renderscript.ScriptGroup.Input addInput() { return null; }
        public android.renderscript.ScriptGroup.Closure addKernel(android.renderscript.Script.KernelID p0, android.renderscript.Type p1, java.lang.Object... p2) { return null; }
        public android.renderscript.ScriptGroup.Closure addInvoke(android.renderscript.Script.InvokeID p0, java.lang.Object... p1) { return null; }
        public android.renderscript.ScriptGroup create(java.lang.String p0, android.renderscript.ScriptGroup.Future... p1) { return null; }
        private boolean seperateArgsAndBindings(java.lang.Object[] p0, java.util.ArrayList<java.lang.Object> p1, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p2) { return false; }
    }

    public static final class Closure extends android.renderscript.BaseObj {
        private java.lang.Object[] mArgs;
        private android.renderscript.Allocation mReturnValue;
        private java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> mBindings;
        private android.renderscript.ScriptGroup.Future mReturnFuture;
        private java.util.Map<android.renderscript.Script.FieldID, android.renderscript.ScriptGroup.Future> mGlobalFuture;
        private android.renderscript.FieldPacker mFP;
        private static final java.lang.String TAG = "Closure";
        Closure(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
        Closure(android.renderscript.RenderScript p0, android.renderscript.Script.KernelID p1, android.renderscript.Type p2, java.lang.Object[] p3, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p4) { super(0L, null); }
        Closure(android.renderscript.RenderScript p0, android.renderscript.Script.InvokeID p1, java.lang.Object[] p2, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p3) { super(0L, null); }
        public void destroy() {}
        protected void finalize() throws java.lang.Throwable {}
        private void retrieveValueAndDependenceInfo(android.renderscript.RenderScript p0, int p1, android.renderscript.Script.FieldID p2, java.lang.Object p3, long[] p4, int[] p5, long[] p6, long[] p7) {}
        public android.renderscript.ScriptGroup.Future getReturn() { return null; }
        public android.renderscript.ScriptGroup.Future getGlobal(android.renderscript.Script.FieldID p0) { return null; }
        void setArg(int p0, java.lang.Object p1) {}
        void setGlobal(android.renderscript.Script.FieldID p0, java.lang.Object p1) {}

        private static final class ValueAndSize {
            public long value;
            public int size;
            public ValueAndSize(android.renderscript.RenderScript p0, java.lang.Object p1) {}
        }
    }

    static class ConnectLine {
        android.renderscript.Script.FieldID mToF;
        android.renderscript.Script.KernelID mToK;
        android.renderscript.Script.KernelID mFrom;
        android.renderscript.Type mAllocationType;
        ConnectLine(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.KernelID p2) {}
        ConnectLine(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.FieldID p2) {}
    }

    public static final class Future {
        android.renderscript.ScriptGroup.Closure mClosure;
        android.renderscript.Script.FieldID mFieldID;
        java.lang.Object mValue;
        Future(android.renderscript.ScriptGroup.Closure p0, android.renderscript.Script.FieldID p1, java.lang.Object p2) {}
        android.renderscript.ScriptGroup.Closure getClosure() { return null; }
        android.renderscript.Script.FieldID getFieldID() { return null; }
        java.lang.Object getValue() { return null; }
    }

    static class IO {
        android.renderscript.Script.KernelID mKID;
        android.renderscript.Allocation mAllocation;
        IO(android.renderscript.Script.KernelID p0) {}
    }

    public static final class Input {
        java.util.List<android.util.Pair<android.renderscript.ScriptGroup.Closure, android.renderscript.Script.FieldID>> mFieldID;
        java.util.List<android.util.Pair<android.renderscript.ScriptGroup.Closure, java.lang.Integer>> mArgIndex;
        java.lang.Object mValue;
        Input() {}
        void addReference(android.renderscript.ScriptGroup.Closure p0, int p1) {}
        void addReference(android.renderscript.ScriptGroup.Closure p0, android.renderscript.Script.FieldID p1) {}
        void set(java.lang.Object p0) {}
        java.lang.Object get() { return null; }
    }

    static class Node {
        android.renderscript.Script mScript;
        java.util.ArrayList<android.renderscript.Script.KernelID> mKernels;
        java.util.ArrayList<android.renderscript.ScriptGroup.ConnectLine> mInputs;
        java.util.ArrayList<android.renderscript.ScriptGroup.ConnectLine> mOutputs;
        int dagNumber;
        android.renderscript.ScriptGroup.Node mNext;
        Node(android.renderscript.Script p0) {}
    }
}

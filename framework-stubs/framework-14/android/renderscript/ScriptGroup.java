package android.renderscript;

@java.lang.Deprecated
public final class ScriptGroup extends android.renderscript.BaseObj {
    android.renderscript.ScriptGroup.IO[] mOutputs;
    android.renderscript.ScriptGroup.IO[] mInputs;
    ScriptGroup(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    ScriptGroup(android.renderscript.RenderScript p0, java.lang.String p1, java.util.List<android.renderscript.ScriptGroup.Closure> p2, java.util.List<android.renderscript.ScriptGroup.Input> p3, android.renderscript.ScriptGroup.Future[] p4) { super(0L, null); }
    public java.lang.Object[] execute(java.lang.Object... p0) { return null; }
    public void setInput(android.renderscript.Script.KernelID p0, android.renderscript.Allocation p1) {}
    public void setOutput(android.renderscript.Script.KernelID p0, android.renderscript.Allocation p1) {}
    public void execute() {}
    public void destroy() {}

    public static final class Builder {
        public Builder(android.renderscript.RenderScript p0) {}
        public android.renderscript.ScriptGroup.Builder addKernel(android.renderscript.Script.KernelID p0) { return null; }
        public android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.FieldID p2) { return null; }
        public android.renderscript.ScriptGroup.Builder addConnection(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.KernelID p2) { return null; }
        public android.renderscript.ScriptGroup create() { return null; }
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

    public static final class Closure extends android.renderscript.BaseObj {
        Closure(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
        Closure(android.renderscript.RenderScript p0, android.renderscript.Script.KernelID p1, android.renderscript.Type p2, java.lang.Object[] p3, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p4) { super(0L, null); }
        Closure(android.renderscript.RenderScript p0, android.renderscript.Script.InvokeID p1, java.lang.Object[] p2, java.util.Map<android.renderscript.Script.FieldID, java.lang.Object> p3) { super(0L, null); }
        public void destroy() {}
        protected void finalize() throws java.lang.Throwable {}
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

    public static final class Binding {
        public Binding(android.renderscript.Script.FieldID p0, java.lang.Object p1) {}
        android.renderscript.Script.FieldID getField() { return null; }
        java.lang.Object getValue() { return null; }
    }

    public static final class Builder2 {
        android.renderscript.RenderScript mRS;
        java.util.List<android.renderscript.ScriptGroup.Closure> mClosures;
        java.util.List<android.renderscript.ScriptGroup.Input> mInputs;
        public Builder2(android.renderscript.RenderScript p0) {}
        public android.renderscript.ScriptGroup.Input addInput() { return null; }
        public android.renderscript.ScriptGroup.Closure addKernel(android.renderscript.Script.KernelID p0, android.renderscript.Type p1, java.lang.Object... p2) { return null; }
        public android.renderscript.ScriptGroup.Closure addInvoke(android.renderscript.Script.InvokeID p0, java.lang.Object... p1) { return null; }
        public android.renderscript.ScriptGroup create(java.lang.String p0, android.renderscript.ScriptGroup.Future... p1) { return null; }
    }

    static class ConnectLine {
        android.renderscript.Script.FieldID mToF;
        android.renderscript.Script.KernelID mToK;
        android.renderscript.Script.KernelID mFrom;
        android.renderscript.Type mAllocationType;
        ConnectLine(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.KernelID p2) {}
        ConnectLine(android.renderscript.Type p0, android.renderscript.Script.KernelID p1, android.renderscript.Script.FieldID p2) {}
    }

    static class IO {
        android.renderscript.Script.KernelID mKID;
        android.renderscript.Allocation mAllocation;
        IO(android.renderscript.Script.KernelID p0) {}
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

package android.filterfw.io;

public class TextGraphReader extends android.filterfw.io.GraphReader {
    private java.util.ArrayList<android.filterfw.io.TextGraphReader.Command> mCommands;
    private android.filterfw.core.Filter mCurrentFilter;
    private android.filterfw.core.FilterGraph mCurrentGraph;
    private android.filterfw.core.KeyValueMap mBoundReferences;
    private android.filterfw.core.KeyValueMap mSettings;
    private android.filterfw.core.FilterFactory mFactory;
    public TextGraphReader() { super(); }
    public android.filterfw.core.FilterGraph readGraphString(java.lang.String p0) throws android.filterfw.io.GraphIOException { return null; }
    private void reset() {}
    private void parseString(java.lang.String p0) throws android.filterfw.io.GraphIOException {}
    public android.filterfw.core.KeyValueMap readKeyValueAssignments(java.lang.String p0) throws android.filterfw.io.GraphIOException { return null; }
    private android.filterfw.core.KeyValueMap readKeyValueAssignments(android.filterfw.io.PatternScanner p0, java.util.regex.Pattern p1) throws android.filterfw.io.GraphIOException { return null; }
    private void bindExternal(java.lang.String p0) throws android.filterfw.io.GraphIOException {}
    private void checkReferences() throws android.filterfw.io.GraphIOException {}
    private void applySettings() throws android.filterfw.io.GraphIOException {}
    private void expectSettingClass(java.lang.String p0, java.lang.Object p1, java.lang.Class p2) throws android.filterfw.io.GraphIOException {}
    private void executeCommands() throws android.filterfw.io.GraphIOException {}

    private class InitFilterCommand implements android.filterfw.io.TextGraphReader.Command {
        private android.filterfw.core.KeyValueMap mParams;
        public InitFilterCommand(android.filterfw.io.TextGraphReader p0, android.filterfw.core.KeyValueMap p1) {}
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException {}
    }

    private class ImportPackageCommand implements android.filterfw.io.TextGraphReader.Command {
        private java.lang.String mPackageName;
        public ImportPackageCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1) {}
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException {}
    }

    private class ConnectCommand implements android.filterfw.io.TextGraphReader.Command {
        private java.lang.String mSourceFilter;
        private java.lang.String mSourcePort;
        private java.lang.String mTargetFilter;
        private java.lang.String mTargetName;
        public ConnectCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
        public void execute(android.filterfw.io.TextGraphReader p0) {}
    }

    private static interface Command {
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException;
    }

    private class AllocateFilterCommand implements android.filterfw.io.TextGraphReader.Command {
        private java.lang.String mClassName;
        private java.lang.String mFilterName;
        public AllocateFilterCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1, java.lang.String p2) {}
        public void execute(android.filterfw.io.TextGraphReader p0) throws android.filterfw.io.GraphIOException {}
    }

    private class AddLibraryCommand implements android.filterfw.io.TextGraphReader.Command {
        private java.lang.String mLibraryName;
        public AddLibraryCommand(android.filterfw.io.TextGraphReader p0, java.lang.String p1) {}
        public void execute(android.filterfw.io.TextGraphReader p0) {}
    }
}

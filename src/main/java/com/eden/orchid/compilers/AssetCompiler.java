package com.eden.orchid.compilers;

public interface AssetCompiler extends Compiler {
    String getKey();
    String getSourceDir();
    String getDestDir();

    String compile(String extension, String input, Object... data);
    String getOutputExtension();
    String[] getSourceExtensions();
    int priority();
}
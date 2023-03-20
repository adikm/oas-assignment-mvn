package org.oas.assignment;

public class PathAnalyzer {

    /**
     * given a path separated with slashes returns the length of the path and the longest path element
     *
     * @param path input path
     * @return analyze result
     */
    public PathAnalyzeResult analyze(String path) {         // TODO fix the code
        int pathLength = path.length() - 2;
        String longestElement = path;

        return new PathAnalyzeResult(pathLength, longestElement);
    }
}

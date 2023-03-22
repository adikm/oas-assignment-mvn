package org.oas.assignment;

public class PathAnalyzer {

    /**
     * given a path separated with slashes returns the number of elements contained in the path and the longest path element
     * example:
     * input -> hi/dear/human
     * result -> PathAnalyzeResult{length: 3, longestElement: "human"}
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

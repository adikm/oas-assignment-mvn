package org.oas.assignment;

public class PathAnalyzeResult {

    private final int pathLength;
    private final String longestElement;

    public PathAnalyzeResult(final int pathLength, final String longestElement) {
        this.pathLength = pathLength;
        this.longestElement = longestElement;
    }

    public int getPathLength() {
        return pathLength;
    }

    public String getLongestElement() {
        return longestElement;
    }

    @Override
    public String toString() {
        return "PathAnalyzeResult{" +
                "pathLength=" + pathLength +
                ", longestElement='" + longestElement + '\'' +
                '}';
    }
}

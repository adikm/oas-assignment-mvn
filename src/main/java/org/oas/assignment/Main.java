package org.oas.assignment;

public class Main {
    public static void main(String[] args) {
        PathAnalyzer pathAnalyzer = new PathAnalyzer();
        PathAnalyzeResult result = pathAnalyzer.analyze("OAS/is/us");
        System.out.println(result);
    }
}
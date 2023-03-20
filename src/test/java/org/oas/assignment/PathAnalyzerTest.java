package org.oas.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathAnalyzerTest {

    private final PathAnalyzer uut = new PathAnalyzer();

    @Test
    public void testSingleElementInPath_ok() {
        // given
        String inputPath = "foo";

        // when
        PathAnalyzeResult result = uut.analyze(inputPath);

        // then
        assertNotNull(result);
        assertEquals(1, result.getPathLength());
        assertEquals("foo", result.getLongestElement());
    }

    @Test
    public void testMultipleElementsInPath_ok() {
        // given
        String inputPath = "i/am/a/teapot";

        // when@
        PathAnalyzeResult result = uut.analyze(inputPath);

        // then
        assertNotNull(result);
        assertEquals(4, result.getPathLength());
        assertEquals("teapot", result.getLongestElement());
    }

    @Test
    public void testEmptyInputPath_shouldThrowException() {
        // given
        String inputPath = "";

        // when then
        assertThrows(IllegalArgumentException.class, () -> uut.analyze(inputPath));
    }

    @Test
    public void testMalformedPath_shouldGetSanitized() {
        // given
        String inputPath = "is/some one/a/teapot";

        // when
        PathAnalyzeResult result = uut.analyze(inputPath);

        // then
        assertNotNull(result);
        assertEquals(4, result.getPathLength());
        assertEquals("someone", result.getLongestElement());
    }


}
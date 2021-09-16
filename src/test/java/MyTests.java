import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testToLower() {
        assertEquals('a', MyMain.toLower('A'), "Calling toLower on the char \'A\' should output: a");
        assertEquals('b', MyMain.toLower('B'), "Calling toLower on the char \'B\' should output: b");
        assertEquals('c', MyMain.toLower('C'), "Calling toLower on the char \'C\' should output: c");
        assertEquals('z', MyMain.toLower('Z'), "Calling toLower on the char \'Z\' should output: z");
        assertEquals('a', MyMain.toLower('a'), "Calling toLower on the char \'a\' should output: a");
        assertEquals('d', MyMain.toLower('d'), "Calling toLower on the char \'d\' should output: d");
        assertEquals('f', MyMain.toLower('f'), "Calling toLower on the char \'f\' should output: f");
        assertEquals('z', MyMain.toLower('z'), "Calling toLower on the char \'z\' should output: z");
        assertEquals('*', MyMain.toLower('*'), "Calling toLower on the char \'*\' should output: *");
        assertEquals('1', MyMain.toLower('1'), "Calling toLower on the char \'1\' should output: 1");
    }

    @Test
    public void testToUpper() {
        assertEquals('A', MyMain.toUpper('A'), "Calling toUpper on the char \'A\' should output: A");
        assertEquals('B', MyMain.toUpper('B'), "Calling toUpper on the char \'B\' should output: B");
        assertEquals('C', MyMain.toUpper('C'), "Calling toUpper on the char \'C\' should output: C");
        assertEquals('Z', MyMain.toUpper('Z'), "Calling toUpper on the char \'Z\' should output: Z");
        assertEquals('A', MyMain.toUpper('a'), "Calling toUpper on the char \'a\' should output: A");
        assertEquals('D', MyMain.toUpper('d'), "Calling toUpper on the char \'d\' should output: D");
        assertEquals('F', MyMain.toUpper('f'), "Calling toUpper on the char \'f\' should output: F");
        assertEquals('Z', MyMain.toUpper('z'), "Calling toUpper on the char \'z\' should output: Z");
        assertEquals('*', MyMain.toUpper('*'), "Calling toUpper on the char \'*\' should output: *");
        assertEquals('1', MyMain.toUpper('1'), "Calling toUpper on the char \'1\' should output: 1");
    }

    @Test
    public void testRemoveNumbers() {
        assertEquals("hello world!", MyMain.removeNumbers("h1e2l3l4o5 6w7o8r9l0d00!"), "Calling removeNumbers on the string \"h1e2l3l4o5 6w7o8r9l0d00!\" should output: hello world!");
        assertEquals("the athenian school", MyMain.removeNumbers("151111the athenian school22224"), "Calling removeNumbers on the string \"151111the athenian school22224\" should output: the athenian school");
        assertEquals("apple orange banana", MyMain.removeNumbers("1a2p3p4l5e 6o7r8a9n0g1e 2b3a4n555ana688"), "Calling removeNumbers on the string \"1a2p3p4l5e 6o7r8a9n0g1e 2b3a4n555ana688\" should output: apple orange banana");
        assertEquals("cranberry dragonfruit fig", MyMain.removeNumbers("72cran23be2r1ry dr453agon12fr3uit 33fi2g72"), "Calling removeNumbers on the string \"72cran23be2r1ry dr453agon12fr3uit 33fi2g72\" should output: cranberry dragonfruit fig");
    }
}

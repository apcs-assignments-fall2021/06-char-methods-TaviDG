# Char Methods Assignment

In this assignment, you'll be writing three methods to carry out some char operations. 

The first method is toLower(). This method changes an uppercase char to a lowercase char. The method takes a char as input; if the char is not an uppercase letter, it returns the char unchaged. Otherwise, it returns the lowercase equivalent of the uppercase letter. The method has the following signature: public static char toLower(char ch) {}

The second method is toUpper(). This method changes an lowercase char to a uppercase char. The method takes a char as input; if the char is not an lowercase letter, it returns the char unchaged. Otherwise, it returns the uppercase equivalent of the lowercase letter. The method has the following signature: public static char toUpper(char ch) {}

The third method is removeNumbers(). The method is given a String as input and returns a new String where all of the numbers have been removed from the original String. You should use apply what you know about chars and ASCII to determine which chars are numbers. The method has the following signature: public static String removeNumbers(String str) {}

You should write some code in main to test that your methods are functioning properly.

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
The easiest way to run your code is to press the play button in [MyMain.java](src/main/java/MyMain.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```
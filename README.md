**cucumber-jvm example with gradle**

This is an example Java project with [cucumber](https://cucumber.io/) tests.

The project is built with [gradle](https://gradle.org/) with the help of [ cucumber-jvm plugin](https://github.com/samueltbrown/gradle-cucumber-plugin).

Project structure is inspired by this blog [post](https://thomassundberg.wordpress.com/2014/05/29/cucumber-jvm-hello-world/).

The application is composed of a class called CukeBucket which represents a bucket that has maximum capacity of 200 cucumbers.
If you add 1 cucumber over 200 - the bucket will crack.

run tests with:

    gradle cucumber

The test on master branch is failing on purpose.

If you want the test to pass - change line 4 of src/cucumber/resources/link/otomato/gradlecuke/bucket.feature
to read:

    Given I have 200 cukes in my bucket


feel free to post questions in github issues

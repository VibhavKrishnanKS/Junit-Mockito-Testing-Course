# 31. Conditional Tests - Overview

1. You don't have the need to run a method in the test because the test is broken - and we need the dev team to fix it yet
2. Another case is that the test should run only for a specific versino of Java(Java 18) or range of version(13-18)
3. A test should run only on a specific operating system: MSWindows, Mac, Linux
4. A test should only run if specific environment variables or system properties are set

### Note:- We can't comment those types of code then it will not be displayed in the test reports 

### The below annotations can be applied on the class level or Method level
| Annotation | Description |
| -------- | ------- |
| @Disable | Disable a test method|
| @EnabledOnOs | Enable test when running on a given operating system|


```Java
// The below method(test) will not execute but it will show up in the test results as being an ignored test
@Disabled("Don't run until JIRA #123 is resolved")
void basicTest()

// The below test will only run on Microsoft windows
@EnabledOnOs(OS.WINDOWS)

// The below test will only run on MAC
@EnabledOnOs(OS.MAC)

// The below test will run on both MAC and Microsoft
@EnabledOnOs({OS.WINDOWS,OS.MAC})

// This test will be enabled only On Linux
@EnabledOnOs(OS.LINUX)
```
### Disabled tests will never get executed until the criteria that is given is met

| Annotation | Description |
| -------- | ------- |
| @EnabledOnJre | Enable test for a given Java Version|
| @EnabledOnJreRange | Enable test for a given Java Version Range|

```Java
// This will run on Java 17
@EnabledOnJre(JRE.JAVA_17)
// This will run on Java 13
@EnableOnJre(JRE.JAVA_13)
// This will run from Java 13 - 18
@EnableOnJreRange(min=JRE.JAVA_13,max=JRE.JAVA_18)
// This will run from Java 13 or higher
@EnableOnJreRange(min=JRE.JAVA_13)
```

| Annotation | Description |
| -------- | ------- |
| @EnabledIfSystemProperty | Enable test based on System Property|
| @EnabledIfEnvironmentVariable | Enable test based on Environment Variable|

```Java
// For this under the Edit Run Configuration, under the Build and run category we set the SDK version to 17 and then set the system property as - (-ea -DLUV2CODE_SYS_PROP=CI_CD_DEPLOY)
@EnabledIfSystemProperty(named="LUV2CODE_SYS_PROP",matches="CI_CD_DEPLOY")

// Another example - In order to run a test based on Environment Variables (You can set it under the Edit Run Configuration in the Environment Variables field - LUV2CODE_ENV=DEV)
@EnabledIfEnvironmentVariable(named="LUV2CODE_ENV", matched="DEV")
```



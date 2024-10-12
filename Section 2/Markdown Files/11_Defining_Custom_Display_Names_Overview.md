# 12. Defining Custom Display Names - Overview

1. Currently the method names are listed in test results 
2. We'd like to give custom display names
    1. Provide a more descriptive name for the test 
    2. Include spaces, special characters: Test for Equality to support JIRA #123
    3. Useful for sharting test repo, with project management and non techies


### DisplayName - Annotation 
| Annotation | Description |
| -------- | ------- |
| @DisplayName | Custom display name with spaces, special characters and emojis. <br> Useful for test reports in IDE or external test runner|


### Junit can generate display names for you 
| Name | Description |
| -------- | ------- |
| Simple | Removes trailing parenthesis from test method name|
| ReplaceUnderscores | Replaces underscores in test method name with spaces|
| IndicativeSentence | Generate sentence based on test class name and test method name|



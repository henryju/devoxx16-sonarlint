# devoxx16-sonarlint

## 1 Setup

1. Start with an empty Maven project, configured with source level 8, and following dependencies: logback-classic, junit, assertj and jsr305
2. Copy the initial CSV file in src/test/resources

## 2 Read CSV file

1. Open a new BufferedFileReader in a try...catch => SonarLint report it should be closed and exception should be logged
2. Fix the lost exception by using a logger
3. Fix the unclosed resource using try...with
 
## 3 Parse line

## 4 Handle blank weight

1. Add one more nested if => SonarLint report too deep if and merge if statement
2. Fix by extracting method + merge if statements
 
## 5 Support CSV comments

1. Trim line to null then use startsWith => no issue
2. Add @CheckForNull on trimToNull method => SonarLint reports potential NPE

## 6 Format V2

1. Add some entried in CSV file having an extra column in first position
2. Modify code to detect format V1 or V2 and badly write a condition so that SonarLint detect always true/always false


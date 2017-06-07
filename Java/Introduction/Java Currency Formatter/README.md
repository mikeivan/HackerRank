## Java Currency Formatter

[Link to challenge](https://www.hackerrank.com/challenges/java-currency-formatter)

### What I learned
- Java NumberFormat class
    - getCurrencyInstance()
    - setMaximumFractionDigits()
    - setMinimumFractionDigits()
    - format()

### Difficulties
Formatting for USA, China and France was simply using setCurrencyInstance() with the corresponding 
LOCALE.COUNTRY. India required manually setting up the string and setting the decimal to two places.
I only found out the improper formatting from the test case result - namely the minimum decimal needing
to be set.

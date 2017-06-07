## Java Date and Time

[Link to challenge](https://www.hackerrank.com/challenges/java-date-and-time)

### What I learned
- Java Calendar class
    - getInstance() - get a Calendar object
    - set(year, month, day)
    - get(dayofweek)
    - Calendar enums, eg: Calendar.SUNDAY

### Difficulties
This entire class was new to me. Getting the initial Calendar object was different, since you don't
declare a "new" anything, you just get an instance. The second thing was that months range from 0-11
and not 1-12. I thought I was initializing my Calendar wrong or something since I kept getting the 
wrong answer.

### Thoughts/Notes
I know that counting starts at 0 in programming, it was counter-intuitive to have the months start
at 0, since both the day and year and the same and month is really month-1.

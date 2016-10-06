## Introduction
This is an easy question in [HackerRank](https://www.hackerrank.com/challenges/30-binary-numbers)

## Problem I met
- At the start, I got no idea about how to convert decimal number to binary number, I intended to use brute-force, that is, do it by writing my own method.
- After passing two test case, I submitted the answer and found there are still 2 test case failed.

## How I solve this problem then
- Following the provided [tutorial](https://www.hackerrank.com/challenges/30-binary-numbers/tutorial), I learned that there is a handy funciton called Integer.toBinaryString(n), which convert the integer to a string of binary number directly.
- Manually checking the failed test case, I found the problem is that is the last several digit makes the longest consecutive '1', my solution failed because I need another comparison between maxConsecutiveOne and consecutiveOne, I did it, and therefore solve this problem.

## What I learned from this question
- Learn how to convert Integer to string of binary number using provided library function.
- Remind me that sometimes the comparison inside the loop need to be used again after the loop finishes.

## Acknowledgement
- Thanks for [HackerRank](https://www.hackerrank.com) provides the spec of this problem and the Java skeleton.

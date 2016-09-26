## Introduction
This is an easy question in [HackerRank](https://www.hackerrank.com/challenges/circular-array-rotation)

## Problem I met
- At first I use the brute force approach to solve this problem:
    - Read all numbers in and store them in an array, then write an algorithm to reorder them. This works fine for most of the test case, but there exists some test case that this version of code can't solve due to reading time limit.

## How I solve this problem then
- I realised that I can store the digit directly to the final position since the size of array and how many times the array need to be rotated are all known.

## Acknowledgement
- Thanks for [HackerRank](https://www.hackerrank.com) provides the spec of this problem and the Java skeleton.

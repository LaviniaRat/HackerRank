### URL

https://www.hackerrank.com/challenges/service-lane/problem

### Problem description

A driver is driving on the freeway. The check engine light of his vehicle is on, and the driver wants to get service
immediately. Luckily, a service lane runs parallel to the highway. It varies in width along its length.

You will be given an array of widths at points along the road (indices), then a list of the indices of entry and exit
points. Considering each entry and exit point pair, calculate the maximum size vehicle that can travel that segment of
the service lane safely.

### Example

n =4

width = [2,3,2,1]

cases = [[1,2],[2,4]]

If the entry index, i=1 and the exit, j=2 , there are two segment widths of  2 and respectively 3. The widest vehicle that can fit
through both is  2. If i =2 and j = 4, the widths are [3,2,1] which limits vehicle width to 1.

###Function Description

Complete the serviceLane function in the editor below.

serviceLane has the following parameter(s):

int n: the size of width the  array

int cases[t][2]: each element contains the starting and ending indices for a segment to consider, inclusive

int[]width: list of widths

###Returns


int[t]: the maximum width vehicle that can pass through each segment of the service lane described



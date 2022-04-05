### URL
https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true

Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters. Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. The format of Lisa's book is as follows:

-There are n chapters in Lisa's workbook, numbered from 1 to n.

-The i_th  chapter has arr[i] problems, numbered from 1 to arr[i].

Each page can hold up to k problems. Only a chapter's last page of exercises may contain fewer than k problems.

Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.

The page number indexing starts at 1.

### Function Description

Complete the workbook function in the editor below.

workbook has the following parameter(s):

int n: the number of chapters
int k: the maximum number of problems per page
int arr[n]: the number of problems in each chapter
### Returns
- int: the number of special problems in the workbook



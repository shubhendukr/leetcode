You are given a doubly linked list which in addition to the next and previous pointers, it could have a child pointer, which may or may not point to a separate doubly linked list. These child lists may have one or more children of their own, and so on, to produce a multilevel data structure, as shown in the example below.

Flatten the list so that all the nodes appear in a single-level, doubly linked list. You are given the head of the first level of the list.

**Example 1:**
<pre>
<code>
<b>Input:</b> head = [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
<b>Output:</b> [1,2,3,7,8,11,12,9,10,4,5,6]
<b>Explanation:</b>The multilevel linked list in the input is as follows:
<img src="https://assets.leetcode.com/uploads/2018/10/12/multilevellinkedlist.png"/>
After flattening the multilevel linked list it becomes:
<img src="https://assets.leetcode.com/uploads/2018/10/12/multilevellinkedlistflattened.png" />
</code>
</pre>

**Example 2:**
<pre>
<code>
<b>Input:</b> head = [1,2,null,3]
<b>Output:</b> [1,3,2]
<b>Explanation:</b>
The input multilevel linked list is as follows:

  1---2---NULL
  |
  3---NULL
</code>
</pre>

**Example 3:**
<pre>
<code>
<b>Input:</b> head = []
<b>Output:</b> []
<b>Explanation:</b> The maximum width existing in the second level with the length 2 (3,2).
</code>
</pre>

**How multilevel linked list is represented in test case:**

We use the multilevel linked list from  **Example 1**  above:
<pre>
<code>
 1---2---3---4---5---6--NULL
         |
         7---8---9---10--NULL
             |
             11--12--NULL
</code>
</pre>

The serialization of each level is as follows:
<pre>
<code>
[1,2,3,4,5,6,null]
[7,8,9,10,null]
[11,12,null]
</code>
</pre>

To serialize all levels together we will add nulls in each level to signify no node connects to the upper node of the previous level. The serialization becomes:
<pre>
<code>
[1,2,3,4,5,6,null]
[null,null,7,8,9,10,null]
[null,11,12,null]
</code>
</pre>

Merging the serialization of each level and removing trailing nulls we obtain:
<pre>
<code>
[1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]
</code>
</pre>

**Constraints:**

-   Number of Nodes will not exceed 1000.
-   `1 <= Node.val <= 10^5`

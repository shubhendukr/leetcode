Given two numbers, `hour` and `minutes`. Return the smaller angle (in degrees) formed between the `hour` and the `minute` hand.

**Example 1:**
<pre>
<code>
<img src="https://assets.leetcode.com/uploads/2019/12/26/sample_1_1673.png" width="40%">
<b>Input:</b> hour = 12, minutes = 30
<b>Output:</b> 165
</code>
</pre>

**Example 2:**
<pre>
<code>
<img src="https://assets.leetcode.com/uploads/2019/12/26/sample_2_1673.png" width="40%">
<b>Input:</b> hour = 3, minutes = 30
<b>Output:</b> 75
</code>
</pre>

**Example 3:**
<pre>
<code>
<img src="https://assets.leetcode.com/uploads/2019/12/26/sample_3_1673.png" width="40%">
<b>Input:</b> hour = 3, minutes = 15
<b>Output:</b> 7.5
</code>
</pre>

**Example 4:**
<pre>
<code>
<b>Input:</b> hour = 4, minutes = 50
<b>Output:</b> 155
</code>
</pre>

**Example 5:**
<pre>
<code>
<b>Input:</b> hour = 12, minutes = 0
<b>Output:</b> 0
</code>
</pre>


**Constraints:**

-   `1 <= hour <= 12`
-   `0 <= minutes <= 59`
-   Answers within `10^-5` of the actual value will be accepted as correct.

<div id="2aff8o59-instruction">
<div class="ps-content-wrapper-v0">
<p>Given an integer array, <em>numbers, </em>count the number of elements that occur more than once.</p>
<p>&nbsp;</p>

<p class="section-title">Example</p>
<p><em>numbers = [1, 3, 3, 4, 4, 4]</em></p>
<p>&nbsp;</p>
<p>There are two non-unique elements: <em>3</em>&nbsp;and <em>4.</em></p>
<p>&nbsp;</p>
<p class="section-title">Function Description</p>
<p>Complete the function <em>countNonUnique</em> in the editor below.</p>
<p>&nbsp;</p>
<p><em>countNonUnique</em> has the following parameter(s):</p>
<p>&nbsp;&nbsp;&nbsp; <em>int numbers[n]:</em>&nbsp; an array of integers</p>
<p>&nbsp;</p>
<p>Returns:</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;<em>int: </em>an integer that denotes the number of non-unique values in the <em>numbers </em>array</p>
<p>&nbsp;</p>
<p class="section-title">Constraints</p>
<ul>
	<li><em>1 ≤ n ≤ 1000</em></li>
	<li><em>1 ≤ numbers[i]&nbsp;≤ 1000,&nbsp;0 ≤ i &lt; n</em></li>
</ul>
<p>&nbsp;</p>
<!--       <StartOfInputFormat> DO NOT REMOVE THIS LINE-->
<details><summary class="section-title">Input Format Format for Custom Testing</summary>
<div class="collapsable-details">
<p>Input from stdin will be processed as follows and passed to the function.</p>
<p>&nbsp;</p>
<p>The first line contains an integer <em>n</em>, the size of the <em>numbers</em> array.</p>
<p>Each of the next <em>n</em> lines contains an integer, <em>numbers[i],</em> where <em>0 ≤ i &lt; n.</em></p>
</div>
</details>
<!--        </StartOfInputFormat> DO NOT REMOVE THIS LINE-->
<details open="open"><summary class="section-title">Sample Case 0</summary>
<div class="collapsable-details">
<p class="section-title">Sample Input</p>
<pre>STDIN     Function
-----     -----
8      →  numbers[] size n = 8 
1      →  numbers = [1, 3, 1, 4, 5, 6, 3, 2]
3
1
4
5
6
3
2 </pre>
<p class="section-title">Sample Output</p>
<pre>2</pre>
<p class="section-title">Explanation</p>
<p>The values <em>1</em> and <em>3</em> occur more than once, therefore the answer is <em>2. </em></p>
</div>
</details>
<details><summary class="section-title">Sample Case 1</summary>
<div class="collapsable-details">
<p class="section-title">Sample Input</p>
<pre>STDIN     Function
-----     -----
6      →  numbers[] size n = 6
1      →  numbers = [1, 1, 2, 2, 2, 3]
1
2
2
2
3
</pre>
<p class="section-title">Sample Output</p>
<pre>2</pre>
<p class="section-title">Explanation</p>
<p>The values <em>1</em> and <em>2</em> occur more than once, therefore the answer is <em>2. </em></p>
</div>
</details>
</div>
</div>
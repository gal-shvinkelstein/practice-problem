<div class="coding-question__left-pane"><section><h1 class="question-view__title"> Perfect Substring</h1></section><section class="question-view__instruction"><div class="candidate-rich-text"><div id="7o8lell38fr-instruction">
<p>A string&nbsp;<em>s</em>&nbsp;comprised of digits from&nbsp;<em>0</em>&nbsp;to&nbsp;<em>9</em> contains a perfect substring if all the elements within a substring occur exactly&nbsp;<em>k</em>&nbsp;times.&nbsp;Calculate the&nbsp;number of perfect substrings&nbsp;in <em>s</em>.</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<p><strong>Example</strong></p>
<div class="ps-content-wrapper-v0">
<p><em>s = 1102021222</em></p>
<p><em>k = 2</em></p>
<p>The <em>6</em><em> </em>perfect substrings are:</p>
<ol>
	<li><em>s[0:1] = 11</em></li>
	<li><em>s[0:5] = 110202</em></li>
	<li><em>s[1:6] = 102021</em></li>
	<li><em>s[2:5] = 0202</em></li>
	<li><em>s[7:8] = 22</em></li>
	<li><em>s[8:9] = 22</em></li>
</ol>
&nbsp;
<p class="section-title">Function Description</p>
<p>Complete the function <em>perfectSubstring</em> in the editor below.</p>
<p>&nbsp;</p>
<p>perfectSubstring has the following parameters:</p>
<p><em>&nbsp;&nbsp;&nbsp;&nbsp;str s</em>: a string where the value of each element <em>s[i]</em> is described by the character at position <em>i</em> (where 0 ≤ i &lt; n)</p>
<p><em>&nbsp;&nbsp;&nbsp;&nbsp;int k</em>: an integer that denotes the required frequency of the substring</p>
<p><strong>Output</strong></p>
<p><strong>&nbsp;&nbsp;&nbsp;&nbsp;</strong><em>int:</em>&nbsp; an integer that represents the number of perfect substrings in the given string</p>
<p>&nbsp;</p>
<p class="section-title">Constraints</p>
<ul>
	<li>1&nbsp;<em>≤ sizeof(s)&nbsp;≤ 10<sup>5</sup></em>
</li>
	<li>0 <em>≤ s[i]</em>&nbsp;<em>≤ 9&nbsp;</em>(where&nbsp;<em>0 ≤ i &lt; n</em>)</li>
	<li>1&nbsp;<em>≤ k&nbsp;≤ 10<sup>5</sup></em>
</li>
</ul>
<p>&nbsp;</p>
<!-- <StartOfInputFormat> DO NOT REMOVE THIS LINE-->
<details><summary class="section-title">Input Format For Custom Testing</summary>
<div class="collapsable-details">
<p>The first line will contain a string, <em>s</em>.</p>
<p>The second line will contain an integer, <em>k</em>, the required frequency of the characters in a perfect substring.</p>
</div>
</details>
<!-- </StartOfInputFormat> DO NOT REMOVE THIS LINE-->
<details open="open"><summary class="section-title">Sample Case 0</summary>
<div class="collapsable-details">
<p class="section-title">Sample Input For Custom Testing</p>
<pre>STDIN &nbsp; &nbsp; &nbsp;   Function
----- &nbsp; &nbsp; &nbsp;   --------
1020122   →   s = '1020122' 
2&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; →   k = 2</pre>
<p class="section-title">Sample Output</p>
<pre>2</pre>
<p class="section-title">Explanation</p>
<p>&nbsp;</p>
<p>Perfect substrings are:</p>
<p><em>s[0:5] = 102012<br>
s[5:6] = 22</em></p>
</div>
</details>
<details open=""><summary class="section-title">Sample Case 1</summary>
<div class="collapsable-details">
<p class="section-title">Sample Input For Custom Testing</p>
<pre>STDIN &nbsp; &nbsp; &nbsp;   Function 
----- &nbsp; &nbsp; &nbsp;   -------- 
1221221121 → &nbsp;s = '1221221121'
3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  → &nbsp;k = 3
</pre>
<p class="section-title">Sample Output</p>
<pre>3</pre>
<p class="section-title">Explanation</p>
<p>&nbsp;</p>
<p>Perfect substrings are:</p>
<p><em>s[2:7] = 212211<br>
s[3:8] = 122112&nbsp;<br>
s[4:9] = 221121</em></p>
</div>
</details>
</div>
</div></div></section></div>
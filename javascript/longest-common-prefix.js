/**
 * @param {string[]} strs
 * @return {string}
 */
/*
https://leetcode.com/problems/longest-common-prefix/solution/
*/
 var longestCommonPrefix = function(strs) {
  // assume all input are lowercase a-z
  // from first str, check if next ones contains each first character
  const firstStr = strs[0]; 
  if (!firstStr) {
      return "";
  }
  if (strs.length === 1) {
      return firstStr;
  }
  
  let isPrefix = true;
  let chr = 0;
  while (isPrefix && chr < firstStr.length) {
      isPrefix = strs.every(str => str[chr] === firstStr[chr]);
      if (isPrefix) chr++;
  }
  return firstStr.substring(0, chr);
};

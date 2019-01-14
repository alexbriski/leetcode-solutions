/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
  let i = 0;
  for (let j = 0; j < nums.legth; j++) {
      if (nums[i] !== val) {
          nums[i] = nums[j];
          i++;
      }
  }
  return i;
};

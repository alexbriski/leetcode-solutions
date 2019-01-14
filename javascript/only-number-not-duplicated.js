var singleNumber = function(nums) {
  for (let i = 0; i < nums.length; i++) {
    if (nums.filter(num => num === nums[i]).length < 2) {
      return nums[i];
    }
  }
  return null;
};

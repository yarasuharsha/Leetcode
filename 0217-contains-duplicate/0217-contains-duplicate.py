class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        arr=nums.sort()
        bool=False
        for i in range(1,len(nums)):
            if(nums[i-1]==nums[i]):
                bool=True
        return bool




        
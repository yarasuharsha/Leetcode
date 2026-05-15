class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        count={}
        for ch in s:
            if ch in count:
                count[ch]+=1
            else:
                count[ch]=1
        maxvowel=0
        maxcons=0
        for ch in count:
            if ch in "aeiou":
                maxvowel=max(maxvowel,count[ch])
            else:
                maxcons=max(maxcons,count[ch])
        return maxvowel+maxcons

        
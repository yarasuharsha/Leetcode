class Solution(object):
    def isAcronym(self, words, s):
        """
        :type words: List[str]
        :type s: str
        :rtype: bool
        """
        strr=""
        for i in words:
            strr+=i[0]
        if(strr==s):
            return True
        return False
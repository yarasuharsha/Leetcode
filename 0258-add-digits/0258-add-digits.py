class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        
        while (num>=10):
            s=0
            while(num>0):
                temp=num%10
                s+=temp
                num=num//10
            num=s
        return num

        
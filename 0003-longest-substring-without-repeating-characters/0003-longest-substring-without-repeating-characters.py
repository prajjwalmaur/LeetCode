class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        count  = 0
        maxc = 0
        st = []
        for i in s:
            if maxc <  count:
                maxc = count
            if i in st:
                # print(st)
                index = st.index(i)
                if ( index != len(st) -1 ):
                    st = st[index+1: ]
                else :
                    st = []
                st += [i]
                count = len(st)
            else :
                st += [i]
                count += 1
        if maxc <  count:
            maxc = count
        return maxc


        
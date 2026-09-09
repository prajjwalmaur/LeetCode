class Solution:
    def countCommas(self, n: int) -> int:

        p = 1
        temp = n - 10**(3*p) + 1
        total = 0
        while temp > 0 :
            total += temp
            p+= 1
            temp = n - 10**(3*p) + 1
        return total
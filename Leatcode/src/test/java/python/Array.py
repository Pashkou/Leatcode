class Solution(object):
    def merge(self, nums1, m, nums2, n):

        rt = []
        ix1 = 0; ix2 = 0;

        while ix1 < m and ix2 < n:
            if nums1[ix1] < nums2[ix2]: 
               rt.append(nums1[ix1]); ix1 +=1
            else :
               rt.append(nums2[ix2]); ix2 +=1
        if ix1 < m:
            rt.extend(nums1[ix1:m])
        if ix2 < n:
            rt.extend(nums2[ix2:n])
        nums1[:] = rt[:]
        
        return rt
    
s = Solution()        
print(s.merge([1], 1, [], 0))
'''
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
'''
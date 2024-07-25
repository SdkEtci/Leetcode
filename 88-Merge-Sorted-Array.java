class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    
    int[] nums3 = new int[m+n];

		for (int i = 0; i < m; i++)
		{
			nums3[i] = nums1[i];
		}

		for (int j = 0; j < n; j++)
		{
			nums3[j+m] = nums2[j];
		}

		for (int k =0; k < m+n; k++)
		{
			for (int a =k+1; a< m+n; a++)
			{
				if(nums3[k]> nums3[a])
				{
					int temp = nums3[k];
					nums3[k] = nums3[a];
					nums3[a] = temp;
				}
			}    
		}
        for (int i=0; i< m+n; i++)
			nums1[i]= nums3[i];
    }

}
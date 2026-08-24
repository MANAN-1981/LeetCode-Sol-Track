// Last updated: 8/24/2026, 9:43:22 PM
func searchInsert(nums []int, target int) int {
    l := len(nums)
  
    for i:=0; i<l; i++{
        if nums[i] >= target{
            return i
        }
    }
        return len(nums)
}
 

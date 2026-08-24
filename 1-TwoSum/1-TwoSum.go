// Last updated: 8/24/2026, 9:43:52 PM
func twoSum(nums []int, target int) []int {
    l := len(nums)

    for i:=0; i<l; i++{
        for j:=i+1; j<l; j++{
            if nums[i] + nums[j] == target{
                return []int {i,j}
            }
        }
    }
    return nil
}
// Last updated: 8/24/2026, 9:42:23 PM
func missingNumber(nums []int) int {
    s := len(nums) 
    sum := 0
    sum2 := 0

    for i:=0; i<s; i++{
        sum += nums[i] 
    }

    for i:=0; i<=s; i++{
        sum2 += i
    }

    return sum2 - sum
}
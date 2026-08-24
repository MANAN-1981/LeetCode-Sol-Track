// Last updated: 8/24/2026, 9:43:30 PM
func removeElement(nums []int, val int) int {
    k := 0

    for i := 0; i < len(nums); i++ {
        if nums[i] != val {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}
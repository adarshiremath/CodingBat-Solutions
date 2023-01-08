# Given an array of ints, return True if one of the first 4 elements in the array is a 9. The array length may be less than 4.
#
#
# array_front9([1, 2, 9, 3, 4]) → True
# array_front9([1, 2, 3, 4, 9]) → False
# array_front9([1, 2, 3, 4, 5]) → False


def array_front9(nums):
  count = 0
  for i in nums:
    if i == 9: return True
    count += 1
    if count == 4: return False
  return False

# Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
#
#
# sum13([1, 2, 2, 1]) → 6
# sum13([1, 1]) → 2
# sum13([1, 2, 2, 1, 13]) → 6


def sum13(nums):
  if nums == []: return 0
  elif 13 not in nums: return sum(nums)
  i = 0
  sum1 = 0
  while(i < len(nums)):
    if nums[i] == 13:
      if i == len(nums)-1: return sum1
      i += 2
    else:
      sum1 += nums[i]
      i += 1
  return sum1

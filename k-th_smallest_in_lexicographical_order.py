class Solution:
     

        while k > 0:
            children_count = count_numbers_with_prefix(current, n)
            if k >= children_count:
                k -= children_count
                current += 1
            else:
                current *= 10
                k -= 1

        return current

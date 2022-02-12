package com.techelevator;

public class SumNumbers
{

    // return the sum of the 1st 2 numbers in the array
    public int sum2(int[] nums)
    {
        int sum = 0;

        for (int i = 0; i < nums.length && i < 2; i++)
        {
            sum += nums[i];
        }

        return sum;
    }

    // sum all the numbers except 13 (and the number that follows 13)
    public int sumSkip13(int[] nums)
    {
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 13)
            {
                i++; //skips the next element
            }
            else
            {
                sum += nums[i];
            }
        }

        return sum;
    }

    // the sum of all 2's in the given array should equal 8
    public boolean sum2equals8(int[] nums)
    {
        int sum = 0;

        for (int num : nums)
        {
            if (num == 2)
            {
                sum += 2;
            }
        }

        return sum == 8;
    }
}

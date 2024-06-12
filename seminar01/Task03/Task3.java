package seminar01.Task03;

import java.util.Arrays;

public class Task3 {
public static void main(String[] args) {
int val = 3;
int[] nums = {3, 2, 2, 3, 2, 8, 1, 3, 3, 8, 65, 7, 0, -2, 33, 9, 331, 789};
int left = 0;
int right = nums.length - 1;

while (left < right){
while (nums[right] == val && left < right){
right--;
}

if (nums[left] == val){
nums[left] = nums[right];
nums[right] = val;
}
left++;
}

System.out.println(Arrays.toString(nums));
}
}
package lc.array_string;

import java.util.Arrays;

/**
 * <div class="xFUwe" data-track-load="description_content" speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Given an integer array <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code> and an integer <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">val</code>, remove all occurrences of <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">val</code> in <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code> <a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank" speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><strong speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">in-place</strong></a>. The order of the elements may be changed. Then return <em speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">the number of elements in </em><code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code><em speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"> which are not equal to </em><code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">val</code>.</p>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Consider the number of elements in <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code> which are not equal to <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">val</code> be <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">k</code>, to get accepted, you need to do the following things:</p>
 *
 * <ul speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">
 * 	<li speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Change the array <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code> such that the first <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">k</code> elements of <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code> contain the elements which are not equal to <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">val</code>. The remaining elements of <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code> are not important as well as the size of <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">nums</code>.</li>
 * 	<li speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Return <code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">k</code>.</li>
 * </ul>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><strong speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Custom Judge:</strong></p>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">The judge will test your solution with the following code:</p>
 *
 * <pre speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 *
 * int k = removeElement(nums, val); // Calls your implementation
 *
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i &lt; actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * </pre>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">If all assertions pass, then your solution will be <strong speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">accepted</strong>.</p>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">&nbsp;</p>
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><strong class="example" speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Example 1:</strong></p>
 *
 * <pre speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px"><strong speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">Input:</strong> nums = [3,2,2,3], val = 3
 * <strong speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">Output:</strong> 2, nums = [2,2,_,_]
 * <strong speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">Explanation:</strong> Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * </pre>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><strong class="example" speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Example 2:</strong></p>
 *
 * <pre speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px"><strong speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">Input:</strong> nums = [0,1,2,2,3,0,4,2], val = 2
 * <strong speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">Output:</strong> 5, nums = [0,1,4,0,3,_,_,_]
 * <strong speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="14px">Explanation:</strong> Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * </pre>
 *
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">&nbsp;</p>
 * <p speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><strong speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">Constraints:</strong></p>
 *
 * <ul speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px">
 * 	<li speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">0 &lt;= nums.length &lt;= 100</code></li>
 * 	<li speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">0 &lt;= nums[i] &lt;= 50</code></li>
 * 	<li speechify-initial-font-family="-apple-system, &quot;system-ui&quot;, &quot;Segoe UI&quot;, Helvetica, Arial, sans-serif, &quot;Apple Color Emoji&quot;, &quot;Segoe UI Emoji&quot;, &quot;Segoe UI Symbol&quot;" speechify-initial-font-size="14px"><code speechify-initial-font-family="Menlo, sans-serif" speechify-initial-font-size="12px">0 &lt;= val &lt;= 100</code></li>
 * </ul>
 * </div>
 */
public class A2_RemoveElement {
    public static int removeElement(int[] nums, int val) {

        for ( int i = 0 ; i < nums.length; i++ ){
            if(nums[i] == val){
                for(int j = i + 1; j < nums.length; j++){
                    if (nums[j] != val){
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }

            if(nums[i] == val){
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,2,3,0,4,2};
        System.out.println("K = " + removeElement(a, 2));
        System.out.println("Arr = " + Arrays.toString(a));
    }
}

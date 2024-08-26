public class DifferenceOfArrays{
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2){
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HasSet<>();

		for(int n: nums1){
			set1.add(n);
		}

		for(int n: nums2){
			set2.add(n);
		}

		List<Integer> diff1 = new ArrayList<>();
		List<Integer> diff2 = new ArrayList<>();

		for(int n: nums1){
			if(!set2.contains(n)){
				diff1.add(n);
			}
		}

		for(int n: nums2){
			if(!set1.contains(n)){
				diff2.add(n);
			}
		}

		List<List<Integer>> results = new ArrayList<>();
		results.add(dif1);
		results.add(dif2);

		return resutls;

	}
}
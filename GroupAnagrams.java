class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> groupAnagrams = new HashMap<>();
      for(String st: strs){
        char[] array = st.toCharArray();
        Arrays.sort(array);
        String sorted = String.valueOf(array);

        if(!groupAnagrams.containsKey(sorted)){
            groupAnagrams.put(sorted, new ArrayList<>());
        }

      groupAnagrams.get(sorted).add(st);
      }
    return new ArrayList<>(groupAnagrams.values());
    }
}
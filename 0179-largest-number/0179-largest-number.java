class Solution {
    public String largestNumber(int[] nums) {
          List<String> str = new ArrayList<>();
        for (int num : nums) {
            str.add(String.valueOf(num));
        }
        str.sort((a, b) -> (b + a).compareTo(a + b));
        if ("0".equals(str.get(0))) {
            return "0";
        }
        return String.join("", str);
    }
}
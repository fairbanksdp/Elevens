
1. 
static String flip(){
  Random rand = new Random();
  int n = rand.nextInt(3);
  if (n == 0) 
    return "tails";
  return "heads";
}
2.
boolean arePermutations(int[] nums1, int[] nums2) {
  if (nums1.length != nums2.length)
    return false;
  int i,j;
  boolean numFound;
  for (i=0; i < nums1.length;i++) {
    numFound = false;
    for (j=0; j < nums2.length;j++) {
      if (nums1[i] == nums2[j])
        numFound = true;
    }
    if (!numFound)
      return false;
  }
  return true;
}
3. 0,1,2,3

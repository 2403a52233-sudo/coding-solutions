class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=1;i<=9;i++){
            int temp=i;
            for(int j=i+1;j<=9;j++){
                temp=temp*10+j;
                if(temp>=low && temp<=high)
                    al.add(temp);
            }
        }
        Collections.sort(al);
    return al;
    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int[] length = new int[gain.length];
        int hieght = 0;
        for(int i=0 ; i<gain.length ; i++){
            hieght += gain[i];
            length[i] = hieght;
        }
        int highest = 0;
        for(int i =0; i<length.length ; i++){
            if(length[i]>highest){
                highest = length[i];
            }

        }
        return highest;
    }
}
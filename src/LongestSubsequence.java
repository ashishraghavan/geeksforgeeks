public class LongestSubsequence {

    public static void main(String[] args) {
        String str1 = "OTEHZRIICFSKPGGKBBIPZZRZUCXAMLUDFYKGRUOWZGIOOOBPPLEQLWPHAPJNADQHDCNVWDTXJBMYPPPHAUXNSPUSGDHIIXQMBF";
        String str2 = "JXJCVUDJSUYIBYEBMWSIQYOYGYXYMZEVYPZV";
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        StringBuilder subsequence = new StringBuilder();
        int i = 0,j=0;
        //set value of listTurn to 0 initially.
        int listTurn = 0;
        while(i < str1Char.length && j < str2Char.length) {
            if(str1Char[i] == str2Char[j]) {
                subsequence.append(str1Char[i]);
                //If both i and j are equal, we increment both.
                if(i == j){
                    i++;
                    j++;
                } else if(i < j) {
                    //If i is less than j, we increment only i.
                    i++;
                } else {
                    //If j is less than i, we increment only j.
                    j++;
                }
            }
            else {
                //First, we retrieve the current value of listTurn
                if(listTurn == 1 || listTurn == 0) {
                    i++;
                } else {
                    j++;
                }
                //Then we flip the listTurn value.
                if(listTurn == 0 || listTurn == 2) {
                    listTurn = 1;
                } else {
                    listTurn = 2;
                }

            }
        }
        System.out.println(subsequence.length());
    }
}

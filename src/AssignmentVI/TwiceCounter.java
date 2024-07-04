package AssignmentVI;

public class TwiceCounter {
    public static void main(String[] args) {
        String[] str={"Geeks", "For", "Geeks"};
        System.out.println("the output is :"+twiceOccurrence(str));
    }
    public static int twiceOccurrence(String[] str){
        int ans=0;
        for (int i = 0; i < str.length; i++) {
            int count=0;
            for (int j = i+1; j < str.length; j++) {
                if(str[i].equals(str[j])){
                  //  System.out.println(str[i]+"  "+str[j]);
                    count++;
                }
            }
            if (count==1){
              //  System.out.println(str[i]);
                ans++;
            }
        }
        return ans;
    }
}

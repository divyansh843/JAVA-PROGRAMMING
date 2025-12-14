public class checkpalindrom {

    public static void main(String[] args) {
        
        String s[] = {"Divyansh", "Nitin", "Devansh"};

        for (String ele : s) {
            String d = ele.toLowerCase();
            int left = 0;
            int right = d.length()-1;
            while (left < right) {
                if (ele.charAt(left) != ele.charAt(right)){
                    return false;

                }else{
                    return true;
                }

                left ++;
                right --;

                
            }
            


            
        }


    }
    
}

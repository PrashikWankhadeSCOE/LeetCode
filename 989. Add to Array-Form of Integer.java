class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuffer sb = new StringBuffer("");
        
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for(int i= 0;i<num.length;i++){
            sb = sb.append(num[i]);
        }
        String s = new String(sb);
        double x = Double.valueOf(s);
       
        /* try{
            x = Integer.valueOf(s);
        }catch(NumberFormatException ne){

            return ll;
        }*/
        x  = x +k;

        String str = String.valueOf(x);
        for(int i = 0;i<str.length();i++){
            ll.add(Integer.valueOf(str.charAt(i)-'0'));
        }
        return ll;
    }
}


public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-1200;
		StringBuilder sb=new StringBuilder(x+"");
        boolean ng=false;
       // System.out.println(sb);
        char sign=sb.charAt(0);
        //System.out.println(sign);
        String str=new String(sb);
        if(sign=='-'){
        	
           str= str.substring(1,str.length());
            //System.out.println("exe");
            ng=true;
        }
        sb=new StringBuilder(str);
       // System.out.println(sb);
        sb.reverse();
        for(int i=sb.length()-1;i>=0;i--){
            char f=sb.charAt(i);
            if(f=='0'){
               sb.substring(1,sb.length());
                i--;
            }
            else{
                break;
            }
        }
        int n=Integer.parseInt(sb.toString());
        if(ng==true){
            n=0-n;
        }
        System.out.println(n);
	}
	

}

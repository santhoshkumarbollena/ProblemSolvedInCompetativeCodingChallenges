
import java.util.*;
class ZerosOnesTwos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int LengthOfArray=sc.nextInt();
        ArrayList<Integer> InputArray=new ArrayList<>();
        boolean ErrorMsg=false;
        for(int iteratorForArray=0;iteratorForArray<LengthOfArray;iteratorForArray++)
        {
            InputArray.add(sc.nextInt());
        }
        Collections.sort(InputArray);
        for(int iteratorForArrayList=0;iteratorForArrayList<InputArray.size();iteratorForArrayList++)
        {
            if(InputArray.get(iteratorForArrayList)!=0&&InputArray.get(iteratorForArrayList)!=1&&InputArray.get(iteratorForArrayList)!=2)
            {
                System.out.println("This number is Not 0 or 1 or 2"+InputArray.get(iteratorForArrayList));
                ErrorMsg=true;
            }
        }
        if(!ErrorMsg){
            System.out.println(InputArray);
        }
    }
}
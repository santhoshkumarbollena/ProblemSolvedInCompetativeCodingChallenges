

import java.util.*;
class MergingSortedArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int FirstArrayLength,SecondArrayLength;
        ArrayList<Integer> FirstArray=new ArrayList<>();
        ArrayList<Integer> SecondArray=new ArrayList<>();
        FirstArrayLength=sc.nextInt();
        for(int iteratorForFirstArray=0;iteratorForFirstArray<FirstArrayLength;iteratorForFirstArray++)
        {
            FirstArray.add(sc.nextInt());
        }
         SecondArrayLength=sc.nextInt();
        for(int iteratorForSecondArray=0;iteratorForSecondArray<SecondArrayLength;iteratorForSecondArray++)
        {
            SecondArray.add(sc.nextInt());
        }
        HashSet<Integer> FinalResultSet=new HashSet<>();
        for(int iteratorForFirstArray=0;iteratorForFirstArray<FirstArray.size();iteratorForFirstArray++)
        {
            FinalResultSet.add(FirstArray.get(iteratorForFirstArray));
        }
    
        for(int iteratorForSecondArray=0;iteratorForSecondArray<SecondArray.size();iteratorForSecondArray++)
        {
            FinalResultSet.add(SecondArray.get(iteratorForSecondArray));
        }
        
        ArrayList<Integer> FinalResultSortedArrayList=new ArrayList<>(FinalResultSet);
        Collections.sort(FinalResultSortedArrayList);
        System.out.println(FinalResultSortedArrayList);
        
    }
}

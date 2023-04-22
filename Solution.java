package Sudoku;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution
{
    private List<List<List<Integer>>> solution = new ArrayList<>(3);
    private int[] numbers = {1,2,3,4,5,6,7,8,9};
    private ArrayList<ArrayList<Integer>> rows = new ArrayList<>(9);
    private ArrayList<ArrayList<Integer>> cols = new ArrayList<>(9);
    Random r = new Random();

    public Solution()
    {
        int index;
        List<Integer> flatList;

        for(int i=0;i<9;i++)
        {
            rows.add(new ArrayList<>());
            cols.add(new ArrayList<>());
        }

        for(int i=0;i<9;i++)
        {
            solution.add(new ArrayList<>());
            for(int j=0;j<3;j++)
            {
                solution.get(i).add(new ArrayList<>());
                for(int k=0;k<3;k++)
                {
                    flatList = new ArrayList<>();
                    for (List<Integer> row : solution.get(i))
                    {
                        flatList.addAll(row);
                    }
                    for(List<Integer> x : rows)
                    {
                        for (int y : x)
                            System.out.print(y + " ");
                        System.out.println();
                    }
                    do
                    {
                        index = r.nextInt(0,9);
                    }
                    while(rows.get(j + ((i/3)* 3)).contains(numbers[index])||cols.get(k + ((i%3)* 3)).contains(numbers[index])||flatList.contains(numbers[index]));
                    rows.get(j + ((i/3)* 3)).add(numbers[index]);
                    cols.get(k + ((i%3)* 3)).add(numbers[index]);
                    System.out.println(numbers[index] + " added to ("+(j + ((i/3)* 3))+","+(k + ((i%3)* 3))+")");

                    solution.get(i).get(j).add(k,numbers[index]);
                }
            }

            for(List<Integer> x : solution.get(i))
            {
                for (int y : x)
                    System.out.print(y + " ");
                System.out.println();
            }
        }

        System.out.println("end");


        for(int i=0;i<9;i++) {
            for (int j = 0; j < 9; j++)
                System.out.print(rows.get(i).get(j) + " ");
            System.out.println();
        }

        System.out.println("\n\n");

    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}

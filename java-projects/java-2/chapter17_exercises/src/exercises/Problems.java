package exercises;

/*
  Programming Problems:
  Self-Check Problems: 12, 13
  Exercises: 7
 */

public class Problems
{
    public static void main(String[] args)
    {
        IntTree tree = new IntTree(3);

        System.out.println(tree.getSize());

        System.out.println(tree.min());
        System.out.println(tree.max());

        System.out.println(tree.countBranches());

        System.out.println(tree.isFull());
    }
}

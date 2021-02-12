package exercises;

/*
  Programming Problems:
  Self-Check Problems: 12, 13
  Exercises: 7
 */

public class IntTree
{
    private IntTreeNode overallRoot;
    private int min;
    private int max;
    private int size = 0;
    private int branches = 0;

    public IntTree (int max)
    {
        if (max < 0)
        {
            throw new IllegalArgumentException("Max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    private IntTreeNode buildTree(int n, int max)
    {
        if (n > max)
        {
            return null;
        }
        else
        {
            size++;
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

    public int getSize()
    {
        return size;
    }

    public int min()
    {
        if (overallRoot != null)
        {
            return min(overallRoot);
        }
        else
        {
            throw new IllegalStateException("Empty Tree!");
        }

    }

    private int min(IntTreeNode root)
    {
        if (root != null)
        {
            if (root.data < min)
            {
                min = root.data;
            }
            min(root.left);
            min(root.right);
        }
        return min;

    }

    public int max()
    {
        if (overallRoot != null)
        {
            return max(overallRoot);
        }
        else
        {
            throw new IllegalStateException("Empty Tree!");
        }

    }

    private int max(IntTreeNode root)
    {
        if (root != null)
        {
            if (root.data > max)
            {
                max = root.data;
            }
            max(root.left);
            max(root.right);
        }
        return max;
    }

    public int countBranches()
    {
        if (overallRoot != null)
        {
            return size - countBranches(overallRoot);
        }
        return 0;
    }

    private int countBranches(IntTreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        else if (root.left == null && root.right == null)
        {
            return 1;
        }
        else
        {
            return countBranches(root.left) +  countBranches(root.right);
        }
    }

    public boolean isFull()
    {
        if (overallRoot == null)
        {
            return true;
        }
        else
        {
            return isFull(overallRoot);
        }
    }

    private boolean isFull(IntTreeNode root)
    {
        if ((root.left != null && root.right == null) || (root.left == null && root.right != null))
        {
            return false;
        }
        else if (root.left == null && root.right == null)
        {
            return true;
        }
        else
        {
            return (isFull(root.left) && isFull(root.right));
        }
    }


    private class IntTreeNode
    {
        public int data;
        public IntTreeNode left;
        public IntTreeNode right;

        public IntTreeNode(int data)
        {
            this(data, null, null);
        }

        public IntTreeNode(int data, IntTreeNode left, IntTreeNode right)
        {
            this.data = data;
            this.left = left;
            this.right = right;

        }
    }
}

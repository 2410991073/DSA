class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Map<Integer, List<int[]>> map = new TreeMap<>();

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> row = new LinkedList<>();
        Queue<Integer> col = new LinkedList<>();

        q.add(root);
        row.add(0);
        col.add(0);

        while (!q.isEmpty()) {

            TreeNode node = q.remove();
            int r = row.remove();
            int c = col.remove();

            if (!map.containsKey(c))
                map.put(c, new ArrayList<>());

            map.get(c).add(new int[]{r, node.val});

            if (node.left != null) {
                q.add(node.left);
                row.add(r + 1);
                col.add(c - 1);
            }

            if (node.right != null) {
                q.add(node.right);
                row.add(r + 1);
                col.add(c + 1);
            }
        }

        for (List<int[]> list : map.values()) {

            Collections.sort(list, (a, b) -> {

                if (a[0] != b[0])
                    return a[0] - b[0];

                return a[1] - b[1];
            });

            List<Integer> temp = new ArrayList<>();

            for (int[] x : list) {
                temp.add(x[1]);
            }

            ans.add(temp);
        }

        return ans;
    }
}
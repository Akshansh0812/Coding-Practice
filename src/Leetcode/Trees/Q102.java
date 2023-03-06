package Leetcode.Trees;

public class Q102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int level = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<level; i++){
                TreeNode temp = q.remove();
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                list.add(temp.val);
            }
            res.add(list);
        }
        return res;
    }
}

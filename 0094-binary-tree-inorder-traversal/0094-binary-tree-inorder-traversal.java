
class Solution {
    public static List<Integer> inorderTraversal(TreeNode root)
	{
		List <Integer> list= new ArrayList();
		Stack <TreeNode> stc= new Stack<TreeNode>();
		TreeNode temp=root;
		while (temp!=null||!stc.empty())
		{
			while(temp!=null)
			{
				stc.push(temp);
				temp=temp.left;
			}
			 temp= stc.pop();
			 list.add(temp.val);
			 temp=temp.right;
			
		}
		
		return list;
	}
}
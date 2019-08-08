/* function TreeNode(x) {
    this.val = x;
    this.left = null;
    this.right = null;
} */
function isSubtree(root1, root2) {
    if (root2 == null) return true;
    if (root1 == null) return false;
    if (root1.val == root2.val) {
        return isSubtree(root1.left, root2.left) &&
            isSubtree(root1.right, root2.right);
    } else {
        return false;  
    }
}
 
function HasSubtree(pRoot1, pRoot2) {
   if (pRoot1 == null || pRoot2 == null) {
       return false;
   }
    return isSubtree(pRoot1, pRoot2) ||
        HasSubtree(pRoot1.left, pRoot2) ||
        HasSubtree(pRoot1.right, pRoot2);
}
module.exports = {
    HasSubtree : HasSubtree
};
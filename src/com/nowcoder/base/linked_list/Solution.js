/*function ListNode(x){
    this.val = x;
    this.next = null;
}*/

//µÝ¹éË¼Ïë
function printListFromTailToHead(head)
{
    let arr = [];
    if(head!=null){
        arr = printListFromTailToHead(head.next);
        arr.push(head.val);
    }
    return arr;
}
module.exports = {
    printListFromTailToHead : printListFromTailToHead
};
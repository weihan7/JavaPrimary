/*function ListNode(x){
    this.val = x;
    this.next = null;
}*/
function ReverseList(pHead)
{
    if(!pHead) return false;
    var p1,p2=null;
    p1=pHead;
    var temp=null;
    while(p1){
        temp=p1.next;
        p1.next=p2;
        p2=p1;
        p1=temp;
    }
    return p2;
}
module.exports = {
    ReverseList : ReverseList
};
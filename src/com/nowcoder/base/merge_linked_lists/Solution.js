/*function ListNode(x){
    this.val = x;
    this.next = null;
}*/
function Merge(pHead1, pHead2)
{
     if(pHead1 == null || pHead2 == null) {
         return pHead2 || pHead1;
     }
    var head = null;
     if (pHead1.val < pHead2.val) {
        head = pHead1;
        head.next = Merge(pHead2,pHead1.next);
    }
    else {
        head = pHead2;
        head.next = Merge(pHead1, pHead2.next);
    }
    return head;
}
module.exports = {
    Merge : Merge
};
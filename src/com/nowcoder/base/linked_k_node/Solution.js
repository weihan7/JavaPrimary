/*function ListNode(x){
    this.val = x;
    this.next = null;
}*/
function FindKthToTail(head, k){
   if(head==null){
       return false;
   }
    var count=0,arr=[];
    while(head){
        count++;
        arr.push(head);
        head=head.next;  
     }
    if(k>arr.length){
        return false;
    }
    return arr[arr.length-k];
}
module.exports = {
    FindKthToTail : FindKthToTail
};
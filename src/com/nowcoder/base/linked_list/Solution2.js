/*function ListNode(x){
    this.val = x;
    this.next = null;
}*/

//Ñ­»·Ë¼Ïë
function printListFromTailToHead(head) {
	let arr = [];
	while (head) {
		arr.unshift(head.val);
		head = head.next;
	}
	return arr;
}
module.exports = {
	printListFromTailToHead : printListFromTailToHead
};
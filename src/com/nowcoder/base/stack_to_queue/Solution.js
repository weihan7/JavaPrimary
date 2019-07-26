let stack1 = [];
let stack2 = [];//只需stack1一个栈即可完成该功能
function push(node)
{
    stack1.push(node);
}
function pop()
{
   return stack1.shift();
}
module.exports = {
    push : push,
    pop : pop
};
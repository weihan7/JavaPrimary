let stack1 = [];
let stack2 = [];//ֻ��stack1һ��ջ������ɸù���
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
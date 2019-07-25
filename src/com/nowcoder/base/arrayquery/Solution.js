function Find(target, array)
{
    let lenX = array.length;
    let lenY = array[0].length;
    for(var i=lenX-1,j=0; i>=0&&j<lenY; ){//eclipse使用let报错，故用var代替
        if(target==array[i][j]){
            return true;
        }else if(target<array[i][j]){
            i--;
            continue;
        }else if(target>array[i][j]){
            j++;
            continue;
        }
    }
    return false;
}
module.exports = {
    Find : Find
};
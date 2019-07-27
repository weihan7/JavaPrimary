function minNumberInRotateArray(rotateArray)
{
  if(rotateArray.length == 0) {
        return 0;
    }
    var low= 0;
    var high = rotateArray.length-1;
    var mid,element;
    while(low<high){
        mid = Math.floor((low+high)/2);
        element = rotateArray[mid];
        if(element>rotateArray[high]){
            low = mid+1;
        }else if(element==rotateArray[high]){
            high = high - 1;
        }else{
            high = mid;
        }
    }
    return rotateArray[low];
}
module.exports = {
    minNumberInRotateArray : minNumberInRotateArray
};
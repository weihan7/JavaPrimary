function minNumberInRotateArray(rotateArray) {
	if(rotateArray.length==0){
        return 0;
	}
	let min = rotateArray[0];
	let index = 0;
	for ( var i = 0; i < rotateArray.length; i++) {
		if (min > rotateArray[i]) {
			min = rotateArray[i];
			index = i;
		}
	}
	let end = rotateArray.slice(0, index);
	let start = rotateArray.slice(index, rotateArray.length + 1);
	rotateArray = start.concat(end);
	console.log(rotateArray);
	return min;
}
module.exports = {
	minNumberInRotateArray : minNumberInRotateArray
};
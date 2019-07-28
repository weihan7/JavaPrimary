function jumpFloor(number) {
	var a = 1;
	var b = 2;
	var c = 0;
	if (number == 0) {
		return 0;
	};
	if (number == 1) {
		return 1;
	};
	if (number == 2) {
		return 2;
	};
	for ( var i = 3; i <= number; i++) {
		c = a + b;
		a = b;
		b = c;
	}
	return c;
}
module.exports = {
	jumpFloor : jumpFloor
};
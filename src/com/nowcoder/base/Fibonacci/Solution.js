function Fibonacci(n)
{
    if(n<=1){
		    return n;
		}
		let record = new Array(n+1);
		record[0] = 0;
		record[1] = 1;
		for(var i=2; i<=n; i++){
		    record[i] = record[i-1] + record[i-2];
		}
		return record[n];
}
module.exports = {
    Fibonacci : Fibonacci
};
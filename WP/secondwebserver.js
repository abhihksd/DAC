//require the module - http

var h = require('http');

h.createServer(function(req,res){
	//response genration
	res.writeHead(200, {'content-type':'text/html'});
	if(req.url == '/home')
		res.write("<h1> Home page </h1>");
	else if(req.url == '/login')
		res.write("<h1> Login Form </h1>");
	else
		res.write("<h3> Unknown URL </h3>");
	res.end();

}).listen(9000, function(){
	console.log("server success at 9000");
});
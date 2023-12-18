var http = require("http");
var url = require("url");
var fs = require("fs");

http.createServer(function (req, res) {
    var url_parts=url.parse(req.url,true)
    var path=url_parts.pathname
    var date=new Date()
    var str="Request recieved for"+path+" at "+date
    fs.appendFile('log.txt',str,function(err){
        if(!err)
        {
            console.log("log geenerreated")
            res.writeHead(200,{'content-type':'text/html'})
            res.write("<h1>Request is logged</h1>")
            res.end()
        }
    })
  })
  .listen(9000, function () {
    console.log("all your servers are belong to us");
  });

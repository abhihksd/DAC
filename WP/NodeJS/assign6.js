var fs=require('fs')
var h=require('http')
var u=require('url')
h.createServer(function(req,res){
    var filename=u.parse(req.url,true).query.filename
    fs.readFile(filename,function(err,data)
    {
     if(!err)
     {
          console.log(data.toString())
          res.writeHead(200,{"content-type":"text/html"})
          res.write("<head><title>THIS IS A PAGE</title></head><p>"+data.toString()+"</p>")
          res.end()
     }
    })
console.log("completed reading")
}).listen(9000,function(){console.log("Server is over 9000!!!!")})

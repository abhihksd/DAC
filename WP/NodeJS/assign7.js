var f = require('fs')
var h = require('http')
var u = require('url')

var s = h.createServer((req,res)=>{
    if(req.url=='/favicon.ico'){
        return
    }

    f.readFile('visit.txt',function(err,data){
        if(!err){
            var count = parseInt(data.toString())
            count++
            f.writeFile('visit.txt',count+"",function (err){
                console.log("visit count updated");
            })
            res.writeHead(200,{'content-type':'text/html'})
            res.write("<h1>visit count : "+count+"</h1>")
            res.end()
        }
        else{
            res.writeHead(200,{'content-type':'text/html'})
            res.write("<h1>File count not increased</h1>")
            res.end()
        }
        
    })
})

s.listen(9000,function (){
    console.log("server ")
})






















// var http=require('http')
// var url=require('url')
// var fs=require('fs')

// http.createServer(function(req,res){
//    var res= url.parse(req.url,true)
//     if(req.url=='/favicon.ico')
//     return 
// else
// fs.readFile("visit.txt",function(err,data){
//     if(!err)
//     {
//         var count=parseInt(data.toString())
//         count++
//         f.writeFile('visit.txt',count+"",function(err){
//             console.log("visited count updated")
//         })
//         res.writeHead(200,{'content-type':'text/html'})
//         res.write("<h1>visit count:"+count+"</h1>")
//         res.end()
//     }
//     else{
//         res.writeHead(200,{'content-type':'text/html'})
//         res.write("<h1>FIle not increased</h1>")
//         res.end()
//     }

// })

// }).listen(9000,function(){
//     console.log("Server created")
// })





// // data="this is a test"
// // fs.writeFile("test2.txt",data,function(err){
// //     if(!err)
// //     console.log("File written")
// // })
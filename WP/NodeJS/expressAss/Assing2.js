var exp=require('express')
var u=require('url')
var fs=require('fs')
var bp=require('body-parser')
var app=exp()

app.listen(9000,function(){
    console.log('exp server 9000')
})
app.use(exp.static("resource"));
app.use(bp.urlencoded({'extended': false}))
app.use(function(req,res,next){
    var url_pa=u.parse(req.url,true)
    var page=url_pa.pathname
    str="\n"+page+" called at"+new Date();
    fs.appendFile('log.txt',str,function(err){
        if(!err)
        {   console.log("log updated")
        
        }
    })
    next()
})
//route handle for /greet
app.get('/greet',function(req,res){
    res.send("<h1> Welcome to the Web App</h1>")
   
})
//  app.use('/welcome',function(req,res,next){

//     res.sendFile(__dirname+"/welcome.html")
//     next()

// })
app.use(exp.static('style'))
app.get('/login',function(req,res){
    
    res.sendFile(__dirname+"/login.html")  

})
// app.get('/welcome',function(req,res){
//     res.send("WELCOME ")
// })

    
// app.get('/loginchk',function(req,res){   
//     var url_p=u.parse(req.url,true)
//     var uid=url_p.query.uid
//     var pwd=url_p.query.pwd
//     if(uid=='abhi' && pwd=='1234')
//         res.send("<h1> LOGIN SUCCESS</h1>")
//     else
//     res.send("LOGIN FAILED")
// })

app.post('/logincheck',function(req,res){
    if(req.body.uid=="admin" && req.body.pwd=="admin")
    res.send("<h1>LOGIN SUCCESS</h1>")
else
res.send()
})



// app.get('/welcome',function(req,res){

// })


app.get('*',function(req,res){
    res.send("INVALID URL")
})
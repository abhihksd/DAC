var exp=require('express')
var app=exp()

app.listen(9000,function(){
    console.log("Server started");
})

app.get('/',function(req,res){
    res.sendFile(__dirname+"/Assign1.html") 
})
app.get('/welcome',function(req,res){
    res.send("<h1>Welcome "+req.query.name+"</h1>")

})
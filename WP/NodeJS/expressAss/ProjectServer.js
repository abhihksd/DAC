var mysql=require('mysql2')
var exp=require('express')
var app=exp()
app.listen(9000,function(){
    console.log("Listening on 9000");
})

var conn=mysql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"mini_project"
})

conn.connect(function(err){
    if(!err)
    {
        console.log("database connected");
    }
})

app.get("/register",function(req,res){
    
})
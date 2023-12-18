var exp = require("express");
var app = exp();
var mysql = require("mysql2");
var bp = require("body-parser");

app.listen(9000,function(){
    console.log("Listeninig at 9000");
})
app.use(bp.urlencoded({'extended':false}))
app.use(exp.static('resource'))
var conn = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
  database: "knowitdb",
});

conn.connect(function(err){
    if(!err)
    {
        console.log("DB CONNECTED")
    }
})


app.get('/',function(req,res){
    res.sendFile(__dirname+"/JSONDEMO.html")
})


//dont forget to make it post
app.post('/getemps',function(req,res){
    dept=req.body.deptno;
    query="select * from emp where deptno="+dept
    conn.query(query,function(err,data){
        if(!err)
        res.send(JSON.stringify(data))
    })
})
app.all('*',function(req,res){
    res.send("<h1>WRONG URL</h1>")
})

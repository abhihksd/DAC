var exp = require("express");
var app = exp();
var mysql = require("mysql2");
var bp = require("body-parser");

app.listen(9000, function () {
  console.log("listening on 9000");
});

var conn = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
  database: "knowitdb",
});
app.use(exp.static("resource"));
app.use(bp.urlencoded({'extended':false}))
conn.connect(function(err){
    if(!err)
    {
        console.log("DATABASE CONNECTED");
    }
})

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/Assign3.html");
});

app.post("/checkid", function (req, res) {
    user=req.body.uid
    query="select * from emp where empno="+user
    conn.query(query,function(err,data){
        if(!err)
        res.send(JSON.stringify(data))
    })
});

app.all('*',function(req,res){
    res.send("<h1>WRONG URL</h1>")
})

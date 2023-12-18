var exp = require("express");
var mysql = require("mysql2");
var app = exp();

app.listen(9000, function () {
  console.log("Server Started on 9000");
});
app.use(exp.static("resource"));
app.get("/", function (req, res) {
  res.sendFile(__dirname + "/Assign2.html");
});
var conn = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "root",
  database: "knowitdb",
});

conn.connect(function (err) {
  if (!err) {
    console.log("Database connected");
  }
});

app.get("/", function (req, res) {
  res.sendFile(__dirname + "/Assign2.html");
});
app.get("/getemp", function (req, res) {
  empno = req.query.empid;
  ename="abhi"
  job="CFO"
  query = "select * from emp where empno=" + empno;
  conn.query(query, function (err, result) {
    if (result.length == 0) {
      res.write("<h1>EMP NOT FOUND</h1>");
      res.end()
    } else {
      if (!err) {
        res.write("<table border=1> <tr>");
        res.write("<td>EMPNO</td>");
        res.write("<td>ENAME</td>");
        res.write("<td>JOB</td>");
        res.write("<td>SAL</td>");
        res.write("</tr><tr>");
        res.write("<td>" + result[0].EMPNO + "</td>");
        res.write("<td>" + result[0].ENAME + "</td>");
        res.write("<td>" + result[0].JOB + "</td>");
        res.write("<td>" + result[0].SAL + "</td>");
        res.write("</tr></table> ");
        res.end();
      }
    }
  });
});

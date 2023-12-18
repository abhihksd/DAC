var mysql = require("mysql2");
var exp = require("express");
var app = exp();
app.listen(9000, function () {
  console.log("server started at 9000");
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
app.get("/emps", function (req, res) {
  conn.query("select *, CURRENT_TIMESTAMP() as Date from emp", function (err, result) {
    if (!err) {
      res.write("<table border=1>");
      result.forEach(function (emp) {
        res.write("<tr>");
        res.write("<td>" + emp.EMPNO+ "</td>");
        res.write("<td>" + emp.ENAME+ "</td>");
        var dd=emp.Date.getDay()
        res.write("<td>" + dd+ "</td>");

        res.write("</tr>");
      });
    }
    res.write("</table>");
    res.end();
  });
});

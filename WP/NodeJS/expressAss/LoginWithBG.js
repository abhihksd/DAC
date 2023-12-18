var exp = require("express");
var url = require("url");
var fs = require("fs");
var bp = require("body-parser");
var app = exp();

app.listen(9000, function () {
  console.log("Connected");
});

app.use(exp.static("style"));
app.use(bp.urlencoded({ extended: false }));

app.get("/login", function (req, res) {
  res.sendFile(__dirname + "/login.html");
});

app.post("/logincheck", function (req, res) {
  if (req.body.uid == "admin" && req.body.pwd == "admin")
    res.send("<h1>Welcome " + req.body.uid + "</h1>");
  else res.redirect("/login");
});



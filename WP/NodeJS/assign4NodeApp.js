var http = require("http");
var url = require("url");
var server = http.createServer(function (req, res) {
  var url_parts = url.parse(req.url, true);
  //   console.log(url_parts.pathname);
  //   console.log(url_parts.query);
  //   console.log(url_parts.query.name);
  //   console.log(url_parts.query.color);
  var nm = url_parts.query.name;
  var cl = url_parts.query.color;
  res.writeHead(200, { "content-type": "text/html" });

  res.write("<h1 style='color:" + cl + "'> welcome " + nm + "</h1>");
  res.write(`<h1> Welcome <span style="color:${cl}">${nm}</span></h1>`);
  res.end();
});
server.listen(9000, function () {
  console.log("server started on 9000");
});

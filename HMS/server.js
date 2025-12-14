// server.js
const express = require("express");
const sql = require("msnodesqlv8");
const cors = require("cors");

const app = express();
app.use(cors());
app.use(express.json());

// ✅ SQL Server Config (Windows Authentication + ODBC 18)
const connectionString = `
  Driver={ODBC Driver 18 for SQL Server};
  Server=DESKTOP-42S24CL\\DIVYAANSH;
  Database=login_db;
  Trusted_Connection=Yes;
  TrustServerCertificate=Yes;
`;

// ✅ TEST ROUTE
app.get("/", (req, res) => {
  res.send("Server Running ✅");
});

// ✅ LOGIN API
app.post("/login", (req, res) => {
  const { username, password } = req.body;

  const query = `
    SELECT * FROM users
    WHERE username = '${username}' AND password = '${password}'
  `;

  sql.query(connectionString, query, (err, rows) => {
    if (err) {
      console.error("DB Error:", err);
      return res.status(500).json({ success: false, message: "Database Error" });
    }

    if (rows.length > 0) {
      res.json({ success: true, message: "Login Successful ✅" });
    } else {
      res.json({ success: false, message: "Invalid Username or Password ❌" });
    }
  });
});

// ✅ SERVER START
app.listen(3000, () => {
  console.log("Server running on http://localhost:3000");
});


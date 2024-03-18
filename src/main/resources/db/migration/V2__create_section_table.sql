CREATE TABLE IF NOT EXISTS  sections (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name varchar(100) NOT NULL,
  description varchar(200),
  unit_id int NOT NULL
);

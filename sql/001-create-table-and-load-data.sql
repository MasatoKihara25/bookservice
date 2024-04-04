DROP TABLE IF EXISTS books;

CREATE TABLE books (
  id int unsigned AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  author VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO books (title, author) VALUES ("Wonder", "R.J.Palacio");
INSERT INTO books (title, author) VALUES ("The little prince", "Antoine de Saint-Exupéry");
INSERT INTO books (title, author) VALUES ("HOLES", "Louis Sachar");
INSERT INTO books (title, author) VALUES ("Who Moved My Cheese?", "Spencer Johnson");

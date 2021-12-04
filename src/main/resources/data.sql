INSERT INTO CATEGORY (name) VALUES ('programming'), ('java'), ('frontend');

INSERT INTO BOOK (isbn, title, authorName, price, category_id)
VALUES
    ('11111', 'Java essentials', 'John Doe', 111.111, 2),
    ('22222', 'Clean architecture', 'Bony Bo', 222.222, 1),
    ('33333', 'ReactJs intro', 'Rony Ro', 333.333, 3);
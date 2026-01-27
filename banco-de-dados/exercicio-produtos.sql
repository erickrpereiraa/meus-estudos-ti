CREATE TABLE produtos (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    preco DECIMAL(10,2)
);

INSERT INTO produtos VALUES (1, 'Mouse', 50.00);
INSERT INTO produtos VALUES (2, 'Teclado', 120.00);
INSERT INTO produtos VALUES (3, 'Monitor', 900.00);

SELECT * FROM produtos;

SELECT nome, preco FROM produtos WHERE preco > 100;

create table despesas
( id BIGINT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  descricao TEXT,
  forma_de_pagamento VARCHAR(50) NOT NULL,
  valor DECIMAL(10, 2) NOT NULL,
  dia_fixo VARCHAR(50),
  categoria VARCHAR(50) NOT NULL,
  pago BOOLEAN NOT NULL
);


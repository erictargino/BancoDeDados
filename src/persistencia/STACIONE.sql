CREATE TABLE Carro (
  id_Carro SERIAL,
  tipo INTEGER NOT NULL,
  placa VARCHAR(7) NOT NULL,
  modelo VARCHAR(40) NOT NULL,
  cor VARCHAR(15) NULL,
  PRIMARY KEY(id_Carro)
);

CREATE TABLE Estacionamento (
  id_Estacionamento SERIAL,
  nome VARCHAR(50) NOT NULL,
  tamanho INTEGER NOT NULL,
  tipo INTEGER NOT NULL,
  valor DOUBLE NULL,
  PRIMARY KEY(id_Estacionamento)
);

CREATE TABLE Usuario (
  id_Usuario SERIAL,
  nome VARCHAR(55) NOT NULL,
  cpf INTEGER NOT NULL,
  PRIMARY KEY(id_Usuario)
);


-- MySQL Script generated by MySQL Workbench
-- 06/10/15 08:11:57
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema myDBSAO
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `myDBSAO` ;

-- -----------------------------------------------------
-- Schema myDBSAO
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `myDBSAO` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
SHOW WARNINGS;
USE `myDBSAO` ;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_MAQUINA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_MAQUINA` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_MAQUINA` (
  `ID_CODMAQ` INT NOT NULL auto_increment,
  `MQ_DESCRICAO` VARCHAR(255) NULL,
  `MQ_TEMPOTOTAL` INT NOT NULL,
  PRIMARY KEY (`ID_CODMAQ`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_PECA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_PECA` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_PECA` (
  `ID_CODPECA` INT NOT NULL auto_increment,
  `PEC_DESCRICAO` VARCHAR(255) NULL,
  `PEC_QUANTIDADE` INT NOT NULL,
  `PEC_DIAMETRO` DOUBLE NULL,
  `PEC_PERCURSO` DOUBLE NULL,
  `PEC_AVANCO` DOUBLE NULL,
  `PEC_MATERIAL` DOUBLE NULL,
  `TB_TAYLOR` DOUBLE NULL,
  PRIMARY KEY (`ID_CODPECA`));

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_OPERACAO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_OPERACAO` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_OPERACAO` (
  `ID_CODOPERACAO` INT NOT NULL auto_increment,
  `ID_CODMAQ` INT NULL,
  `ID_CODPECA` INT NOT NULL,
  `OP_TEMPOMAQPEC` DOUBLE NULL,
  PRIMARY KEY (`ID_CODOPERACAO`),
  CONSTRAINT `FK_CODMAQOPERACAO`
    FOREIGN KEY (`ID_CODMAQ`)
    REFERENCES `myDBSAO`.`TB_MAQUINA` (`ID_CODMAQ`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `FK_CODPECAOPERACAO`
    FOREIGN KEY (`ID_CODPECA`)
    REFERENCES `myDBSAO`.`TB_PECA` (`ID_CODPECA`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
COMMENT = '						';

SHOW WARNINGS;
CREATE INDEX `ID_CODMAQ_idx` ON `myDBSAO`.`TB_OPERACAO` (`ID_CODMAQ` ASC);

SHOW WARNINGS;
CREATE INDEX `FK_CODPECAOPERACAO_idx` ON `myDBSAO`.`TB_OPERACAO` (`ID_CODPECA` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_CUSTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_CUSTO` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_CUSTO` (
  `ID_CUSTO` INT NOT NULL auto_increment,
  `CUST_SH` DOUBLE NULL,
  `CUST_CM` DOUBLE NULL,
  `CUST_KFT` DOUBLE NULL,
  `CUST_TFT` DOUBLE NULL,
  `CUST_CTU` DOUBLE NULL,
  `CUST_SM` DOUBLE NULL,
  PRIMARY KEY (`ID_CUSTO`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_IMPOSTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_IMPOSTO` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_IMPOSTO` (
  `ID_IMPOSTO` INT NOT NULL auto_increment,
  `IMP_MC` DOUBLE NULL,
  `IMP_TX` DOUBLE NULL,
  PRIMARY KEY (`ID_IMPOSTO`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_TEMPO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_TEMPO` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_TEMPO` (
  `ID_TEMPO` INT NOT NULL auto_increment,
  `TMP_TC` DOUBLE NULL,
  `TMP_VIDAFERRAMENTA` DOUBLE NULL,
  PRIMARY KEY (`ID_TEMPO`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `myDBSAO`.`TB_VELOCIDADECORTE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `myDBSAO`.`TB_VELOCIDADECORTE` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `myDBSAO`.`TB_VELOCIDADECORTE` (
  `ID_VELOCIDADECORTE` INT NOT NULL auto_increment,
  `VEL_VCMC` DOUBLE NULL,
  `VEL_VCMXP` DOUBLE NULL,
  `VEL_VCMLIM` DOUBLE NULL,
  PRIMARY KEY (`ID_VELOCIDADECORTE`))
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
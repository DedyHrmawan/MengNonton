/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100418
 Source Host           : localhost:3306
 Source Schema         : mengnonton

 Target Server Type    : MySQL
 Target Server Version : 100418
 File Encoding         : 65001

 Date: 05/01/2022 21:34:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for film
-- ----------------------------
DROP TABLE IF EXISTS `film`;
CREATE TABLE `film`  (
  `ID_FILM` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `JUDUL_FILM` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `DURASI_FILM` int NULL DEFAULT NULL,
  `RATING_FILM` int NULL DEFAULT NULL,
  PRIMARY KEY (`ID_FILM`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of film
-- ----------------------------
INSERT INTO `film` VALUES ('FM001', 'Mencari Janda', 90, 5);

-- ----------------------------
-- Table structure for jadwal
-- ----------------------------
DROP TABLE IF EXISTS `jadwal`;
CREATE TABLE `jadwal`  (
  `ID_JADWAL` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `ID_FILM` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `ID_STUDIO` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `TGL_JADWAL` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`ID_JADWAL`) USING BTREE,
  INDEX `fr_jadwal_1`(`ID_FILM` ASC) USING BTREE,
  INDEX `fr_jadwal_2`(`ID_STUDIO` ASC) USING BTREE,
  CONSTRAINT `fr_jadwal_1` FOREIGN KEY (`ID_FILM`) REFERENCES `film` (`ID_FILM`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fr_jadwal_2` FOREIGN KEY (`ID_STUDIO`) REFERENCES `studio` (`ID_STUDIO`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jadwal
-- ----------------------------
INSERT INTO `jadwal` VALUES ('JD001', 'FM001', 'S002', '2022-01-05 09:28:00');
INSERT INTO `jadwal` VALUES ('JD002', 'FM001', 'S002', '2022-01-05 09:29:00');

-- ----------------------------
-- Table structure for kursi
-- ----------------------------
DROP TABLE IF EXISTS `kursi`;
CREATE TABLE `kursi`  (
  `ID_KURSI` int NOT NULL AUTO_INCREMENT,
  `ID_JADWAL` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `STATUS_KURSI` binary(1) NULL DEFAULT 0,
  `NAMA_KURSI` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ID_KURSI`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of kursi
-- ----------------------------

-- ----------------------------
-- Table structure for makanan
-- ----------------------------
DROP TABLE IF EXISTS `makanan`;
CREATE TABLE `makanan`  (
  `ID_MAKANAN` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `NAMA_MAKANAN` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `HARGA_MAKANAN` int NOT NULL,
  `STOK_MAKANAN` int NOT NULL,
  PRIMARY KEY (`ID_MAKANAN`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of makanan
-- ----------------------------
INSERT INTO `makanan` VALUES ('MK001', 'Japanese Cheese Tart', 50000, 2);
INSERT INTO `makanan` VALUES ('MK002', 'Hokkaido Cheese Tart', 75000, 7);

-- ----------------------------
-- Table structure for minuman
-- ----------------------------
DROP TABLE IF EXISTS `minuman`;
CREATE TABLE `minuman`  (
  `ID_MINUMAN` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `NAMA_MINUMAN` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `HARGA_MINUMAN` int NOT NULL,
  `STOK_MINUMAN` int NOT NULL,
  PRIMARY KEY (`ID_MINUMAN`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of minuman
-- ----------------------------
INSERT INTO `minuman` VALUES ('MI001', 'Es Teh', 10000, 5);
INSERT INTO `minuman` VALUES ('MI002', 'Caramel Machiato', 55000, 10);
INSERT INTO `minuman` VALUES ('MI003', 'Lemon Ade', 35000, 10);

-- ----------------------------
-- Table structure for pembayaran
-- ----------------------------
DROP TABLE IF EXISTS `pembayaran`;
CREATE TABLE `pembayaran`  (
  `ID_PEMBAYARAN` int NOT NULL AUTO_INCREMENT,
  `TANGGAL_PEMBAYARAN` datetime NOT NULL DEFAULT current_timestamp,
  `TOTAL_PEMBAYARAN` int NOT NULL,
  PRIMARY KEY (`ID_PEMBAYARAN`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pembayaran
-- ----------------------------
INSERT INTO `pembayaran` VALUES (1, '2021-12-13 10:36:00', 380000);
INSERT INTO `pembayaran` VALUES (2, '2021-12-29 15:14:47', 85000);
INSERT INTO `pembayaran` VALUES (3, '2021-12-29 16:47:01', 1270000);

-- ----------------------------
-- Table structure for pemesanan
-- ----------------------------
DROP TABLE IF EXISTS `pemesanan`;
CREATE TABLE `pemesanan`  (
  `ID_PEMESANAN` int NOT NULL AUTO_INCREMENT,
  `ID_BARANG` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `TIPE_PEMESANAN` int NOT NULL,
  `JUMLAH_PEMESANAN` int NOT NULL,
  `TANGGAL_PEMESANAN` date NOT NULL,
  `TOTAL_TAGIHAN` int NOT NULL,
  `STATUS` int NOT NULL DEFAULT 0,
  PRIMARY KEY (`ID_PEMESANAN`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pemesanan
-- ----------------------------
INSERT INTO `pemesanan` VALUES (10, 'MI001', 2, 2, '2021-12-01', 20000, 1);
INSERT INTO `pemesanan` VALUES (11, 'MI002', 2, 2, '2021-12-01', 110000, 1);
INSERT INTO `pemesanan` VALUES (12, 'MK001', 1, 2, '2021-12-01', 100000, 1);
INSERT INTO `pemesanan` VALUES (13, 'MK002', 1, 2, '2021-12-01', 150000, 1);
INSERT INTO `pemesanan` VALUES (14, 'MK002', 1, 1, '2021-12-29', 75000, 1);
INSERT INTO `pemesanan` VALUES (15, 'MI001', 2, 1, '2021-12-29', 10000, 1);
INSERT INTO `pemesanan` VALUES (16, 'MK001', 1, 3, '2021-12-29', 150000, 1);
INSERT INTO `pemesanan` VALUES (17, 'MI003', 2, 32, '2021-12-29', 1120000, 1);

-- ----------------------------
-- Table structure for studio
-- ----------------------------
DROP TABLE IF EXISTS `studio`;
CREATE TABLE `studio`  (
  `ID_STUDIO` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `NAMA_STUDIO` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `KAPASITAS_STUDIO` int NOT NULL,
  `JENIS_STUDIO` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  INDEX `ID_STUDIO`(`ID_STUDIO` ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of studio
-- ----------------------------
INSERT INTO `studio` VALUES ('S002', 'dsf', 20, 'Dolby Atmos');

-- ----------------------------
-- View structure for v_jadwal
-- ----------------------------
DROP VIEW IF EXISTS `v_jadwal`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `v_jadwal` AS SELECT
	jadwal.*, 
	film.JUDUL_FILM, 
	film.DURASI_FILM, 
	film.RATING_FILM, 
	studio.NAMA_STUDIO, 
	studio.JENIS_STUDIO, 
	studio.KAPASITAS_STUDIO
FROM
	jadwal
	INNER JOIN
	film
	ON 
		jadwal.ID_FILM = film.ID_FILM
	INNER JOIN
	studio
	ON 
		jadwal.ID_STUDIO = studio.ID_STUDIO ;

SET FOREIGN_KEY_CHECKS = 1;

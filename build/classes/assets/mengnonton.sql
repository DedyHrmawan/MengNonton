-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2022 at 06:26 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mengnonton`
--

-- --------------------------------------------------------

--
-- Table structure for table `film`
--

CREATE TABLE `film` (
  `ID_FILM` varchar(10) NOT NULL,
  `JUDUL_FILM` varchar(255) DEFAULT NULL,
  `DURASI_FILM` int(11) DEFAULT NULL,
  `RATING_FILM` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `film`
--

INSERT INTO `film` (`ID_FILM`, `JUDUL_FILM`, `DURASI_FILM`, `RATING_FILM`) VALUES
('FM001', 'Mencari Batu', 90, 5);

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `ID_JADWAL` varchar(10) NOT NULL,
  `ID_FILM` varchar(10) DEFAULT NULL,
  `ID_STUDIO` varchar(10) DEFAULT NULL,
  `TGL_JADWAL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`ID_JADWAL`, `ID_FILM`, `ID_STUDIO`, `TGL_JADWAL`) VALUES
('JD001', 'FM001', 'ST001', '2022-01-10 10:24:00');

-- --------------------------------------------------------

--
-- Table structure for table `kursi`
--

CREATE TABLE `kursi` (
  `ID_KURSI` int(11) NOT NULL,
  `ID_JADWAL` varchar(10) NOT NULL,
  `STATUS_KURSI` binary(1) DEFAULT '0',
  `NAMA_KURSI` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kursi`
--

INSERT INTO `kursi` (`ID_KURSI`, `ID_JADWAL`, `STATUS_KURSI`, `NAMA_KURSI`) VALUES
(42, 'JD001', 0x32, 'A1'),
(43, 'JD001', 0x30, 'A2'),
(44, 'JD001', 0x30, 'A3'),
(45, 'JD001', 0x30, 'A4'),
(46, 'JD001', 0x30, 'A5'),
(47, 'JD001', 0x30, 'B1'),
(48, 'JD001', 0x32, 'B2'),
(49, 'JD001', 0x32, 'B3'),
(50, 'JD001', 0x30, 'B4'),
(51, 'JD001', 0x30, 'B5');

-- --------------------------------------------------------

--
-- Table structure for table `makanan`
--

CREATE TABLE `makanan` (
  `ID_MAKANAN` varchar(10) NOT NULL,
  `NAMA_MAKANAN` varchar(50) NOT NULL,
  `HARGA_MAKANAN` int(11) NOT NULL,
  `STOK_MAKANAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `makanan`
--

INSERT INTO `makanan` (`ID_MAKANAN`, `NAMA_MAKANAN`, `HARGA_MAKANAN`, `STOK_MAKANAN`) VALUES
('MK001', 'Burger', 15000, 5);

-- --------------------------------------------------------

--
-- Table structure for table `minuman`
--

CREATE TABLE `minuman` (
  `ID_MINUMAN` varchar(10) NOT NULL,
  `NAMA_MINUMAN` varchar(50) NOT NULL,
  `HARGA_MINUMAN` int(11) NOT NULL,
  `STOK_MINUMAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `minuman`
--

INSERT INTO `minuman` (`ID_MINUMAN`, `NAMA_MINUMAN`, `HARGA_MINUMAN`, `STOK_MINUMAN`) VALUES
('MI001', 'Es Teh', 10000, 5),
('MI002', 'Caramel Machiato', 55000, 10),
('MI003', 'Lemon Ade', 35000, 10);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `ID_PEMBAYARAN` int(11) NOT NULL,
  `TANGGAL_PEMBAYARAN` datetime NOT NULL DEFAULT current_timestamp(),
  `TOTAL_PEMBAYARAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`ID_PEMBAYARAN`, `TANGGAL_PEMBAYARAN`, `TOTAL_PEMBAYARAN`) VALUES
(1, '2021-12-13 10:36:00', 380000),
(2, '2021-12-29 15:14:47', 85000),
(3, '2021-12-29 16:47:01', 1270000),
(4, '2022-01-06 14:39:17', 245000),
(5, '2022-01-07 22:26:37', 170000);

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `ID_PEMESANAN` int(11) NOT NULL,
  `ID_BARANG` varchar(50) NOT NULL,
  `TIPE_PEMESANAN` int(11) NOT NULL,
  `JUMLAH_PEMESANAN` int(11) NOT NULL,
  `TANGGAL_PEMESANAN` date NOT NULL,
  `TOTAL_TAGIHAN` int(11) NOT NULL,
  `STATUS` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`ID_PEMESANAN`, `ID_BARANG`, `TIPE_PEMESANAN`, `JUMLAH_PEMESANAN`, `TANGGAL_PEMESANAN`, `TOTAL_TAGIHAN`, `STATUS`) VALUES
(10, 'MI001', 2, 2, '2021-12-01', 20000, 1),
(11, 'MI002', 2, 2, '2021-12-01', 110000, 1),
(12, 'MK001', 1, 2, '2021-12-01', 100000, 1),
(13, 'MK002', 1, 2, '2021-12-01', 150000, 1),
(14, 'MK002', 1, 1, '2021-12-29', 75000, 1),
(15, 'MI001', 2, 1, '2021-12-29', 10000, 1),
(16, 'MK001', 1, 3, '2021-12-29', 150000, 1),
(17, 'MI003', 2, 32, '2021-12-29', 1120000, 1),
(18, 'JD002-null', 3, 1, '2022-01-06', 35000, 1),
(19, 'MK001', 1, 2, '2022-01-06', 100000, 1),
(20, 'MI002', 2, 2, '2022-01-06', 110000, 1),
(22, 'MI001', 2, 2, '2022-01-07', 20000, 1),
(23, 'MK001', 1, 3, '2022-01-07', 45000, 1),
(24, 'JD001-B3', 3, 1, '2022-01-07', 35000, 1),
(26, 'JD001-B2', 3, 1, '2022-01-07', 35000, 1),
(27, 'JD001-A1', 3, 1, '2022-01-07', 35000, 1);

-- --------------------------------------------------------

--
-- Table structure for table `studio`
--

CREATE TABLE `studio` (
  `ID_STUDIO` varchar(10) NOT NULL,
  `NAMA_STUDIO` varchar(100) NOT NULL,
  `KAPASITAS_STUDIO` int(11) NOT NULL,
  `JENIS_STUDIO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studio`
--

INSERT INTO `studio` (`ID_STUDIO`, `NAMA_STUDIO`, `KAPASITAS_STUDIO`, `JENIS_STUDIO`) VALUES
('ST001', 'Studio 1', 10, 'Deluxe');

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_jadwal`
-- (See below for the actual view)
--
CREATE TABLE `v_jadwal` (
`ID_JADWAL` varchar(10)
,`ID_FILM` varchar(10)
,`ID_STUDIO` varchar(10)
,`TGL_JADWAL` datetime
,`JUDUL_FILM` varchar(255)
,`DURASI_FILM` int(11)
,`RATING_FILM` int(11)
,`NAMA_STUDIO` varchar(100)
,`JENIS_STUDIO` varchar(50)
,`KAPASITAS_STUDIO` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_laporan_makanan`
-- (See below for the actual view)
--
CREATE TABLE `v_laporan_makanan` (
`ID_PEMESANAN` int(11)
,`ID_BARANG` varchar(50)
,`TIPE_PEMESANAN` int(11)
,`JUMLAH_PEMESANAN` int(11)
,`TANGGAL_PEMESANAN` date
,`TOTAL_TAGIHAN` int(11)
,`STATUS` int(11)
,`ID_MAKANAN` varchar(10)
,`NAMA_MAKANAN` varchar(50)
,`HARGA_MAKANAN` int(11)
,`STOK_MAKANAN` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_laporan_minuman`
-- (See below for the actual view)
--
CREATE TABLE `v_laporan_minuman` (
`ID_PEMESANAN` int(11)
,`ID_BARANG` varchar(50)
,`TIPE_PEMESANAN` int(11)
,`JUMLAH_PEMESANAN` int(11)
,`TANGGAL_PEMESANAN` date
,`TOTAL_TAGIHAN` int(11)
,`STATUS` int(11)
,`ID_MINUMAN` varchar(10)
,`NAMA_MINUMAN` varchar(50)
,`HARGA_MINUMAN` int(11)
,`STOK_MINUMAN` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_laporan_tiket`
-- (See below for the actual view)
--
CREATE TABLE `v_laporan_tiket` (
`ID_PEMESANAN` int(11)
,`ID_BARANG` varchar(50)
,`TIPE_PEMESANAN` int(11)
,`JUMLAH_PEMESANAN` int(11)
,`TANGGAL_PEMESANAN` date
,`TOTAL_TAGIHAN` int(11)
,`STATUS` int(11)
,`ID_KURSI` int(11)
,`ID_JADWAL` varchar(10)
,`STATUS_KURSI` binary(1)
,`NAMA_KURSI` varchar(255)
);

-- --------------------------------------------------------

--
-- Structure for view `v_jadwal`
--
DROP TABLE IF EXISTS `v_jadwal`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_jadwal`  AS SELECT `jadwal`.`ID_JADWAL` AS `ID_JADWAL`, `jadwal`.`ID_FILM` AS `ID_FILM`, `jadwal`.`ID_STUDIO` AS `ID_STUDIO`, `jadwal`.`TGL_JADWAL` AS `TGL_JADWAL`, `film`.`JUDUL_FILM` AS `JUDUL_FILM`, `film`.`DURASI_FILM` AS `DURASI_FILM`, `film`.`RATING_FILM` AS `RATING_FILM`, `studio`.`NAMA_STUDIO` AS `NAMA_STUDIO`, `studio`.`JENIS_STUDIO` AS `JENIS_STUDIO`, `studio`.`KAPASITAS_STUDIO` AS `KAPASITAS_STUDIO` FROM ((`jadwal` join `film` on(`jadwal`.`ID_FILM` = `film`.`ID_FILM`)) join `studio` on(`jadwal`.`ID_STUDIO` = `studio`.`ID_STUDIO`)) ;

-- --------------------------------------------------------

--
-- Structure for view `v_laporan_makanan`
--
DROP TABLE IF EXISTS `v_laporan_makanan`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_laporan_makanan`  AS SELECT `p`.`ID_PEMESANAN` AS `ID_PEMESANAN`, `p`.`ID_BARANG` AS `ID_BARANG`, `p`.`TIPE_PEMESANAN` AS `TIPE_PEMESANAN`, `p`.`JUMLAH_PEMESANAN` AS `JUMLAH_PEMESANAN`, `p`.`TANGGAL_PEMESANAN` AS `TANGGAL_PEMESANAN`, `p`.`TOTAL_TAGIHAN` AS `TOTAL_TAGIHAN`, `p`.`STATUS` AS `STATUS`, `m`.`ID_MAKANAN` AS `ID_MAKANAN`, `m`.`NAMA_MAKANAN` AS `NAMA_MAKANAN`, `m`.`HARGA_MAKANAN` AS `HARGA_MAKANAN`, `m`.`STOK_MAKANAN` AS `STOK_MAKANAN` FROM (`pemesanan` `p` join `makanan` `m`) WHERE `p`.`TIPE_PEMESANAN` = '1' AND `p`.`ID_BARANG` = `m`.`ID_MAKANAN` AND `p`.`STATUS` = '1' ;

-- --------------------------------------------------------

--
-- Structure for view `v_laporan_minuman`
--
DROP TABLE IF EXISTS `v_laporan_minuman`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_laporan_minuman`  AS SELECT `p`.`ID_PEMESANAN` AS `ID_PEMESANAN`, `p`.`ID_BARANG` AS `ID_BARANG`, `p`.`TIPE_PEMESANAN` AS `TIPE_PEMESANAN`, `p`.`JUMLAH_PEMESANAN` AS `JUMLAH_PEMESANAN`, `p`.`TANGGAL_PEMESANAN` AS `TANGGAL_PEMESANAN`, `p`.`TOTAL_TAGIHAN` AS `TOTAL_TAGIHAN`, `p`.`STATUS` AS `STATUS`, `m`.`ID_MINUMAN` AS `ID_MINUMAN`, `m`.`NAMA_MINUMAN` AS `NAMA_MINUMAN`, `m`.`HARGA_MINUMAN` AS `HARGA_MINUMAN`, `m`.`STOK_MINUMAN` AS `STOK_MINUMAN` FROM (`pemesanan` `p` join `minuman` `m`) WHERE `p`.`TIPE_PEMESANAN` = '2' AND `p`.`ID_BARANG` = `m`.`ID_MINUMAN` AND `p`.`STATUS` = '1' ;

-- --------------------------------------------------------

--
-- Structure for view `v_laporan_tiket`
--
DROP TABLE IF EXISTS `v_laporan_tiket`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_laporan_tiket`  AS SELECT `p`.`ID_PEMESANAN` AS `ID_PEMESANAN`, `p`.`ID_BARANG` AS `ID_BARANG`, `p`.`TIPE_PEMESANAN` AS `TIPE_PEMESANAN`, `p`.`JUMLAH_PEMESANAN` AS `JUMLAH_PEMESANAN`, `p`.`TANGGAL_PEMESANAN` AS `TANGGAL_PEMESANAN`, `p`.`TOTAL_TAGIHAN` AS `TOTAL_TAGIHAN`, `p`.`STATUS` AS `STATUS`, `k`.`ID_KURSI` AS `ID_KURSI`, `k`.`ID_JADWAL` AS `ID_JADWAL`, `k`.`STATUS_KURSI` AS `STATUS_KURSI`, `k`.`NAMA_KURSI` AS `NAMA_KURSI` FROM (`pemesanan` `p` join `kursi` `k`) WHERE `p`.`TIPE_PEMESANAN` = '3' AND `p`.`ID_BARANG` = `k`.`ID_KURSI` AND `p`.`STATUS` = '1' ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`ID_FILM`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`ID_JADWAL`),
  ADD KEY `fr_jadwal_1` (`ID_FILM`),
  ADD KEY `fr_jadwal_2` (`ID_STUDIO`);

--
-- Indexes for table `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`ID_KURSI`);

--
-- Indexes for table `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`ID_MAKANAN`);

--
-- Indexes for table `minuman`
--
ALTER TABLE `minuman`
  ADD PRIMARY KEY (`ID_MINUMAN`);

--
-- Indexes for table `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`ID_PEMBAYARAN`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`ID_PEMESANAN`);

--
-- Indexes for table `studio`
--
ALTER TABLE `studio`
  ADD KEY `ID_STUDIO` (`ID_STUDIO`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kursi`
--
ALTER TABLE `kursi`
  MODIFY `ID_KURSI` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT for table `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `ID_PEMBAYARAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `ID_PEMESANAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `fr_jadwal_1` FOREIGN KEY (`ID_FILM`) REFERENCES `film` (`ID_FILM`),
  ADD CONSTRAINT `fr_jadwal_2` FOREIGN KEY (`ID_STUDIO`) REFERENCES `studio` (`ID_STUDIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

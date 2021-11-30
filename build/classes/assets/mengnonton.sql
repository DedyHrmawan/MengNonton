-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 08, 2021 at 05:34 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

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
('MK001', 'Japanese Cheese Tart', 50000, 2),
('MK002', 'Hokkaido Cheese Tart', 75000, 7);

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
('S001', 'SDjkf', 20, 'Premiere'),
('S002', 'dsf', 20, 'Dolby Atmos');

--
-- Indexes for dumped tables
--

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Nov 2021 pada 12.54
-- Versi server: 10.1.38-MariaDB
-- Versi PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
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
-- Struktur dari tabel `makanan`
--

CREATE TABLE `makanan` (
  `ID_MAKANAN` varchar(10) NOT NULL,
  `NAMA_MAKANAN` varchar(50) NOT NULL,
  `HARGA_MAKANAN` int(11) NOT NULL,
  `STOK_MAKANAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `makanan`
--

INSERT INTO `makanan` (`ID_MAKANAN`, `NAMA_MAKANAN`, `HARGA_MAKANAN`, `STOK_MAKANAN`) VALUES
('MK001', 'Japanese Cheese Tart', 50000, 5),
('MK002', 'Hokkaido Cheese Tart', 75000, 7);

-- --------------------------------------------------------

--
-- Struktur dari tabel `minuman`
--

CREATE TABLE `minuman` (
  `ID_MINUMAN` varchar(10) NOT NULL,
  `NAMA_MINUMAN` varchar(50) NOT NULL,
  `HARGA_MINUMAN` int(11) NOT NULL,
  `STOK_MINUMAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `minuman`
--

INSERT INTO `minuman` (`ID_MINUMAN`, `NAMA_MINUMAN`, `HARGA_MINUMAN`, `STOK_MINUMAN`) VALUES
('MI001', 'Es Teh', 10000, 5),
('MI002', 'Caramel Machiato', 55000, 10),
('MI003', 'Lemon Ade', 35000, 10);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `makanan`
--
ALTER TABLE `makanan`
  ADD PRIMARY KEY (`ID_MAKANAN`);

--
-- Indeks untuk tabel `minuman`
--
ALTER TABLE `minuman`
  ADD PRIMARY KEY (`ID_MINUMAN`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

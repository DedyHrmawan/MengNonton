-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Des 2021 pada 04.38
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
('MK001', 'Japanese Cheese Tart', 50000, 2),
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

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `ID_PEMBAYARAN` int(11) NOT NULL,
  `TANGGAL_PEMBAYARAN` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TOTAL_PEMBAYARAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`ID_PEMBAYARAN`, `TANGGAL_PEMBAYARAN`, `TOTAL_PEMBAYARAN`) VALUES
(1, '2021-12-13 10:36:00', 380000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pemesanan`
--

CREATE TABLE `pemesanan` (
  `ID_PEMESANAN` int(11) NOT NULL,
  `ID_BARANG` varchar(50) NOT NULL,
  `TIPE_PEMESANAN` int(11) NOT NULL,
  `JUMLAH_PEMESANAN` int(11) NOT NULL,
  `TANGGAL_PEMESANAN` date NOT NULL,
  `TOTAL_TAGIHAN` int(11) NOT NULL,
  `STATUS` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`ID_PEMESANAN`, `ID_BARANG`, `TIPE_PEMESANAN`, `JUMLAH_PEMESANAN`, `TANGGAL_PEMESANAN`, `TOTAL_TAGIHAN`, `STATUS`) VALUES
(10, 'MI001', 2, 2, '2021-12-01', 20000, 1),
(11, 'MI002', 2, 2, '2021-12-01', 110000, 1),
(12, 'MK001', 1, 2, '2021-12-01', 100000, 1),
(13, 'MK002', 1, 2, '2021-12-01', 150000, 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `studio`
--

CREATE TABLE `studio` (
  `ID_STUDIO` varchar(10) NOT NULL,
  `NAMA_STUDIO` varchar(100) NOT NULL,
  `KAPASITAS_STUDIO` int(11) NOT NULL,
  `JENIS_STUDIO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `studio`
--

INSERT INTO `studio` (`ID_STUDIO`, `NAMA_STUDIO`, `KAPASITAS_STUDIO`, `JENIS_STUDIO`) VALUES
('S001', 'SDjkf', 20, 'Premiere'),
('S002', 'dsf', 20, 'Dolby Atmos');

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

--
-- Indeks untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`ID_PEMBAYARAN`);

--
-- Indeks untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`ID_PEMESANAN`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `ID_PEMBAYARAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `ID_PEMESANAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

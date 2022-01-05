-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 05 Jan 2022 pada 15.42
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 7.4.16

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
-- Struktur dari tabel `film`
--

CREATE TABLE `film` (
  `ID_FILM` varchar(10) NOT NULL,
  `JUDUL_FILM` varchar(255) DEFAULT NULL,
  `DURASI_FILM` int(11) DEFAULT NULL,
  `RATING_FILM` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `film`
--

INSERT INTO `film` (`ID_FILM`, `JUDUL_FILM`, `DURASI_FILM`, `RATING_FILM`) VALUES
('FM001', 'Mencari Janda', 90, 5);

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal`
--

CREATE TABLE `jadwal` (
  `ID_JADWAL` varchar(10) NOT NULL,
  `ID_FILM` varchar(10) DEFAULT NULL,
  `ID_STUDIO` varchar(10) DEFAULT NULL,
  `TGL_JADWAL` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `jadwal`
--

INSERT INTO `jadwal` (`ID_JADWAL`, `ID_FILM`, `ID_STUDIO`, `TGL_JADWAL`) VALUES
('JD001', 'FM001', 'S002', '2022-01-05 09:28:00'),
('JD002', 'FM001', 'S002', '2022-01-05 09:29:00');

-- --------------------------------------------------------

--
-- Struktur dari tabel `kursi`
--

CREATE TABLE `kursi` (
  `ID_KURSI` int(11) NOT NULL,
  `ID_JADWAL` varchar(10) NOT NULL,
  `STATUS_KURSI` binary(1) DEFAULT '0',
  `NAMA_KURSI` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  `TANGGAL_PEMBAYARAN` datetime NOT NULL DEFAULT current_timestamp(),
  `TOTAL_PEMBAYARAN` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`ID_PEMBAYARAN`, `TANGGAL_PEMBAYARAN`, `TOTAL_PEMBAYARAN`) VALUES
(1, '2021-12-13 10:36:00', 380000),
(2, '2021-12-29 15:14:47', 85000),
(3, '2021-12-29 16:47:01', 1270000);

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
  `STATUS` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pemesanan`
--

INSERT INTO `pemesanan` (`ID_PEMESANAN`, `ID_BARANG`, `TIPE_PEMESANAN`, `JUMLAH_PEMESANAN`, `TANGGAL_PEMESANAN`, `TOTAL_TAGIHAN`, `STATUS`) VALUES
(10, 'MI001', 2, 2, '2021-12-01', 20000, 1),
(11, 'MI002', 2, 2, '2021-12-01', 110000, 1),
(12, 'MK001', 1, 2, '2021-12-01', 100000, 1),
(13, 'MK002', 1, 2, '2021-12-01', 150000, 1),
(14, 'MK002', 1, 1, '2021-12-29', 75000, 1),
(15, 'MI001', 2, 1, '2021-12-29', 10000, 1),
(16, 'MK001', 1, 3, '2021-12-29', 150000, 1),
(17, 'MI003', 2, 32, '2021-12-29', 1120000, 1);

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
('S002', 'dsf', 20, 'Dolby Atmos');

-- --------------------------------------------------------

--
-- Stand-in struktur untuk tampilan `v_jadwal`
-- (Lihat di bawah untuk tampilan aktual)
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
-- Struktur untuk view `v_jadwal`
--
DROP TABLE IF EXISTS `v_jadwal`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_jadwal`  AS SELECT `jadwal`.`ID_JADWAL` AS `ID_JADWAL`, `jadwal`.`ID_FILM` AS `ID_FILM`, `jadwal`.`ID_STUDIO` AS `ID_STUDIO`, `jadwal`.`TGL_JADWAL` AS `TGL_JADWAL`, `film`.`JUDUL_FILM` AS `JUDUL_FILM`, `film`.`DURASI_FILM` AS `DURASI_FILM`, `film`.`RATING_FILM` AS `RATING_FILM`, `studio`.`NAMA_STUDIO` AS `NAMA_STUDIO`, `studio`.`JENIS_STUDIO` AS `JENIS_STUDIO`, `studio`.`KAPASITAS_STUDIO` AS `KAPASITAS_STUDIO` FROM ((`jadwal` join `film` on(`jadwal`.`ID_FILM` = `film`.`ID_FILM`)) join `studio` on(`jadwal`.`ID_STUDIO` = `studio`.`ID_STUDIO`)) ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`ID_FILM`);

--
-- Indeks untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`ID_JADWAL`),
  ADD KEY `fr_jadwal_1` (`ID_FILM`),
  ADD KEY `fr_jadwal_2` (`ID_STUDIO`);

--
-- Indeks untuk tabel `kursi`
--
ALTER TABLE `kursi`
  ADD PRIMARY KEY (`ID_KURSI`);

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
-- Indeks untuk tabel `studio`
--
ALTER TABLE `studio`
  ADD KEY `ID_STUDIO` (`ID_STUDIO`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `kursi`
--
ALTER TABLE `kursi`
  MODIFY `ID_KURSI` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=42;

--
-- AUTO_INCREMENT untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  MODIFY `ID_PEMBAYARAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `pemesanan`
--
ALTER TABLE `pemesanan`
  MODIFY `ID_PEMESANAN` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `fr_jadwal_1` FOREIGN KEY (`ID_FILM`) REFERENCES `film` (`ID_FILM`),
  ADD CONSTRAINT `fr_jadwal_2` FOREIGN KEY (`ID_STUDIO`) REFERENCES `studio` (`ID_STUDIO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

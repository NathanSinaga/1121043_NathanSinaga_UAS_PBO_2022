-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 18 Nov 2022 pada 08.50
-- Versi server: 10.4.22-MariaDB
-- Versi PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_uas_1121043`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `categoryuser`
--

CREATE TABLE `categoryuser` (
  `categoryId` int(10) NOT NULL,
  `categoryName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `categoryuser`
--

INSERT INTO `categoryuser` (`categoryId`, `categoryName`) VALUES
(1, 'Aktif'),
(2, 'AFK'),
(3, 'Sleep');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `userId` int(10) NOT NULL,
  `userName` varchar(20) NOT NULL,
  `userEmail` varchar(20) NOT NULL,
  `userPassword` varchar(20) NOT NULL,
  `userGender` varchar(20) NOT NULL,
  `userCategory` int(10) NOT NULL,
  `userFollowers` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`userId`, `userName`, `userEmail`, `userPassword`, `userGender`, `userCategory`, `userFollowers`) VALUES
(1, 'Djoko', 'Djoko@gmail.com', 'Dpass', 'PRIA', 2, 0),
(2, 'Julian', 'Julian@gmail.com', 'Jpass', 'PRIA', 1, 0),
(3, 'Sandra', 'Sandra@gmail.com', 'Spass', 'WANITA', 1, 0);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `categoryuser`
--
ALTER TABLE `categoryuser`
  ADD PRIMARY KEY (`categoryId`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userId`),
  ADD UNIQUE KEY `userEmail` (`userEmail`),
  ADD KEY `userCategory` (`userCategory`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `categoryuser`
--
ALTER TABLE `categoryuser`
  MODIFY `categoryId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `userId` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`userCategory`) REFERENCES `categoryuser` (`categoryId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

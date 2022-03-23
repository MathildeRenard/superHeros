-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 23 mars 2022 à 01:24
-- Version du serveur : 10.4.22-MariaDB
-- Version de PHP : 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `superheros`
--

-- --------------------------------------------------------

--
-- Structure de la table `super_heros`
--

CREATE TABLE `super_heros` (
  `id_heros` int(11) NOT NULL,
  `localisation` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `telephone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `super_heros`
--

INSERT INTO `super_heros` (`id_heros`, `localisation`, `nom`, `telephone`) VALUES
(11, '49.526164,0.158818', 'Batman', 331),
(12, '43.179708,3.001266', 'Spiderman', 125),
(13, '43.757760,-0.573290', 'Superman', 261),
(14, '48.8760339494496,2.3470697657937407', 'Iron Man', 307),
(15, '48.87906719597665,2.3346460981046713', 'Aquaman', 138),
(16, '43.59860847333827,1.4342445979111946', 'Captain America', 294);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `super_heros`
--
ALTER TABLE `super_heros`
  ADD PRIMARY KEY (`id_heros`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `super_heros`
--
ALTER TABLE `super_heros`
  MODIFY `id_heros` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

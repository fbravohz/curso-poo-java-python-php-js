<?php

require_once("Car.php");
require_once("UberX.php");
require_once("Account.php");

$acc = new Account("Andres Herrera", "AND456");
$acc->printDataAccount();
$uberX = new UberX("CVB123", $acc, "Anunaki", "Kawasaki");
$uberX->printDataCar();
?>
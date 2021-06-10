import Dependencies._

ThisBuild / scalaVersion := "2.13.5"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github"
ThisBuild / organizationName := "kiendang"

lazy val root = (project in file("."))
  .settings(
    name := "Python Native Libs",
    libraryDependencies += scalaTest % Test
  )
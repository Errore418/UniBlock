ThisBuild / version := "0.0.1"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "UniBlock",
    idePackagePrefix := Some("it.unifi.nave.uniblock")
  )

libraryDependencies += "com.google.guava" % "guava" % "31.1-jre"

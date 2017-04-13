lazy val root = (project in file(".")).
  settings(
    name := "lru",
    version := "0.10",
    scalaVersion := "2.11.8"
  )
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.1" % "test"

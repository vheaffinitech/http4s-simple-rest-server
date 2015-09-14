organization := "affini-tech"
name := "simple-rest-server"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.11.7"

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "org.http4s" %% "http4s-blazeserver" % "0.8.4",
  "org.http4s" %% "http4s-dsl"         % "0.8.4"
)

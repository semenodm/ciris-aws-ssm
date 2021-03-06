organization := "com.ovoenergy"
bintrayOrganization := Some("ovotech")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.13.1"
crossScalaVersions := Seq(scalaVersion.value, "2.12.10")
releaseCrossBuild := true

libraryDependencies ++= Seq(
  "is.cir" %% "ciris" % "1.1.0",
  "software.amazon.awssdk" % "ssm" % "2.15.24"
)

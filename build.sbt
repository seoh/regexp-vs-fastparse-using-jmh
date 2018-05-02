
scalaVersion := "2.12.6"

enablePlugins(JmhPlugin)

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "fastparse" % "1.0.0",
  "com.lihaoyi" %% "utest" % "0.6.3" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")


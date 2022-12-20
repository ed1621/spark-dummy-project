name := "spark-problems"

lazy val commonSettings = Seq(
  organization := "com.pluralsight.plananalytics",
  version := "1.0",
  scalaVersion := "2.13.8",
  resolvers ++= Seq(
    "artifactory" at "https://repository.vnerd.com/artifactory/bounded-context/plan-analytics-shared/",
    "confluent" at "https://packages.confluent.io/maven/",
    "jitpack" at "https://jitpack.io",
    MavenRepo("confluent", "https://packages.confluent.io/maven/"),
    Resolver.sonatypeRepo("public")
  ),
  Runtime / fullClasspath := (Compile / run / fullClasspath).value,
  Test / fork := true,
  fork := true, //setting this to true allows us to use java options from the command line
  javaOptions ++= Seq("-Xms2048M", "-Xmx2048M")
)

val sparkVersion = "3.2.1"

val coreDeps = Seq(
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion,
  "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion,
)

val sharedOverrides = Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.3",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.3",
  "com.fasterxml.jackson.core" % "jackson-core" % "2.13.3",
  "org.scala-lang.modules" % "scala-xml_2.13" % "2.1.0"
)

val testUtilDeps = Seq(
  "org.scalatest" %% "scalatest" % "3.2.12" % Test exclude ("org.scala-lang.modules", "scala-xml_2.12")
)

lazy val root = (project in file("."))
  .settings(
    commonSettings ++ Seq(name := "neha"),
    libraryDependencies ++= coreDeps ++ testUtilDeps,
    dependencyOverrides ++= sharedOverrides
  )

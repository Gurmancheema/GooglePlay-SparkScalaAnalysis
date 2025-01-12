ThisBuild / scalaVersion := "2.12.17"

lazy val root = (project in file("."))
  .settings(
    name := "GooglePlay-SparkScalaAnalysis",
    version := "0.1.0",
    libraryDependencies ++= Seq(
      "org.apache.spark" %% "spark-sql" % "3.3.0",
      "com.crealytics" %% "spark-excel" % "0.13.5"
    )
  )

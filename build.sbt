name := "learning-scala"

version := "0.1"


////scalaVersion := "2.11.8"
////resolvers  += "MavenRepository" at "http://central.maven.org/maven2"
////val sparkVersion = "2.2.1"
////libraryDependencies ++= {
////  Seq( "org.apache.spark" %% "spark-core" % sparkVersion,
////       "org.apache.spark" %% "spark-sql" % sparkVersion
////  )
////}
//
//scalaVersion := "2.11.11"
//
//libraryDependencies ++= Seq(
//  "org.apache.spark" % "spark-core_2.11" % "2.2.0",
//  "org.apache.spark" % "spark-sql_2.11" % "2.2.0",
//  "org.apache.spark" % "spark-mllib_2.10" % "1.1.0"
//)


scalaVersion := "2.11.8"

val sparkVersion = "2.3.0"


resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "mysql" % "mysql-connector-java" % "5.1.6"
)
